package com.example.project1.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project1.controller.dto.UserDto;
import com.example.project1.entities.User;
import com.example.project1.repository.UserRepository;
@Service
public class UserServiceimpl implements UserService{
    @Autowired UserRepository repository;
    @Override
    public UserDto getUser(String userName,String password){
            User user =repository.findByUserName(userName);
            return new UserDto(user.getFirstName(), user.getLastName(), user.getUserName(), user.getPassWord());
            
            

    }
}
