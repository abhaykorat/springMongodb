package com.example.springMongodb.Service;

import com.example.springMongodb.Models.User;
import com.example.springMongodb.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public User getUser(){
        return userRepo.getUser();

    }
}
