package com.MA.AlrightBet.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class User_Controller {
    @GetMapping("/user")
    public String get_all( ) {
        return "users";
    }

}
