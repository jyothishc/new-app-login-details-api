package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.AppDetails;

@Repository
public interface AppRepository extends JpaRepository<AppDetails, Integer>{
	@Query(value= "select * from app where app_user_id=jyotheesh3 and app_name=pubg", nativeQuery = true)
	AppDetails findByAppUserIdAndAppName(String appUserId, String appName);

}