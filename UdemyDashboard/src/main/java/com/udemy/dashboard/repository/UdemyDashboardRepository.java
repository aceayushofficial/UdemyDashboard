package com.udemy.dashboard.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.udemy.dashboard.model.UdemyDashboard;

@Repository
public interface UdemyDashboardRepository extends MongoRepository<UdemyDashboard, Long> {

}
