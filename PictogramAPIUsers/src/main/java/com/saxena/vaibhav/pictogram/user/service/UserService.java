package com.saxena.vaibhav.pictogram.user.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.saxena.vaibhav.pictogram.user.dto.UserDto;

public interface UserService extends UserDetailsService {

	public UserDto createUser(UserDto userDetails);
	
	UserDto getUserDetailsByEmail(String email);
}
