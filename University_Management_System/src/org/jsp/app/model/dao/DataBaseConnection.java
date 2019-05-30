package org.jsp.app.model.dao;

import org.jsp.app.model.dto.Application;
import org.jsp.app.model.dto.ProgramsOffered;
import org.jsp.app.model.dto.ProgramsScheduled;
import org.jsp.app.model.dto.Users;
public interface DataBaseConnection 
{
	public String scheduleProgramData(ProgramsScheduled programsScheduled);
	public String programsOffered(ProgramsOffered offered);
	public String applicationForm(Application application);
	public String usersLogin(Users users);
	public String deleteOfferedProgram(ProgramsOffered offered);
	public String deleteScheduledProgram(ProgramsScheduled programsScheduled);
	public String UpdateToAccept(Application application);
	public String updateToReject(Application application);
}
