package com.example.project1.controller.dto;

public class UserDto {
    private String firstName;
    private String lastName;
    private String userName;
    private String passWord;
    UserDto(){}
    public UserDto(String firstName,String lastName,String userName,String passWord){
        this.firstName=firstName;
        this.lastName=lastName;
        this.userName=userName;
        this.passWord=passWord;

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
