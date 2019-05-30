package org.jsp.app.model.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Application 
{
	@Id
	private String applicationId;
	private String fullName;
	private String dateOfBirth;
	private String highestQualification;
	private String marksObtained;
	private String goals;
	private String emailid;
	private String scheduledProgramId;
	private String Status;
	private String dateofInterview;
	public String getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getHighestQualification() {
		return highestQualification;
	}
	public void setHighestQualification(String highestQualification) {
		this.highestQualification = highestQualification;
	}
	public String getMarksObtained() {
		return marksObtained;
	}
	public void setMarksObtained(String marksObtained) {
		this.marksObtained = marksObtained;
	}
	public String getGoals() {
		return goals;
	}
	public void setGoals(String goals) {
		this.goals = goals;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getScheduledProgramId() {
		return scheduledProgramId;
	}
	public void setScheduledProgramId(String scheduledProgramId) {
		this.scheduledProgramId = scheduledProgramId;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getDateofInterview() {
		return dateofInterview;
	}
	public void setDateofInterview(String dateofInterview) {
		this.dateofInterview = dateofInterview;
	}
	
}
