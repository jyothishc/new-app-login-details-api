package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.AppService;
import com.example.demo.model.AppDetails;
@RestController
@RequestMapping("/api")
public class AppController {
	private final Logger logger = LoggerFactory.getLogger(AppController.class);
	@Autowired
	private AppService appService;
	@PostMapping("/app-details")
	public String addAppDetails(@RequestBody AppDetails appDetails) {
		logger.info("App Details :: "+appDetails);
		String response = "App data successfully inserted.";
		return response;
	}
	@PostMapping("/add-app-data")
	public String insertAppDetails(@RequestBody AppDetails appDetails) {
		logger.info("App Details in Controller Layer:: "+appDetails);
		String response = appService.insertAppDetails(appDetails);
		return response;
	}
	@GetMapping("/get-app-data-based-on-appUserIdandappName/{appUserId}/{appName}")
	public AppDetails getappDetailsbasedOnAppIdAndAppName(@PathVariable String appUserId,@PathVariable String appName) {
		logger.info("AppUserId = "+appUserId +"AppName = "+appName+"in Controller layer..");
		AppDetails response = appService.getAppDetailsBasedOnAppIdAndAppName(appUserId,appName);
		return response;
	}
	@PutMapping("/update-app-data/{appPassword}/{mobileNumber}")
	public String updateappDetailsBasedOnAppPasswordAndMobileNumber(@RequestBody AppDetails appDetails,@PathVariable String appPassword, @PathVariable String mobileNumber) {
		logger.info("AppDetails:: "+appDetails);
		logger.info("AppPassword = "+appPassword +"MobileNumber = "+mobileNumber+" in Controller Layer..");
		String response = appService.updateAppDetailsBasedOnAppPasswordAndMobileNumber(appDetails, appPassword, mobileNumber);
		return response;
	} 
	@DeleteMapping("/delete-app-data/{appId}/{appName}")
	public String deleteAppDetailsBasedOnAppIdAndAppName(@PathVariable int appId, @PathVariable String appName) {
		logger.info("AppId = "+appId +" AppName = "+appName+" in Controller Layer ..");
		return appService.deleteAppDetailsBasedOnAppIdAndAppName(appId, appName);
	}
	}


