<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>



<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success SignUp!</title>
</head>
<body style="background-color: #ff751a; height:100%; width:100%;">
	Thanks for joining the Fast & Foodius Family <c:out value = "${my_user.name}"/> !
	
	Check your details:
	
    Name : <c:out value = "${my_user.name}"/><br>
	Address : <c:out value="${my_user.address}"/><br>

<form action="Menu_CalculatorTest.jsp" method="get">
	<input type="submit" value="Go to Menu!"/>
</form>


</body>
</html>