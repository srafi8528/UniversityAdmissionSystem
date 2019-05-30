<%@page import="org.jsp.app.model.dto.Application"%>
<%@page import="org.springframework.web.servlet.ModelAndView"%>
<%@page import="java.util.ArrayList"%>
<%@page import="org.jsp.app.model.dto.ProgramsScheduled"%>
<%@page import="java.util.List"%>
<%@page import="javax.persistence.Query"%>
<%@page import="javax.persistence.EntityManager"%>
<%@page import="javax.persistence.Persistence"%>
<%@page import="javax.persistence.EntityManagerFactory"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
<a href="homep.html"><button>HomePage</button></a>
</div>
<form method = "POST">
<table align="center" cellpadding="5" cellspacing="5" border="1">
<tr bgcolor="##cc0000">
<td>ApplicationId</td>
<td>FullName</td>
<td>Email</td>
<td>Status</td>
<td>Interviewdate</td>
<td>ScheduledProgramId</td>
</tr>
<%
String id=request.getParameter("applicationId");
System.out.println(id);
EntityManagerFactory factory = Persistence.createEntityManagerFactory("University_Management_System");
EntityManager manager = factory.createEntityManager();
manager.getTransaction().begin();
Query query = manager.createQuery("select data from Application data where data.applicationId=:appId");
query.setParameter("appId", id);
List<Application> programs = query.getResultList();
for(Application application2 : programs)
{
%>
<tr bgcolor="#DEB887">
<td><%=application2.getApplicationId()%></td>
<td><%=application2.getFullName()%></td>
<td><%=application2.getEmailid()%></td>
<td><%=application2.getStatus()%></td>
<td><%=application2.getDateofInterview()%></td>
<td><%=application2.getScheduledProgramId()%></td>
</tr>
<%
}
%>
</table>
</form>
</body>
</html>