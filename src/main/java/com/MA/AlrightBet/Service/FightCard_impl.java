package com.MA.AlrightBet.Service;

import com.MA.AlrightBet.Dao.AdminDao;
import com.MA.AlrightBet.Dao.BetDao;
import com.MA.AlrightBet.Dao.FightCardDao;
import com.MA.AlrightBet.Dao.UserDao;
import com.MA.AlrightBet.Entity.Admin;
import com.MA.AlrightBet.Entity.Bet;
import com.MA.AlrightBet.Entity.FightCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FightCard_impl implements FightCardService {
    @Autowired
    private AdminDao adminDao;

    @Autowired
    private UserDao userDao;

    @Autowired
    private BetDao betDao;

    @Autowired
    private FightCardDao fightCardDao;

    @Override
    public List<FightCard> fetch_all_fight_card() {
        return null;
    }

    @Override
    public FightCard create_fight_card() {
        return null;
    }

    @Override
    public void delete_fight_card() {

    }

    @Override
    public FightCard update_fight_card() {
        return null;
    }
}
