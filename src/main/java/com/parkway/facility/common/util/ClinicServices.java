package com.parkway.facility.common.util;

import java.util.ArrayList;
import java.util.List;

public class ClinicServices {


	private List<String> children = new ArrayList<String>();
	private String parentName;
	
	public List<String> getChildren() {
		return children;
	}
	public void setChildren(List<String> children) {
		this.children = children;
	}
	public String getParentName() {
		return parentName;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	@Override
	public String toString() {
		return "ClinicServices [children=" + children + ", parentName=" + parentName + "]";
	}

}
