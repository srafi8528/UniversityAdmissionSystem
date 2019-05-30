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
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body
{
  font-family: Arial, Helvetica, sans-serif;
  background-size:cover;
  background: url("attractive-backdrop-background-988872.jpg");
}
.header
{
  padding: 85px;
  text-align:left;
  background: url("hive-hexagon-pngac3-4bf0-853a-871b34ab102f.png");
  background-size: 1500px 300px;
  color: white;  
}
.navbar 
{
  overflow: hidden;
  background-color: #006699;
}
.navbar a 
{
  float: left;
  font-size: 16px;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}
.navbar a:hover, .dropdwn:hover
{
  background-color:#00cc99;
}
</style>

</head>
<body>
<div class="header"></div>
<div class="navbar">
  <a href="comittee.jsp">Home</a>
  <a href="Acceptedcomittee.jsp">Accepted List People</a>
  <a href="Rejectedcomittee.jsp">Rejected List People</a>
  <a href="#news">List Of Applicants</a>
  <a href="#news" class="right">Logout</a>
</div>
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
String acc = "Accepted";
EntityManagerFactory factory = Persistence.createEntityManagerFactory("University_Management_System");
EntityManager manager = factory.createEntityManager();
manager.getTransaction().begin();
Query query = manager.createQuery("select data from Application data where data.Status=:appId");
query.setParameter("appId", acc);
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