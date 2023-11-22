package com.example.project1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.project1.service.UserServiceimpl;

@RestController
public class UserController {
    @Autowired UserServiceimpl userservice;
    @GetMapping("/login")
    public String userLogin(@RequestParam(required = true) String userName,@RequestParam(required = true) String password){
        if(userservice.getUser(userName, password).getPassWord()==password){
            return "Welcome "+userservice.getUser(userName, password).getFirstName();
        }
        else{
        return "Incorrect password";}
    }
}
