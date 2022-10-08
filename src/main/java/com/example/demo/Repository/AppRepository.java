package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.AppDetails;

@Repository
public interface AppRepository extends JpaRepository<AppDetails, Integer>{
	@Query(value= "select * from app where appUserId=:appUserId and appName=:appName", nativeQuery = true)
	AppDetails findByAppUserIdAndAppName(String appUserId, String appName);
	@Query(value = "select * from app where app_password=:appPassword and mobile_Number=:mobileNumber", nativeQuery = true)
	AppDetails findByAppPasswordAndMobileNumber(@Param ("appPassword")String appApssword,@Param("mobileNumber") String mobileNumber);
	@Query(value = "select * from app where app_id=:appId and app_name=:appName", nativeQuery = true)
	void deleteByAppIdAndAppName(@Param ("appId") int appId, @Param("appName") String appName);
}