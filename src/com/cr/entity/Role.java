package com.cr.entity;

import java.io.Serializable;

public class Role implements Serializable{
	private static final long serialVersionUID = 1L;
	private int roleId;
	private String roleName;
	private int roleState;
	private String roleRight;
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Role(int roleId, String roleName, int roleState, String roleRight) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.roleState = roleState;
		this.roleRight = roleRight;
	}
	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", roleName=" + roleName
				+ ", roleState=" + roleState + ", roleRight=" + roleRight + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + roleId;
		result = prime * result
				+ ((roleName == null) ? 0 : roleName.hashCode());
		result = prime * result
				+ ((roleRight == null) ? 0 : roleRight.hashCode());
		result = prime * result + roleState;
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
		Role other = (Role) obj;
		if (roleId != other.roleId)
			return false;
		if (roleName == null) {
			if (other.roleName != null)
				return false;
		} else if (!roleName.equals(other.roleName))
			return false;
		if (roleRight == null) {
			if (other.roleRight != null)
				return false;
		} else if (!roleRight.equals(other.roleRight))
			return false;
		if (roleState != other.roleState)
			return false;
		return true;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public int getRoleState() {
		return roleState;
	}
	public void setRoleState(int roleState) {
		this.roleState = roleState;
	}
	public String getRoleRight() {
		return roleRight;
	}
	public void setRoleRight(String roleRight) {
		this.roleRight = roleRight;
	}
	
	
}
