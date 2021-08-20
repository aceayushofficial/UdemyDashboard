package com.udemy.users.service;

import org.bson.Document;

import com.udemy.users.model.UdemyUser;

public interface UdemyUserService {

	String deleteUser(String userName);

	UdemyUser myProfile(String userName);

	UdemyUser registerUser(Document data);

	UdemyUser loginUser(Document data) throws Exception;

	Document updateUser(Document data);

	Document changePassword(Document data);

}
