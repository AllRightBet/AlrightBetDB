package com.MA.AlrightBet.Dao;
import com.MA.AlrightBet.Entity.FightCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FightCardDao  extends JpaRepository<FightCard, Integer> {
}
