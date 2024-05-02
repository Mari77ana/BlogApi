package com.blogapp.SpringBootServer.repository;

import com.blogapp.SpringBootServer.entity.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends CrudRepository<Users, Integer> {
}
