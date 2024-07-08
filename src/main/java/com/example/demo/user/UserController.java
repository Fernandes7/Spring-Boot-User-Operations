package com.example.demo.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/users")
public class UserController {
     
    @Autowired
    private UserServices userServices;
    
    @PostMapping("/create")
    public User creatUser(@RequestBody User user){
            System.out.println(user);
            return userServices.createUser(user);
    }
    
    @GetMapping("/view")
    public List<User> getusers() {
        return userServices.getallUsers();
    }
    
    
}
