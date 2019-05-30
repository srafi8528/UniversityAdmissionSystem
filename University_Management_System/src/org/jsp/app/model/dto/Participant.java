package org.jsp.app.model.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Participant 
{
	@Id
	private String rollNo;
	private String email;
	@OneToOne(cascade=CascadeType.ALL)
	private Application applicationID;
	private String sheduledprogramId;
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Application getApplicationID() {
		return applicationID;
	}
	public void setApplicationID(Application applicationID) {
		this.applicationID = applicationID;
	}
	public String getSheduledprogramId() {
		return sheduledprogramId;
	}
	public void setSheduledprogramId(String sheduledprogramId) {
		this.sheduledprogramId = sheduledprogramId;
	}
	
}
