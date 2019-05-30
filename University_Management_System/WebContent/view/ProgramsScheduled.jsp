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
<style>
 .right
 {
   background-color:green;
   width:7%;
 }
body 
{
  font-family: Arial, Helvetica, sans-serif;
  margin: 0;
  background: url("");
  background-size:cover;
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
  background-color:#006699;
  position: sticky;
  position: -webkit-sticky;
  top: 0;
}
.navbar a 
{
  float: left;
  display: block;
  color: white;
  text-align: center;
  padding: 14px 20px;
  text-decoration: none;
}
.navbar a.right 
{
  float: right;
}
.navbar a:hover 
{
  background-color:#ff6633;
  color: black;
}
</style>

</head>
<body>
 <div class="header"></div>
 <div class="navbar">
  <a href="homep.html"> <i class="fa fa-fw fa-home"></i> Home</a>
  <a href="ProgramsOffered.jsp">Program Offered</a>
  <a href="ProgramsScheduled.jsp" >Scheduled Program</a>
  <a href="Applicationstatus.jsp" >Application Status</a>
  <a href="#" >Contact Details</a>
  <a href="abt.html">About Us</a>
  <a href="ApplicationForm.html">Apply Online</a>  
</div>
<form method = "POST">
<table align="center" cellpadding="5" cellspacing="5" border="1">
<tr bgcolor="##cc0000">
<td>ScheduledProgramId</td>
<td>ProgramName</td>
<td>Location</td>
<td>StartDate</td>
<td>EndDate</td>
<td>SessionsPerWeek</td>
</tr>
<%
EntityManagerFactory factory = Persistence.createEntityManagerFactory("University_Management_System");
EntityManager manager = factory.createEntityManager();
manager.getTransaction().begin();
Query query = manager.createQuery("select data from ProgramsScheduled data");
List<ProgramsScheduled> programs = query.getResultList();
for(ProgramsScheduled programsScheduled : programs)
{
%>
<tr bgcolor="#DEB887">
<td><%=programsScheduled.getScheduledProgramId()%></td>
<td><%=programsScheduled.getProgramName()%></td>
<td><%=programsScheduled.getLocation() %></td>
<td><%=programsScheduled.getStartDate()%></td>
<td><%=programsScheduled.getEndDate()%></td>
<td><%=programsScheduled.getSessionsPerWeek()%></td>
</tr>
<%
}
%>
</table>
</form>
</body>
</html>