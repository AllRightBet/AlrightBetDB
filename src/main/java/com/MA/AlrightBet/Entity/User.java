package com.MA.AlrightBet.Entity;


import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "tbl_adminUsers")
public class User {
    @Id
    @Column(name = "pk")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String email;
    private String authProvider;
    private String username;
    private String payment_method;
    private String profilePic_uri;
    private String firstName;
    private String LastName;
    private String address;
    private String state;
    private String city;
    private int zip;
    private int age;
    private ArrayList<Bet> bet_history;






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
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
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










    public User( ) {

    }

    public User(int id, String email, String authProvider, String username) {
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
