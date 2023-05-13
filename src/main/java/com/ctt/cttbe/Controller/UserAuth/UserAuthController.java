package com.ctt.cttbe.Controller.UserAuth;

import com.ctt.cttbe.Entity.UserAuth.UserAuth;
import com.ctt.cttbe.Service.UserAuth.UserAuthService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user-auth")
public class UserAuthController {

    private UserAuthService userAuthService;


    @PostMapping("/login")
    public void login() {

    }

    @PostMapping("/register")
    public void register(@RequestBody UserAuth TheUser) {



        UserAuth user = new UserAuth();
    }
}
