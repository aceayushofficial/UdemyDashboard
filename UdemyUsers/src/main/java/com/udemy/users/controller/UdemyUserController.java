package com.udemy.users.controller;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.users.model.UdemyUser;
import com.udemy.users.service.UdemyUserService;

@RestController
@RequestMapping("udemy-users")
public class UdemyUserController {

	@Autowired
	private UdemyUserService service;

	@PostMapping("register")
	public UdemyUser registerUser(@RequestBody Document data) {
		return service.registerUser(data);
	}

	@PostMapping("login")
	public UdemyUser loginUser(@RequestBody Document data) throws Exception {
		return service.loginUser(data);
	}

	@PutMapping("update/contact")
	public Document updateUser(@RequestBody Document data) {
		return service.updateUser(data);
	}

	@PostMapping("change-password")
	public Document changePassword(@RequestBody Document data) {
		return service.changePassword(data);
	}

	@DeleteMapping("delete/{userName}")
	public String deleteUser(@PathVariable String userName) {
		return service.deleteUser(userName);
	}

	@GetMapping("my-profile/{userName}")
	public UdemyUser myProfile(@PathVariable String userName) {
		return service.myProfile(userName);
	}

}

//RegisterUser
//LoginUser
//UpdateUser
//changePassword
//DeleteUser
//courseDetails
