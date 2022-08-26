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
public class Bet_impl implements BetService {

    @Autowired
    private BetDao betDao;
    @Autowired
    private FightCardDao fightCardDao;


    @Override
    public List<Bet> fetch_all_bets() {
        return this.betDao.findAll();
    }

    @Override
    public List<Bet> fetch_top_bets() {
        return this.betDao.listTopBets();
    }

    @Override
    public Bet getBetById(int id) {
        Optional<Bet> bet = this.betDao.findById(id);
        if (bet.isEmpty()) {
            return null;
        }
        return bet.get();
    }


    @Override
    public Bet create_bet(Bet bet) {
        Optional<FightCard> event = this.fightCardDao.findById(bet.getEvent().getId());
        if (event.isPresent()) {
            if (bet.getFavor_opponent() == 1) {
                event.get().getOpponent_1_bets().add(bet);
            } else if (bet.getFavor_opponent() == 2) {
                event.get().getOpponent_2_bets().add(bet);
            }
            this.fightCardDao.save(event.get());
        }
        return this.betDao.save(bet);
    }

    @Override
    public boolean delete_bet(int id) {
        Optional<Bet> q = this.betDao.findById(id);
        if (q.isPresent()) {
            this.betDao.deleteById(id);
            return true;
        } else return false;
    }

    @Override
    public Bet update_bet(Bet bet) {
        Optional<Bet> q = this.betDao.findById(bet.getId());
        if (q.isPresent()) {
            this.betDao.save(bet);
            return bet;
        }
        return null;
    }
}
