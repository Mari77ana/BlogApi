package com.blogapp.SpringBootServer.dao;

import com.blogapp.SpringBootServer.entity.Users;
import com.blogapp.SpringBootServer.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsersDao {
    @Autowired // dependency injection
    private UsersRepository repository;

    public void saveUser(Users user){
        repository.save(user);
    }

    public List<Users> getAllUsers(){
        List<Users> users = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(users::add);
        return users;

    }
    public void getUserById(int getUserId){
        repository.findById(getUserId);
    }

    public void deleteUserById(int userId){
      repository.deleteById(userId);
    }


    
}
