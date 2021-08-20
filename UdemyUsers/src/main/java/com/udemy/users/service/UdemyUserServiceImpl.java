package com.udemy.users.service;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udemy.users.model.UdemyUser;
import com.udemy.users.repository.UdemyUserRepository;

@Service
public class UdemyUserServiceImpl implements UdemyUserService {

	@Autowired
	private UdemyUserRepository repository;

	@Override
	public Document updateUser(Document data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Document changePassword(Document data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteUser(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UdemyUser myProfile(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UdemyUser registerUser(Document data) {
		// TODO Auto-generated method stub
		UdemyUser newUser = new UdemyUser();
		newUser.setName(data.get("name").toString());
		newUser.setEmail(data.get("email").toString());
		newUser.setContact(data.getLong("contact"));
		newUser.setUserName(data.getString("userName"));
		newUser.setPassword(data.getString("password"));
		repository.save(newUser);
		return newUser;
	}

	@Override
	public UdemyUser loginUser(Document data) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
