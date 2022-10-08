package com.example.demo.Service;

import java.util.Optional;

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

	@Override
	public String updateAppDetailsBasedOnAppPasswordAndMobileNumber(AppDetails appDetails, String appPassword,
			String mobileNumber) {
		logger.info("AppDetails:: "+appDetails);
		logger.info("AppPassword= "+appPassword+" MobileNumber= "+mobileNumber+" in Service Layer..");
		String response = null;
		AppDetails app = appRepository.findByAppPasswordAndMobileNumber(appPassword,mobileNumber);
		if(Optional.ofNullable(app).isPresent()) {
			app.setFirstName(appDetails.getFirstName());
			app.setSecondName(appDetails.getSecondName());
			 appRepository.save(app);
			 return response = "App details updated successfully based on app AppPassword"+appPassword+" mobileNumber "+mobileNumber;
		}else{
		return response = "we don't have any matching data with App Password "+appPassword+" Mobile Number "+mobileNumber;
	}

	}

	@Override
	public String deleteAppDetailsBasedOnAppIdAndAppName(int appId, String appName) {
		logger.info("App Id = "+appId +" AppName = "+appName+" in Service Layer..");
		appRepository.deleteByAppIdAndAppName(appId,appName);
		return "App data deleted based on app Id = "+appId+" and app Name = "+appName+".";
	}
	}

	
	



