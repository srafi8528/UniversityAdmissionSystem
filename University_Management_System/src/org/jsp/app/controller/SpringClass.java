package org.jsp.app.controller;

import org.jsp.app.model.dao.DataBaseCnnectionImpl;
import org.jsp.app.model.dto.Application;
import org.jsp.app.model.dto.ProgramsOffered;
import org.jsp.app.model.dto.ProgramsScheduled;
import org.jsp.app.model.dto.Users;
import org.jsp.app.model.service.ServiceClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringClass 
{
	@Autowired
	ServiceClass serviceClass;
	@RequestMapping(value = "/view/scheduleProgram", method = RequestMethod.POST)
	public ModelAndView scheduleProgram(@ModelAttribute ProgramsScheduled programsScheduled)
	{
		System.out.println(programsScheduled.getScheduledProgramId());
		System.out.println(programsScheduled.getLocation());
		ModelAndView modelAndView; 
		String result = serviceClass.scheduleProgramService(programsScheduled);
		if("yes".equals(result))
		{
			modelAndView = new ModelAndView("result","data",result);
		}
		else
		{
			modelAndView = new ModelAndView("result","data","No");
		}
		return modelAndView;
	}
	@RequestMapping(value = "/view/programsOffered",method=RequestMethod.POST)
	public ModelAndView programsOffered(@ModelAttribute ProgramsOffered programsOffered)
	{
		ModelAndView modelAndView;
		String result = serviceClass.programsOfferedByUniversity(programsOffered);
		if("yes".equals(result))
		{
			modelAndView = new ModelAndView("result","data",result);
		}
		else
		{
			modelAndView = new ModelAndView("result","data","no");
		}
		return modelAndView;
	}
	@RequestMapping(value="/view/applicationForm", method = RequestMethod.POST)
	public ModelAndView applicationForm(@ModelAttribute Application application)
	{
		ModelAndView modelAndView;
		String result = serviceClass.applicationFormUniversity(application);
		String appId = application.getApplicationId();
		if("yes".equals(result))
		{
			modelAndView = new ModelAndView("appIdview","data","your Application Id is " + appId);
		}
		else
		{
			modelAndView = new ModelAndView("appIdview","data","notUpdated");
		}
		return modelAndView;
	}
	@RequestMapping(value = "/view/login", method = RequestMethod.POST)
	public ModelAndView login(Users user)
	{	
		ModelAndView modelAndView=null;
		String status = serviceClass.userLogin(user);
		if(status.equals("Invalid")) 
		{
			modelAndView = new ModelAndView("login","data","Ivalid Username");
		}	
		else if(status.equals("admin"))
		{
			modelAndView = new ModelAndView("admin","data",status);
		}
		else if(status.equals("mac"))
		{
			modelAndView = new ModelAndView("comittee","data",status);
		}
		else if(status.equals("wrong"))
		{
			modelAndView = new ModelAndView("login","data","Worng Password");
		}
		return modelAndView;
	}
	@RequestMapping(value = "/view/deleteProgram", method  = RequestMethod.POST)
	public ModelAndView deleteProgram(@ModelAttribute ProgramsOffered offered)
	{
		ModelAndView modelAndView = null;
		String result = serviceClass.delete(offered);
		if("yes".equals(result))
		{
			modelAndView = new ModelAndView("deleteOfferedProgram","data", "Deleted Program"+offered.getProgramName());
		}
		else
		{
			modelAndView = new ModelAndView("deleteOfferedProgram","data","No Such Program is Present");
		}
		return modelAndView;
	}
	@RequestMapping(value = "/view/deleteScheduledProgram", method  = RequestMethod.POST)
	public ModelAndView deleteScheduledProgram(@ModelAttribute ProgramsScheduled programsScheduled)
	{
		ModelAndView modelAndView = null;
		String result = serviceClass.deleteSchedule(programsScheduled);
		if("yes".equals(result))
		{
			modelAndView = new ModelAndView("deleteOfferedProgram","data", "Deleted Program"+programsScheduled.getScheduledProgramId());
		}
		else
		{
			modelAndView = new ModelAndView("deleteOfferedProgram","data","No Such Program is Present");
		}
		return modelAndView;
	}
	@RequestMapping(value = "/view/updateToConfirm",method = RequestMethod.POST)
	public ModelAndView updateToConfirm(@RequestParam("applicationId") String id)
	{
		ModelAndView modelAndView;
		String data = DataBaseCnnectionImpl.confirmAddmission(id);
		if("updated".equals(data))
		{
			modelAndView = new ModelAndView("Accepted","data","Updated");
		}
		else
		{
			modelAndView = new ModelAndView("updateToConfirm","data","WrongId");
		}
		return modelAndView;
		
	}
	@RequestMapping(value = "/view/updateToAccept", method = RequestMethod.POST)
	public ModelAndView updateToAccept(@ModelAttribute Application application)
	{
		ModelAndView modelAndView;
		String data = serviceClass.updateStatusToAccept(application);
		if("updated".equals(data))
		{
			modelAndView = new ModelAndView("ListOfApplicantscomittee","data","Updated");
		}
		else
		{
			modelAndView = new ModelAndView("Acceptcomittee","data","WrongId");
		}
		return modelAndView;
	}
	public ModelAndView updateToReject(@RequestAttribute Application application)
	{
		ModelAndView modelAndView;
		String data = serviceClass.updateStatusToReject(application);
		if("updated".equals(data))
		{
			modelAndView = new ModelAndView("ListOfApplicantscomittee","data","Updated");
		}
		else
		{
			modelAndView = new ModelAndView("Rejectcomitee","data","WrongId");
		}
		return null;
	}
}