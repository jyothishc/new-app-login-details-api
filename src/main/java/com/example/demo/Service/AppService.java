package com.example.demo.Service;

import com.example.demo.model.AppDetails;

public interface AppService {
	
	public String insertAppDetails(AppDetails appDetails);


	public AppDetails getAppDetailsBasedOnAppIdAndAppName(String appUserId, String appName);

	

}
