package com.MA.AlrightBet.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
    @JsonIgnore
    @ManyToMany(cascade = {CascadeType.ALL})
    private List<Bet> opponent_1_bets;
    @JsonIgnore
    @ManyToMany(cascade = {CascadeType.ALL})
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


    public FightCard() {
    }


    public FightCard(String opponent_1, String opponent_2, List<Bet> opponent_1_bets, List<Bet> opponent_2_bets) {
        this.opponent_1 = opponent_1;
        this.opponent_2 = opponent_2;
        this.opponent_1_bets = opponent_1_bets;
        this.opponent_2_bets = opponent_2_bets;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOpponent_1() {
        return opponent_1;
    }

    public void setOpponent_1(String opponent_1) {
        this.opponent_1 = opponent_1;
    }

    public String getOpponent_2() {
        return opponent_2;
    }

    public void setOpponent_2(String opponent_2) {
        this.opponent_2 = opponent_2;
    }

    public List<Bet> getOpponent_1_bets() {
        return opponent_1_bets;
    }

    public void setOpponent_1_bets(List<Bet> opponent_1_bets) {
        this.opponent_1_bets = opponent_1_bets;
    }

    public List<Bet> getOpponent_2_bets() {
        return opponent_2_bets;
    }

    public void setOpponent_2_bets(List<Bet> opponent_2_bets) {
        this.opponent_2_bets = opponent_2_bets;
    }
}
