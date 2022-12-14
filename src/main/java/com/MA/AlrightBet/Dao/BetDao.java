package com.MA.AlrightBet.Dao;

import com.MA.AlrightBet.Entity.Bet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BetDao extends JpaRepository<Bet, Integer> {
    @Query(value = "SELECT * FROM tbl_bets ORDER BY bet_amount DESC", nativeQuery = true)
    List<Bet> listTopBets();

    @Query(value = "SELECT * FROM tbl_bets WHERE voter_id=?" , nativeQuery = true)
    List<Bet> fetch_user_history(int user_id);
}
