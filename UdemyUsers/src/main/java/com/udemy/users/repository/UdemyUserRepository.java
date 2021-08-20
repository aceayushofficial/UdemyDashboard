package com.udemy.users.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.udemy.users.model.UdemyUser;

public interface UdemyUserRepository extends MongoRepository<UdemyUser, String> {

}
