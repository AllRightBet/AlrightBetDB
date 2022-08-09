package com.MA.AlrightBet.Entity;


import javax.persistence.*;

@Entity
@Table(name = "tbl_adminUsers")
public class Admin {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String email;


    public Admin( ) {

    }

    public Admin(  String email, String authProvider, String username) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
