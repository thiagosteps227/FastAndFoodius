<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login Page</title>
</head>
<body style="background-color: #ff751a; height:100%; width:100%; 
background-image:url('background.jpg');
background-size: cover">
	
	<div style="height: 30%; width: 100%; float: center">
		<h1 style="text-align:center; color: black">Welcome to Fast & Foodius</h1>
		<h3 style="text-align:center;color: black">If you are already a client:</h3>
			<form name="userForm" method="post" action="LoginControllerServlet"
			style="text-align:center; ">
	
				
			Email address : <input type="email" name="address" 
			placeholder="type your email"><br>
		
			Password: <input type="password" name="password" 
			placeholder="type your password" style="margin: 1px;"><br>
			
			<input type="hidden" name="formType" value="login">
			<input type="submit" value="Login!" style="background-color: #2eb82e">
			
	
		</form>
	</div>
	
	<div style="height: 70%; width: 100%;float:center; color: black; margin-top: 5%">
		<h3 style="text-align:center;color: black">If you are not a client yet:</h3>
		<form name="userForm" method="post" action="LoginControllerServlet"
		style="text-align:center; ">
	
			Name: <input type="text" name = "name" placeholder="type your name"
			style="margin: 1px;"><br>
		
			Email address : <input type="text" name="address" 
			placeholder="type your email"><br>
		
			Password: <input type="password" name="password" 
			placeholder="type your password" style="margin: 1px;"><br>
			
			Confirm your password: <input type="password" name="passwordConfirmation"
			placeholder="confirm your password" style="margin: 1px;"><br>
			
			<input type="hidden" name="formType" value="register">
			<input type="submit" value="Sign Up!" style="background-color: #2eb82e">
	
		</form>
	</div>
	
	
</body>
</html>