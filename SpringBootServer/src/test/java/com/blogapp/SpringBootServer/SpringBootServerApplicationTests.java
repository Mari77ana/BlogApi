package com.blogapp.SpringBootServer;

import com.blogapp.SpringBootServer.dao.UsersDao;
import com.blogapp.SpringBootServer.entity.Users;
import jakarta.persistence.Id;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@SpringBootTest
class SpringBootServerApplicationTests {

	@Autowired // Get instance Dao
	private UsersDao usersDao;


	@Test
	void addUsersTest() {
		Users user = new Users();
		user.setName("Emilia");
		user.setEmail("Emilia@mail");
		user.setLastname("Wilton");
		user.setComment("Hello");
		user.setIsFavorite(true);
		usersDao.saveUser(user);
	}

	@Test
	void getAllUsers() {
		List<Users> users = usersDao.getAllUsers();
		System.out.println(users);

	}

	@Test
	void getAllUsersAndDelete() {
		List<Users> users = usersDao.getAllUsers();
		for (Users user: users){
			usersDao.deleteAllUsers(user);
		}
	}


}

