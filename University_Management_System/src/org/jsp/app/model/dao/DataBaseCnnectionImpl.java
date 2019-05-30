package org.jsp.app.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.app.model.dto.Application;
import org.jsp.app.model.dto.Participant;
import org.jsp.app.model.dto.ProgramsOffered;
import org.jsp.app.model.dto.ProgramsScheduled;
import org.jsp.app.model.dto.Users;
import org.jsp.app.model.logics.GenerateApplicationId;
import org.jsp.app.model.logics.GenerateRollNumber;
import org.springframework.stereotype.Repository;
@Repository
public class DataBaseCnnectionImpl implements DataBaseConnection
{
	@Override
	public String scheduleProgramData(ProgramsScheduled programsScheduled) 
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("University_Management_System");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction(); 
		transaction.begin();
		try
		{
			manager.persist(programsScheduled);
			manager.getTransaction().commit();
			return "yes";
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			transaction.rollback();
		}
		manager.close();
		return "no";
	}

	@Override
	public String programsOffered(ProgramsOffered offered) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("University_Management_System");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction(); 
		transaction.begin();
		try
		{
			manager.persist(offered);
			manager.getTransaction().commit();
			return "yes";
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			transaction.rollback();
		}
		manager.close();
		return "no";
	}
	@Override
	public String applicationForm(Application application) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("University_Management_System");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction(); 
		transaction.begin();
		try
		{
			application.setApplicationId(Integer.toString(GenerateApplicationId.generateApplicationId()));
			application.setStatus("UnderVerfication");
			manager.persist(application);
			manager.getTransaction().commit();
			return "yes";
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			transaction.rollback();
		}
		manager.close();
		return "no";
	}

	@Override
	public String usersLogin(Users users) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("University_Management_System");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction(); 
		transaction.begin();
		System.out.println(users.getLoginId());
		try
		{
			Users user = manager.find(Users.class, users.getLoginId());
			System.out.println(user);
			if(user == null)
			{
				return "Invalid";
			}
			else if(user.getPassword().equals(users.getPassword()) && user.getRole().equals("admin"))
				{
					return "admin";
				}
			else if(user.getPassword().equals(users.getPassword()) && user.getRole().equals("mac"))
				{
					return "mac";
				}
			else 
			{
				return "wrong";
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		return null;
	}

	@Override
	public String deleteOfferedProgram(ProgramsOffered offered) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("University_Management_System");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction(); 
		transaction.begin();
		System.out.println(offered.getProgramName());
		try
		{
			ProgramsOffered offered2 = manager.find(ProgramsOffered.class, offered.getProgramName());
			manager.remove(offered2);
			transaction.commit();
			manager.clear();
			return "yes";
		}
		catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		transaction.commit();
		return "no";
	}

	@Override
	public String deleteScheduledProgram(ProgramsScheduled programsScheduled) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("University_Management_System");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction(); 
		transaction.begin();
		try
		{
			ProgramsScheduled programsScheduled2 = manager.find(ProgramsScheduled.class, programsScheduled.getScheduledProgramId());
			manager.remove(programsScheduled2);
			transaction.commit();
			manager.clear();
			return "yes";
		}
		catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		transaction.commit();
		return "no";
	}
	public static String confirmAddmission(String id)
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("University_Management_System");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction(); 
		transaction.begin();
		try
		{
			Application application = manager.find(Application.class, id);
			application.setStatus("Confirmed");
			Participant participant = new Participant();
			participant.setApplicationID(application);
			participant.setEmail(application.getEmailid());
			participant.setSheduledprogramId(application.getScheduledProgramId());
			participant.setRollNo(Integer.toString(GenerateRollNumber.generateRollNumber()));
			manager.persist(participant);
			transaction.commit();
			manager.clear();
			return "updated";
		}
		catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		transaction.commit();
		manager.clear();
		return "can't update";
	}

	@Override
	public String UpdateToAccept(Application application) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("University_Management_System");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction(); 
		transaction.begin();
		try
		{
			Application application1 = manager.find(Application.class, application.getApplicationId());
			application1.setStatus("Accepted");
			application1.setDateofInterview(application.getDateofInterview());
			transaction.commit();
			manager.clear();
			return "updated";
		}
		catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		transaction.commit();
		manager.clear();
		return "can't update";
	}

	@Override
	public String updateToReject(Application application) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("University_Management_System");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction(); 
		transaction.begin();
		try
		{
			Application application1 = manager.find(Application.class, application.getApplicationId());
			application1.setStatus("Rejected");
			transaction.commit();
			manager.clear();
			return "updated";
		}
		catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		transaction.commit();
		manager.clear();
		return "can't update";
	}
}