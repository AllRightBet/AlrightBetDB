package com.MA.AlrightBet.Controller;
import com.MA.AlrightBet.Entity.Admin;
import com.MA.AlrightBet.Entity.Bet;
import com.MA.AlrightBet.Entity.User;
import com.MA.AlrightBet.Service.BetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
public class Bet_Controller {

    @Autowired
    BetService betService;

    @GetMapping("/bet")
    public List<Bet> get_all() {
        return this.betService.fetch_all_bets();
    }

    @GetMapping("/user-history")
    public List<Bet> get_user_history(@RequestParam(value = "email", defaultValue = "null") String email) {
        return this.betService.fetch_user_history(email);
    }

    @GetMapping("/top-bets")
    public List<Bet> top_bets() {
        return this.betService.fetch_top_bets();
    }

    @GetMapping("/bet/{id}") // GET ID
    public Bet getByID(@PathVariable int id) {
        return this.betService.getBetById(id);
    }

    @PostMapping("/bet")
    public Bet create(@RequestBody Bet bet) {
        return this.betService.create_bet(bet);
    }

    @DeleteMapping("/bet/{id}")
    public boolean delete(@PathVariable int id) {
        return this.betService.delete_bet(id);
    }

    @PutMapping("/bet")
    public Bet update(@RequestBody Bet bet) {
        return this.betService.update_bet(bet);
    }




}
