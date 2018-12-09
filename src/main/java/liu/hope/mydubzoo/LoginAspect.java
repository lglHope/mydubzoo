package liu.hope.mydubzoo;

import liu.hope.mydubzoo.annotation.IsLogin;
import liu.hope.mydubzoo.pojo.User;
import liu.hope.mydubzoo.service.UserService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;

/**
 * Authou hope
 */
@Aspect
@Component
public class LoginAspect {

    @Resource
    private UserService userService;

//    @Pointcut("execution(* liu.hope.mydubzoo.controller..*(..))")
//    public void pointcut(){
//
//    }

    @Pointcut("@annotation(liu.hope.mydubzoo.annotation.IsLogin)")
    public void pointcut(){

    }

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();
        if (method.isAnnotationPresent(IsLogin.class)){
            // 验证是否登录
            if(!isLogin(request)){
                return "login/failed";
            }
        }
        return "login/failed";
    }

    private boolean isLogin(HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            if ("TOKEN".equals(cookie.getName())){
                String token = cookie.getValue();
                User user = userService.selectByToken(token);
                return user == null ? false:true;
            }
        }
        return false;
    }

}
