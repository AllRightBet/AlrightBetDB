package com.MA.AlrightBet.Entity;


import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "tbl_Users")
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double wallet_balance;
    private String email;
    private String password;
    private String authProvider;
    private String username;
    private String payment_method;
    private String profilePic_uri;
    private String firstName;
    private String lastName;
    private String address;
    private String state;
    private String city;
    private int zip;
    private int age;
    private boolean admin_role;
    private ArrayList<Bet> bet_history;




    public User() {
        this.wallet_balance = 0;
    }




    public User(String email, String authProvider, String username) {
        this.email = email;
        this.authProvider = authProvider;
        this.username = username;
        this.wallet_balance = 0;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public double getWallet_balance() {
        return wallet_balance;
    }

    public void setWallet_balance(double wallet_balance) {
        this.wallet_balance = wallet_balance;
    }


    public boolean isAdmin_role() {
        return admin_role;
    }

    public void setAdmin_role(boolean admin_role) {
        this.admin_role = admin_role;
    }


    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public String getProfilePic_uri() {
        return profilePic_uri;
    }

    public void setProfilePic_uri(String profilePic_uri) {
        this.profilePic_uri = profilePic_uri;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Bet> getBet_history() {
        return bet_history;
    }

    public void setBet_history(ArrayList<Bet> bet_history) {
        this.bet_history = bet_history;
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
