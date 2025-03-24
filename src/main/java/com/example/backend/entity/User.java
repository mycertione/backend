package com.example.backend.entity;


import jakarta.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue
    private Long user_id;

    @Column(length = 64)
    private String email;

    private String password;
    @Column(length = 16)
    private String user_name;

    public User() {

    }

    public User(String email, String password, String user_name){
        this.email = email;
        this.password = password;
        this.user_name = user_name;
    }

    public Long getId(){
        return user_id;
    }

    public String getEmail() { return email; }
    public void setEmail(String email){this.email = email;}

    public String getPassword() {return password; }
    public void setPassword(String password) {this.password = password; }

    public String getUserName() {return user_name; }
    public void setUserName(String userName) {this.user_name = userName; }

}
