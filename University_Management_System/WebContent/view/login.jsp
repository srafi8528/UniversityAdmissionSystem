<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
 <head>
<title>Login</title>
</head>
<body>
<div class="header">
  <h1><strong>DMRR |Open University</strong></h1>
  <p>A tradition of trust</p>
</div>
<h3>${data}</h3>
<h2  style="color:white"><center> LogIn</center></h2>
<div align="center">
<form method="post" action="login" style="max-width:500px;margin:auto">
	<table  style="color:white">
	<tr>
		<td>User Name</td>
		<td>:</td>
		<td><a><input type="text" name="loginId" placeholder="Enter UserName"></a></td>
	</tr>
	<tr>
		<td>Password</td>
		<td>:</td>
		<td><a><input type="password" name="password" placeholder="Enter Password"></a></td>
	</tr>
	<tr>
		<td></td>
		<td></td>
		<td><b><input type="submit" value="Login"></b></td>
	</tr>
    </table>
</form>
</div>
<style>
body 
{
 font-family: Arial, sans-serif;
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
.header h1 
{
  font-size: 30px;
} 

input[type=text]
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
	  input[type=password]
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
	   opacity:0.8;
	   border-radius:18px;
	  }
</style>
</body>
</html>