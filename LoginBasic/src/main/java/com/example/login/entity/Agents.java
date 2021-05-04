package com.example.login.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Agents {

	@Id
	private long AGENT_CODE;
	private String AGENT_NAME;
	private String WORKING_AREA;
	private String COMMISSION;
	private String PHONE_NO;
	private String COUNTRY;
	public long getAGENT_CODE() {
		return AGENT_CODE;
	}
	public void setAGENT_CODE(long aGENT_CODE) {
		AGENT_CODE = aGENT_CODE;
	}
	public String getAGENT_NAME() {
		return AGENT_NAME;
	}
	public void setAGENT_NAME(String aGENT_NAME) {
		AGENT_NAME = aGENT_NAME;
	}
	public String getWORKING_AREA() {
		return WORKING_AREA;
	}
	public void setWORKING_AREA(String wORKING_AREA) {
		WORKING_AREA = wORKING_AREA;
	}
	public String getCOMMISSION() {
		return COMMISSION;
	}
	public void setCOMMISSION(String cOMMISSION) {
		COMMISSION = cOMMISSION;
	}
	public String getPHONE_NO() {
		return PHONE_NO;
	}
	public void setPHONE_NO(String pHONE_NO) {
		PHONE_NO = pHONE_NO;
	}
	public String getCOUNTRY() {
		return COUNTRY;
	}
	public void setCOUNTRY(String cOUNTRY) {
		COUNTRY = cOUNTRY;
	}
	
	
}
