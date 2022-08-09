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
import java.util.Optional;

@Service
public class FightCard_impl implements FightCardService {

    @Autowired
    private FightCardDao fightCardDao;


    @Override
    public List<FightCard> fetch_all_fight_card() {
        return this.fightCardDao.findAll();
    }

    @Override
    public FightCard getFightCardById(int id) {
        Optional<FightCard> fightCard = this.fightCardDao.findById(id);
        if (fightCard.isEmpty()) {
            return null;
        }
        return fightCard.get();
    }


    @Override
    public FightCard create_fight_card(FightCard fightCard) {
        return this.fightCardDao.save(fightCard);
    }

    @Override
    public boolean delete_fight_card(int id) {
        Optional<FightCard> q = this.fightCardDao.findById(id);
        if (q.isPresent()) {
            this.fightCardDao.deleteById(id);
            return true;
        }
            return false;
    }

    @Override
    public FightCard update_fight_card(FightCard fightCard) {
        Optional<FightCard> q = this.fightCardDao.findById(fightCard.getId());
        if (q.isPresent()) {
            this.fightCardDao.save(fightCard);
            return fightCard;
        }
        return null;
    }
}
