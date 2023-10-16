package com.kob.backend.controller.user.account;

import com.kob.backend.service.user.accout.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping("/user/account/token/")
    public Map<String, String> getToken(@RequestParam Map<String, String> map) {
        System.out.println(map.get("username") + map.get("password"));
        String username = map.get("username");
        String password = map.get("password");
        return loginService.getToken(username, password);
    }
}