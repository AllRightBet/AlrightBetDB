package com.MA.AlrightBet.Controller;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController("api/v1/User")
public class User_Controller {
    @GetMapping
    public String get_all(@AuthenticationPrincipal OAuth2User principal) {
        return "users";
    }

}