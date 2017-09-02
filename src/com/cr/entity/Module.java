package com.cr.entity;

import java.io.Serializable;

public class Module  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int moduleId;
	private String moduleName;
	private String moduleHref;
	private String moduleInfo;
	private int moduleState;
	public Module() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Module(int moduleId, String moduleName, String moduleHref,
			String moduleInfo, int moduleState) {
		super();
		this.moduleId = moduleId;
		this.moduleName = moduleName;
		this.moduleHref = moduleHref;
		this.moduleInfo = moduleInfo;
		this.moduleState = moduleState;
	}
	@Override
	public String toString() {
		return "Module [moduleId=" + moduleId + ", moduleName=" + moduleName
				+ ", moduleHref=" + moduleHref + ", moduleInfo=" + moduleInfo
				+ ", moduleState=" + moduleState + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((moduleHref == null) ? 0 : moduleHref.hashCode());
		result = prime * result + moduleId;
		result = prime * result
				+ ((moduleInfo == null) ? 0 : moduleInfo.hashCode());
		result = prime * result
				+ ((moduleName == null) ? 0 : moduleName.hashCode());
		result = prime * result + moduleState;
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
		Module other = (Module) obj;
		if (moduleHref == null) {
			if (other.moduleHref != null)
				return false;
		} else if (!moduleHref.equals(other.moduleHref))
			return false;
		if (moduleId != other.moduleId)
			return false;
		if (moduleInfo == null) {
			if (other.moduleInfo != null)
				return false;
		} else if (!moduleInfo.equals(other.moduleInfo))
			return false;
		if (moduleName == null) {
			if (other.moduleName != null)
				return false;
		} else if (!moduleName.equals(other.moduleName))
			return false;
		if (moduleState != other.moduleState)
			return false;
		return true;
	}
	public int getModuleId() {
		return moduleId;
	}
	public void setModuleId(int moduleId) {
		this.moduleId = moduleId;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public String getModuleHref() {
		return moduleHref;
	}
	public void setModuleHref(String moduleHref) {
		this.moduleHref = moduleHref;
	}
	public String getModuleInfo() {
		return moduleInfo;
	}
	public void setModuleInfo(String moduleInfo) {
		this.moduleInfo = moduleInfo;
	}
	public int getModuleState() {
		return moduleState;
	}
	public void setModuleState(int moduleState) {
		this.moduleState = moduleState;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
