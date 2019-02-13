package com.autoscan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hakimeNesh")
public class Physician {
	
	@Value("Dr Angelo Kulo")
	private String physName;
	@Value("DR0542")
	private String physId; 
	@Value("Emergency")
	private String physDept;
	
	public Physician(){
		
	}
	public Physician(String physName, String physId, String physDept) {
		super();
		this.physName = physName;
		this.physId = physId;
		this.physDept = physDept;
	}
	public String getPhysName() {
		return physName;
	}
	public void setPhysName(String physName) {
		this.physName = physName;
	}
	public String getPhysId() {
		return physId;
	}
	public void setPhysId(String physId) {
		this.physId = physId;
	}
	public String getPhysDept() {
		return physDept;
	}
	public void setPhysDept(String physDept) {
		this.physDept = physDept;
	}

}
