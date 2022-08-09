package com.MA.AlrightBet.Service;


import com.MA.AlrightBet.Entity.Admin;
import com.MA.AlrightBet.Entity.FightCard;

import java.util.List;

public interface FightCardService {
    public List<FightCard> fetch_all_fight_card();
    public FightCard create_fight_card();
    public void delete_fight_card();
    public FightCard update_fight_card();
}
