package com.MA.AlrightBet.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Admin_Controller {


    @GetMapping("/admin")
    public String get_all( ) {
        return "admin";
    }


}
