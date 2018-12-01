package liu.hope.mydubzoo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Authou hope
 */
@Aspect
@Component
public class LoginAspect {

    @Pointcut("@annotation(liu.hope.mydubzoo.annotation.IsLogin)")
    public void pointcut(){

    }

    @Before("pointcut()")
    public void doBefore(){

    }

}
