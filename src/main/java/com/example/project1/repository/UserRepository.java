package com.example.project1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project1.entities.User;


@Repository
public interface UserRepository extends JpaRepository<User,Integer>{
    public User findByUserName(String userName);
}
