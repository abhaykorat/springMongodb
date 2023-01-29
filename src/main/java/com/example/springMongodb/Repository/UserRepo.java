package com.example.springMongodb.Repository;

import com.example.springMongodb.Models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface UserRepo extends MongoRepository<User, String> {

    public default User getUser(){
        User user = new User("1","Abhay","abhay.korat.3@gmail.com","");

        return user;
    }
}
