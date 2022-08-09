package com.MA.AlrightBet.Controller;
import com.MA.AlrightBet.Entity.Bet;
import com.MA.AlrightBet.Entity.FightCard;
import com.MA.AlrightBet.Service.FightCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class FightCard_Controller {


    @Autowired
    FightCardService fightCardService;


    @GetMapping("/fight-card")
    public List<FightCard> get_all() {
        return this.fightCardService.fetch_all_fight_card();
    }

    @GetMapping("/fight-card/{id}") // GET ID
    public FightCard getByID(@PathVariable int id) {
        return this.fightCardService.getFightCardById(id);
    }

    @PostMapping("/fight-card")
    public FightCard create(@RequestBody FightCard fightCard) {
        return this.fightCardService.create_fight_card(fightCard);
    }

    @DeleteMapping("/fight-card/{id}")
    public boolean delete(@PathVariable int id) {
        return this.fightCardService.delete_fight_card(id);
    }

    @PutMapping("/fight-card")
    public FightCard update(@RequestBody FightCard fightCard) {
        return this.fightCardService.update_fight_card(fightCard);
    }

}
