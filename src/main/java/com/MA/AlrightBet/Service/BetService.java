package com.MA.AlrightBet.Service;


import com.MA.AlrightBet.Entity.Admin;
import com.MA.AlrightBet.Entity.Bet;

import java.util.List;

public interface BetService {
    public List<Bet> fetch_all_bets();
    public Bet create_bet();
    public void delete_bet();
    public Bet update_bet();
}
