package com.MA.AlrightBet.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FightCard_Controller {

    @GetMapping("/fight-card")
    public String get_all( ) {
        return "fight-card";
    }

}
