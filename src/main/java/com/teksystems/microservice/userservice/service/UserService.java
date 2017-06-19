package com.teksystems.microservice.userservice.service;

import org.springframework.stereotype.Service;

import com.teksystems.microservice.userservice.model.User;

@Service
public interface UserService {
	public User saveUser(User user);

	public boolean deleteUser(long id);

	public User getUserInfo(long id);

}
