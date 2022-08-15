package com.MA.AlrightBet.Controller;

import com.MA.AlrightBet.Entity.Admin;
import com.MA.AlrightBet.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
public class Stripe_Credentials {

    @GetMapping("/stripe")
    public String serve_credentials() {
        return  "";
    }


}
