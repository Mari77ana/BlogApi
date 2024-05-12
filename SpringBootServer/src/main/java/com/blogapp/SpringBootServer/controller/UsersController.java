package com.blogapp.SpringBootServer.controller;

import com.blogapp.SpringBootServer.dao.UsersDao;
import com.blogapp.SpringBootServer.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsersController {

    @Autowired
    private UsersDao usersDao;

@GetMapping("/users/get-all")
    public List<Users> getAllUsers() {
    return usersDao.getAllUsers();

}

@PostMapping("/users/save")
public Users saveUsers(@RequestBody Users user){ // Changed to return for response in Postman
     return usersDao.saveUser(user);

}

}
