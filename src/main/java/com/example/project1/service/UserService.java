package com.example.project1.service;


import com.example.project1.controller.dto.UserDto;

public interface UserService {
    public UserDto getUser(String userName,String password);
}
