package com.blogapp.SpringBootServer.dao;

import com.blogapp.SpringBootServer.entity.Users;
import com.blogapp.SpringBootServer.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UsersDao {
    @Autowired // dependency injection
    private UsersRepository repository;

    public Users saveUser(Users user){  // change to return for response in Postman
        return repository.save(user);
    }

    public List<Users> getAllUsers(){
        List<Users> users = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(users::add);
        return users;
    }

    public void deleteAllUsers(Users user) {
        repository.delete(user);
    }
    public Users getUserById(int userId){
        return repository.findById(userId).orElse(null);
    }

    public void deleteUserById(int userId){
      repository.deleteById(userId);
    }



}
