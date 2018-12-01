package liu.hope.mydubzoo.controller;


import liu.hope.mydubzoo.base.BaseController;
import liu.hope.mydubzoo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;


@Controller
@RequestMapping("/user")
public class UserController extends BaseController {

    @Resource
    private UserService userService;

    @GetMapping("/login")
    public String login(){
        return "login/index";
    }

    @PostMapping("/login")
    public String login(@RequestParam(name = "username") String username, @RequestParam(name = "password")String password){
        boolean boo = userService.selectByUsername(username,password);
        return boo ? "login/success" : "login/failed";
    }

}
