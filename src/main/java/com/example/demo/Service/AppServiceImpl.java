package com.example.demo.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.AppRepository;
import com.example.demo.model.AppDetails;
@Service
public class AppServiceImpl implements AppService{
	private static final Logger logger = LoggerFactory.getLogger(AppServiceImpl.class);
	@Autowired
	private AppRepository appRepository;

	@Override
	public String insertAppDetails(AppDetails appDetails) {
		logger.info("App Details in Service Layer :: "+appDetails);
		appRepository.save(appDetails);
	
		return "App Details in Service Layer.";
	}

	@Override
	public AppDetails getAppDetailsBasedOnAppIdAndAppName(String appUserId, String appName) {
		AppDetails response = appRepository.findByAppUserIdAndAppName(appUserId,appName);
		return response;
	}

	
	}



