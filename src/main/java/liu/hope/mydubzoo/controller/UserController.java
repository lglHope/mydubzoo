package liu.hope.mydubzoo.controller;


import liu.hope.mydubzoo.annotation.IsLogin;
import liu.hope.mydubzoo.base.BaseController;
import liu.hope.mydubzoo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
@RequestMapping("/user")
public class UserController extends BaseController {

    @Resource
    private UserService userService;

    @Resource
    private HttpServletRequest request;

    @Resource
    private HttpServletResponse response;


    @GetMapping("/login")
    public String login(){
        return "login/index";
    }


    @PostMapping("/login")
    public String login(@RequestParam(name = "username") String username, @RequestParam(name = "password")String password){
        Cookie cookie = new Cookie("TOKEN","7416d8cd-575b-441a-aa96-62dbf867494d");
        response.addCookie(cookie);
        boolean boo = userService.selectByUsername(username,password);
        return boo ? "login/success" : "login/failed";
    }

    @IsLogin
    @GetMapping("/login2")
    public String login2(){
        return "login/index";
    }

}
