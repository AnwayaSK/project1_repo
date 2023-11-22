package com.example.project1.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_user")
public class User {
    private @Column(name = "id") @Id @GeneratedValue int id;
    private @Column(name = "firstname")String firstName;
    private @Column(name = "lastname")String lastName;
    private @Column(name = "username",unique = true) String userName;
    private @Column(name = "upassword")String passWord;
    User(){}
    public User(String firstName,String lastName,String userName,String passWord){
        this.firstName=firstName;
        this.lastName=lastName;
        this.userName=userName;
        this.passWord=passWord;

    }
    public int getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getUserName() {
        return userName;
    }
    public String getPassWord() {
        return passWord;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    
}
