package com.example.springMongodb.Resource;

import com.example.springMongodb.Exception.RestrictedInfoException;
import com.example.springMongodb.Models.User;
import com.example.springMongodb.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/users")
public class UserResource {
    @Autowired
    private UserService userService;
    @PostMapping
    public User saveUser(@RequestBody @Valid User user) throws RestrictedInfoException {
        if(user.getName().equalsIgnoreCase("root")){
            throw new RestrictedInfoException();
        }
        return userService.saveUser(user);
    }


    @GetMapping("/get-all")
    public List<User> getallUsers(){
        return userService.getallUsers();
    }

    @GetMapping
    public User getUserById(@RequestParam(name = "userId") String userId){
        return userService.getUserById(userId);
    }



    @PutMapping
    public User updateUser(@RequestBody @Valid User user){
        return userService.updateUser(user);
    }

    @DeleteMapping
    public void deleteUser(@RequestParam(name = "userId") String userId){
        userService.deleteUser(userId);
    }

}
