package com.example.demo.Service;

import com.example.demo.model.AppDetails;

public interface AppService {
	
	public String insertAppDetails(AppDetails appDetails);


	public AppDetails getAppDetailsBasedOnAppIdAndAppName(String appUserId, String appName);
	
	public String updateAppDetailsBasedOnAppPasswordAndMobileNumber(AppDetails appDetails, String appPassword,
			String mobileNumber);


	public String deleteAppDetailsBasedOnAppIdAndAppName(int appId, String appName);
}
