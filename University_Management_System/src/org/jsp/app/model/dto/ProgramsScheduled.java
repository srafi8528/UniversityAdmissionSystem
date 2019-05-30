package org.jsp.app.model.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class ProgramsScheduled 
{
	@Id
	private String scheduledProgramId;
	private String programName;
	private String location;
	private String startDate;
	private String endDate;
	private String sessionsPerWeek;
	
	public String getScheduledProgramId() {
		return scheduledProgramId;
	}
	public void setScheduledProgramId(String scheduledProgramId) {
		this.scheduledProgramId = scheduledProgramId;
	}
	public String getProgramName() {
		return programName;
	}
	public void setProgramName(String programName) {
		this.programName = programName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getSessionsPerWeek() {
		return sessionsPerWeek;
	}
	public void setSessionsPerWeek(String sessionsPerWeek) {
		this.sessionsPerWeek = sessionsPerWeek;
	}
}
