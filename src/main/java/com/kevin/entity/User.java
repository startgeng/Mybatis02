package com.kevin.entity;

public class User {
private String id;
private String password;
private UserInfo userInfo;
private Department department;

public Department getDepartment() {
	return department;
}
public void setDepartment(Department department) {
	this.department = department;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public UserInfo getUserInfo() {
	return userInfo;
}
public void setUserInfo(UserInfo userInfo) {
	this.userInfo = userInfo;
}

}
