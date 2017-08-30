package com.cr.entity;

import java.io.Serializable;

//departId,departName,departState,isFatherNode,fatherNodeId,departBack

public class Depart implements Serializable{
 private int departId;
 private String departName;
 private int departState;
 private int isFatherNode;
 private int fatherNodeId;
 private String departBack;
public Depart() {
	super();
	// TODO Auto-generated constructor stub
}
public Depart(int departId, String departName, int departState,
		int isFatherNode, int fatherNodeId, String departBack) {
	super();
	this.departId = departId;
	this.departName = departName;
	this.departState = departState;
	this.isFatherNode = isFatherNode;
	this.fatherNodeId = fatherNodeId;
	this.departBack = departBack;
}
@Override
public String toString() {
	return "Depart [departId=" + departId + ", departName=" + departName
			+ ", departState=" + departState + ", isFatherNode=" + isFatherNode
			+ ", fatherNodeId=" + fatherNodeId + ", departBack=" + departBack
			+ "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result
			+ ((departBack == null) ? 0 : departBack.hashCode());
	result = prime * result + departId;
	result = prime * result
			+ ((departName == null) ? 0 : departName.hashCode());
	result = prime * result + departState;
	result = prime * result + fatherNodeId;
	result = prime * result + isFatherNode;
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
	Depart other = (Depart) obj;
	if (departBack == null) {
		if (other.departBack != null)
			return false;
	} else if (!departBack.equals(other.departBack))
		return false;
	if (departId != other.departId)
		return false;
	if (departName == null) {
		if (other.departName != null)
			return false;
	} else if (!departName.equals(other.departName))
		return false;
	if (departState != other.departState)
		return false;
	if (fatherNodeId != other.fatherNodeId)
		return false;
	if (isFatherNode != other.isFatherNode)
		return false;
	return true;
}
public int getDepartId() {
	return departId;
}
public void setDepartId(int departId) {
	this.departId = departId;
}
public String getDepartName() {
	return departName;
}
public void setDepartName(String departName) {
	this.departName = departName;
}
public int getDepartState() {
	return departState;
}
public void setDepartState(int departState) {
	this.departState = departState;
}
public int getIsFatherNode() {
	return isFatherNode;
}
public void setIsFatherNode(int isFatherNode) {
	this.isFatherNode = isFatherNode;
}
public int getFatherNodeId() {
	return fatherNodeId;
}
public void setFatherNodeId(int fatherNodeId) {
	this.fatherNodeId = fatherNodeId;
}
public String getDepartBack() {
	return departBack;
}
public void setDepartBack(String departBack) {
	this.departBack = departBack;
}
 
 
}
