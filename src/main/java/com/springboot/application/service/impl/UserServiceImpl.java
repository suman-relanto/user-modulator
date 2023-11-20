package com.springboot.application.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.springboot.application.model.Users;
import com.springboot.application.repository.UserRepository;
import com.springboot.application.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<Users> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public void saveUser(Users user) {
		// TODO Auto-generated method stub
		this.userRepository.save(user);
	}

	@Override
	public Users getUsersById(long id) {
		Optional<Users> optional = userRepository.findById(id);
		Users employee = null;
		if (optional.isPresent()) {
			employee = optional.get();
		} else {
			throw new RuntimeException(" User not found for id :: " + id);
		}
		return employee;
	}

	@Override
	public void deleteUserById(long id) {
		// TODO Auto-generated method stub
		this.userRepository.deleteById(id);
	}

	@Override
	public Page<Users> findPaginated(int pageNo, int pageSize) {
		Pageable pageable = PageRequest.of(pageNo - 1, pageSize);
		return this.userRepository.findAll(pageable);

	}

}
