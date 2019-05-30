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
input[type=number]
	  {
	    width:100%;
		padding:12px 5px;
		background:rgba(0,0,0,0.6);
		outline:none;
		border:none;
		border-bottom:1px solid #fff;
		color:#fff;
		border-radius:5px;
		margin:5px;
		font-weight:bold;
	  }
	  input[type=submit]
	  {
	   width:110%;
	   padding:10px;
	   margin-top:30px;
	   outline:none;
	   border:none;
	   background:#00cc66;
	   opacity:0.7;
	   border-radius:18px;
	  }
</style>

</head>
<body>
<div class="header"></div>
<div class="navbar">
  <a href="comittee.jsp">Home</a>
  <a href="Acceptedcomittee.jsp">Accepted List People</a>
  <a href="Rejectedcomittee.jsp">Rejected List People</a>
  <a href="ListOfApplicantscomittee.jsp">List Of Applicants</a>
  <a href="login.jsp" class="right">Logout</a>
</div>
<h2><center> Give Application Id Of Student</center></h2>
<div align="center">
<form method="post" action="updateToReject" style="max-width:500px;margin:auto">
	<table>
	<tr>
		<td>Application Id</td>
		<td>:</td>
		<td><a><input type="number" name="applicationId" placeholder="Application Id"></a></td>
	</tr>
	<tr>
		<td></td>
		<td></td>
		<td><b><input type="submit" value="Update"></b></td>
	</tr>
    </table>
</form>
</div>
${data}
</body>
</html>
