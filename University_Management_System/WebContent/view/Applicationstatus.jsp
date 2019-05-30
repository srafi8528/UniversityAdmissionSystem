<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
 <head>
<title>Application Status</title>
</head>
<body>
<div class="header">
  <h1><strong>DMRR |Open University</strong></h1>
  <p>A tradition of trust</p>
</div>
<div class="navbar">
  <a href="homep.html"> <i class="fa fa-fw fa-home"></i> Home</a>
  <a href="ProgramsOffered.jsp">Program Offered</a>
  <a href="ProgramsScheduled.jsp" >Scheduled Program</a>
  <a href="Applicationstatus.jsp" >Application Status</a>
  <a href="#" >Contact Details</a>
  <a href="abt.html">About Us</a>
  <a href="ApplicationForm.html">Apply Online</a>  
</div>
<h2><center> View Application Status</center></h2>
<div align="center">
<form method="post" action="TrackingDetails.jsp" style="max-width:500px;margin:auto">
	<table>
	<tr style="color:white">
		<td>Application Id</td>
		<td>:</td>
		<td><a><input type="number" name="applicationId" placeholder="Application Id"></a></td>
	</tr>
	<tr>
		<td></td>
		<td></td>
		<td><b><input type="submit" value="Status"></b></td>
	</tr>
    </table>
</form>
</div>

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
 background-color:grey;
}
.header 
{
  padding: 35px;
  text-align: right;
  background: url("hive-hexagon-pngac3-4bf0-853a-871b34ab102f.png");
  background-size: 1500px 300px;
  color: brown;
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
.header h1 
{
  font-size: 30px;
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
</body>
</html>