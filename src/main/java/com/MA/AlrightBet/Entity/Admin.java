package com.MA.AlrightBet.Entity;


import javax.persistence.*;

@Entity
@Table(name = "tbl_admin_users")
public class Admin {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String email;


    public Admin() {

    }

    public Admin(String email, String authProvider ) {
        this.email = email;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
