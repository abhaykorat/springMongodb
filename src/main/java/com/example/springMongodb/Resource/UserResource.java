package com.example.springMongodb.Resource;

import com.example.springMongodb.Models.User;
import com.example.springMongodb.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserResource {
    @Autowired
    private UserService userService;
    @PostMapping
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @GetMapping("/getall")
    public List<User> getallUsers(){
        return userService.getallUsers();
    }

    @GetMapping
    public List<User> getUserById(@RequestParam(name = "userId") User userId){
        return userService.getUserById(userId);
    }
    @PutMapping
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    @DeleteMapping
    public void deleteUser(@RequestParam(name = "userId") String userId){
        userService.deleteUser(userId);
    }

}
