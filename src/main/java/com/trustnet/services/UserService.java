package com.trustnet.services;

import java.util.List;

import com.trustnet.dto.UserDto;
import com.trustnet.entity.User;

public interface UserService {

	User save(UserDto user);

	List<User> findAll();

	void delete(int id);

	User findOne(String username);

	User findById(int id);

	UserDto update(UserDto userDto);
}