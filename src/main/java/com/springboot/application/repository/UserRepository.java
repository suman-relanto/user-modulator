package com.springboot.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.application.model.Users;

public interface UserRepository extends JpaRepository<Users, Long> {

}
