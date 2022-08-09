package com.MA.AlrightBet.Dao;
import com.MA.AlrightBet.Entity.Bet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BetDao  extends JpaRepository<Bet, Integer> {
}
