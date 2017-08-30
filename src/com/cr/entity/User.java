package com.cr.entity;

import java.io.Serializable;
import java.sql.Date;

public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	private int  userId;
   private String userName;
   private String userPwd;
   private String userRealname;
   private String userSex;
   private int userState;
   private Date lastLogin;
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(int userId, String userName, String userPwd, String userRealname,
		String userSex, int userState, Date lastLogin) {
	super();
	this.userId = userId;
	this.userName = userName;
	this.userPwd = userPwd;
	this.userRealname = userRealname;
	this.userSex = userSex;
	this.userState = userState;
	this.lastLogin = lastLogin;
}
@Override
public String toString() {
	return "User [userId=" + userId + ", userName=" + userName + ", userPwd="
			+ userPwd + ", userRealname=" + userRealname + ", userSex="
			+ userSex + ", userState=" + userState + ", lastLogin=" + lastLogin
			+ "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((lastLogin == null) ? 0 : lastLogin.hashCode());
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
	if (lastLogin == null) {
		if (other.lastLogin != null)
			return false;
	} else if (!lastLogin.equals(other.lastLogin))
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
