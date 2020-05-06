package com.saxena.vaibhav.pictogram.user.rest.controller;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saxena.vaibhav.pictogram.user.dto.UserDto;
import com.saxena.vaibhav.pictogram.user.rest.request.CreateUserRequest;
import com.saxena.vaibhav.pictogram.user.rest.response.CreateUserResponse;
import com.saxena.vaibhav.pictogram.user.service.UserService;

@RestController
@RequestMapping("/api/v1/users")
public class UsersRestController {
	
	@Autowired
	private Environment env;
	
	@Autowired
	private UserService userService;

	@GetMapping("/status/check")
	public String status() {
		return "Working on port " + env.getProperty("local.server.port");	
	}
	
	@PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE },
			     produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<CreateUserResponse> createUser(@Valid @RequestBody CreateUserRequest request) {
		ModelMapper mapper = new ModelMapper();
		UserDto userDto = mapper.map(request,  UserDto.class);
		UserDto createdUser = userService.createUser(userDto);
		CreateUserResponse model = mapper.map(createdUser, CreateUserResponse.class);
		return ResponseEntity.status(HttpStatus.CREATED).body(model);
	}
}
