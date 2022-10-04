package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "app")
public class AppDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int appId;
	private String appName;
	private String appUserId;
	private String appPassword;
	private String firstName;
	private String secondName;
	private String mobileNumber;
	
	public AppDetails() {
		
	}
	public AppDetails(int appId, String appName, String appUserId, String appPassword, String firstName,
			String secondName, String mobileNumber) {
		this.appId = appId;
		this.appName = appName;
		this.appUserId = appUserId;
		this.appPassword = appPassword;
		this.firstName = firstName;
		this.secondName = secondName;
		this.mobileNumber = mobileNumber;
	}
	public int getAppId() {
		return appId;
	}
	public void setAppId(int appId) {
		this.appId = appId;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getAppUserId() {
		return appUserId;
	}
	public void setAppUserId(String appUserId) {
		this.appUserId = appUserId;
	}
	public String getAppPassword() {
		return appPassword;
	}
	public void setAppPassword(String appPassword) {
		this.appPassword = appPassword;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "AppDetails [appId=" + appId + ", appName=" + appName + ", appUserId=" + appUserId + ", appPassword="
				+ appPassword + ", firstName=" + firstName + ", secondName=" + secondName + ", mobileNumber="
				+ mobileNumber + "]";
	}
	
	

}
