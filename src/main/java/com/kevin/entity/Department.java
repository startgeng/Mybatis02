package com.kevin.entity;

import java.util.List;

public class Department {
private String id;
private String departmentName;
private List<UserInfo> userInfos;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getDepartmentName() {
	return departmentName;
}
public void setDepartmentName(String departmentName) {
	this.departmentName = departmentName;
}
public List<UserInfo> getUserInfos() {
	return userInfos;
}
public void setUserInfos(List<UserInfo> userInfos) {
	this.userInfos = userInfos;
}

}
