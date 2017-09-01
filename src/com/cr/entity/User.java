package com.cr.entity;

import java.io.Serializable;
import java.sql.Date;

public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	private int  userId;
	private int departId;
	private int roleId;
   private String userName;
   private String userPwd;
   private String userRealname;
   private String userEmail;
   private String userSex;
   private int userState;
   private Date lastLogin;
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(int userId, int departId, int roleId, String userName,
		String userPwd, String userRealname, String userEmail, String userSex,
		int userState, Date lastLogin) {
	super();
	this.userId = userId;
	this.departId = departId;
	this.roleId = roleId;
	this.userName = userName;
	this.userPwd = userPwd;
	this.userRealname = userRealname;
	this.userEmail = userEmail;
	this.userSex = userSex;
	this.userState = userState;
	this.lastLogin = lastLogin;
}
@Override
public String toString() {
	return "User [userId=" + userId + ", departId=" + departId + ", roleId="
			+ roleId + ", userName=" + userName + ", userPwd=" + userPwd
			+ ", userRealname=" + userRealname + ", userEmail=" + userEmail
			+ ", userSex=" + userSex + ", userState=" + userState
			+ ", lastLogin=" + lastLogin + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + departId;
	result = prime * result + ((lastLogin == null) ? 0 : lastLogin.hashCode());
	result = prime * result + roleId;
	result = prime * result + ((userEmail == null) ? 0 : userEmail.hashCode());
	result = prime * result + userId;
	result = prime * result + ((userName == null) ? 0 : userName.hashCode());
	result = prime * result + ((userPwd == null) ? 0 : userPwd.hashCode());
	result = prime * result
			+ ((userRealname == null) ? 0 : userRealname.hashCode());
	result = prime * result + ((userSex == null) ? 0 : userSex.hashCode());
	result = prime * result + userState;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	User other = (User) obj;
	if (departId != other.departId)
		return false;
	if (lastLogin == null) {
		if (other.lastLogin != null)
			return false;
	} else if (!lastLogin.equals(other.lastLogin))
		return false;
	if (roleId != other.roleId)
		return false;
	if (userEmail == null) {
		if (other.userEmail != null)
			return false;
	} else if (!userEmail.equals(other.userEmail))
		return false;
	if (userId != other.userId)
		return false;
	if (userName == null) {
		if (other.userName != null)
			return false;
	} else if (!userName.equals(other.userName))
		return false;
	if (userPwd == null) {
		if (other.userPwd != null)
			return false;
	} else if (!userPwd.equals(other.userPwd))
		return false;
	if (userRealname == null) {
		if (other.userRealname != null)
			return false;
	} else if (!userRealname.equals(other.userRealname))
		return false;
	if (userSex == null) {
		if (other.userSex != null)
			return false;
	} else if (!userSex.equals(other.userSex))
		return false;
	if (userState != other.userState)
		return false;
	return true;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public int getDepartId() {
	return departId;
}
public void setDepartId(int departId) {
	this.departId = departId;
}
public int getRoleId() {
	return roleId;
}
public void setRoleId(int roleId) {
	this.roleId = roleId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getUserPwd() {
	return userPwd;
}
public void setUserPwd(String userPwd) {
	this.userPwd = userPwd;
}
public String getUserRealname() {
	return userRealname;
}
public void setUserRealname(String userRealname) {
	this.userRealname = userRealname;
}
public String getUserEmail() {
	return userEmail;
}
public void setUserEmail(String userEmail) {
	this.userEmail = userEmail;
}
public String getUserSex() {
	return userSex;
}
public void setUserSex(String userSex) {
	this.userSex = userSex;
}
public int getUserState() {
	return userState;
}
public void setUserState(int userState) {
	this.userState = userState;
}
public Date getLastLogin() {
	return lastLogin;
}
public void setLastLogin(Date lastLogin) {
	this.lastLogin = lastLogin;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}


   
}
