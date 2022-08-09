package com.MA.AlrightBet.Entity;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "tbl_FightCards")
public class FightCard {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    //NAMES OF COMPETITOR
    private String opponent_1;
    private String opponent_2;

    //VOTES OF COMPETITORS
    private List<Bet> opponent_1_bets;
    private List<Bet> opponent_2_bets;



    //    //STATS OF COMPETITORS
    //    private int opponent_1_height;
    //    private int opponent_1_wins;
    //    private int opponent_1_losses;
    //
    //    private int opponent_2_height;
    //    private int opponent_2_wins;
    //    private int opponent_2_losses;
    //


}
