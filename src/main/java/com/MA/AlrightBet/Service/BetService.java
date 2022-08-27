package com.MA.AlrightBet.Service;


import com.MA.AlrightBet.Entity.Admin;
import com.MA.AlrightBet.Entity.Bet;
import com.MA.AlrightBet.Entity.User;

import java.util.List;

public interface BetService {
    public List<Bet> fetch_all_bets();
    public List<Bet> fetch_user_history(String email);
    public List<Bet> fetch_top_bets();
    public Bet getBetById(int id);
    public Bet create_bet(Bet bet);
    public boolean delete_bet(int id);
    public Bet update_bet(Bet bet);
}
