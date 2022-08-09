package com.MA.AlrightBet.Entity;


import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
@Table(name = "tbl_Bets")
public class Bet {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private double bet_amount;

    private String favor_opponent;

    @OneToOne
    private User voter;
    @OneToOne
    private FightCard event;


    public Bet( ) {
    }
    public Bet(double bet_amount, User voter, FightCard event) {
        this.bet_amount = bet_amount;
        this.voter = voter;
        this.event = event;
    }


    public String getFavor_opponent() {
        return favor_opponent;
    }

    public void setFavor_opponent(String favor_opponent) {
        this.favor_opponent = favor_opponent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBet_amount() {
        return bet_amount;
    }

    public void setBet_amount(double bet_amount) {
        this.bet_amount = bet_amount;
    }

    public User getVoter() {
        return voter;
    }

    public void setVoter(User voter) {
        this.voter = voter;
    }

    public FightCard getEvent() {
        return event;
    }

    public void setEvent(FightCard event) {
        this.event = event;
    }
}
