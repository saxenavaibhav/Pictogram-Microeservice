package com.saxena.vaibhav.pictogram.account.resr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountRestController {
	
	@GetMapping("/status/check")
	public String status() {
		return "WORKING";
	}
}
