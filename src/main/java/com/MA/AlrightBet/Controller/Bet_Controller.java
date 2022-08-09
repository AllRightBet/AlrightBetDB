package com.MA.AlrightBet.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Bet_Controller {

    @GetMapping("/bet")
    public String get_all( ) {
        return "bet";
    }


}
