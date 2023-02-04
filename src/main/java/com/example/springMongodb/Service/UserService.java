package com.example.springMongodb.Service;

import com.example.springMongodb.Models.User;
import com.example.springMongodb.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user){
        return userRepository.save(user);
    }

    public List<User> getallUsers() {
        return userRepository.findAll();
    }

    public List<User> getUserById(User userId) {
        Example<User> u = Example.of(userId);
        return userRepository.findAll(u);
    }

    public User updateUser(User user){
        return userRepository.save(user);
    }

    public void deleteUser(String userId){
        userRepository.deleteById(userId);
    }


}
