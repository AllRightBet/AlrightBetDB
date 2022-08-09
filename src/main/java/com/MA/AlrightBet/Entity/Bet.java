package com.MA.AlrightBet.Entity;


import javax.persistence.*;

@Entity
@Table(name = "tbl_Bets")
public class Bet {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private double bet_amount;
    private User voter;
    private FightCard event;

}
