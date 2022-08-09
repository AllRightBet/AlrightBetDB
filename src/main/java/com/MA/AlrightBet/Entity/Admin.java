package com.MA.AlrightBet.Entity;


import javax.persistence.*;

@Entity
@Table(name = "tbl_adminUsers")
public class Admin {
    @Id
    @Column(name = "pk")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String email;

    private String authProvider;

    private String username;


    public Admin( ) {

    }

    public Admin(int id, String email, String authProvider, String username) {
        this.id = id;
        this.email = email;
        this.authProvider = authProvider;
        this.username = username;
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

    public String getAuthProvider() {
        return authProvider;
    }

    public void setAuthProvider(String authProvider) {
        this.authProvider = authProvider;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
