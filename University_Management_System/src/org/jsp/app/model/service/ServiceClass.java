package org.jsp.app.model.service;

import org.jsp.app.model.dao.DataBaseConnection;
import org.jsp.app.model.dto.Application;
import org.jsp.app.model.dto.ProgramsOffered;
import org.jsp.app.model.dto.ProgramsScheduled;
import org.jsp.app.model.dto.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceClass 
{
	@Autowired
	private DataBaseConnection connection;
	String data;
	public String scheduleProgramService(ProgramsScheduled programsScheduled)
	{
		return data = connection.scheduleProgramData(programsScheduled);
	}
	public String programsOfferedByUniversity(ProgramsOffered offered)
	{
		return data = connection.programsOffered(offered);
	}
	public String applicationFormUniversity(Application application)
	{
		return data = connection.applicationForm(application);
	}
	public String userLogin(Users users)
	{
		return data = connection.usersLogin(users);
	}
	public String delete(ProgramsOffered offered)
	{
		return data = connection.deleteOfferedProgram(offered);
	}
	public String deleteSchedule(ProgramsScheduled programsScheduled)
	{
		return data = connection.deleteScheduledProgram(programsScheduled);
	}
	public String updateStatusToAccept(Application application)
	{
		return data = connection.UpdateToAccept(application);
	}
	public String updateStatusToReject(Application application)
	{
		return data = connection.updateToReject(application);
		
	}
}
