package com.springboot.application.service;

import java.util.List;

import org.springframework.data.domain.Page;
import com.springboot.application.model.Users;

public interface UserService {
	List<Users> getAllUsers();

	void saveUser(Users user);

	Users getUsersById(long id);

	void deleteUserById(long id);

	Page<Users> findPaginated(int pageNo, int pageSize);
}
