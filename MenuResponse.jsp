<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="edu.ait.model.CalculateOrderTotal" %>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Thank you for your order</title>
</head>
<body style="background-color: #ff751a; height:100%; width:100%;">
Thank you for your order. 

Your order:<br>
 Chicken burgers:   <c:out value="${checkout_total.getQty_chicken_burger()}"/><br>
 Quarter pounders:   <c:out value="${checkout_total.getQty_quarter_pounder()}"/><br>
 Half pounders:   <c:out value="${checkout_total.getQty_half_pounder()}"/><br>
 
Regular chips:   <c:out value="${checkout_total.getQty_regular_chips()}"/><br>
Curry chips:   <c:out value="${checkout_total.getQty_curry_chips()}"/><br>
Taco chips:   <c:out value="${checkout_total.getQty_taco_chips()}"/><br>

Snack box:   <c:out value="${checkout_total.getQty_snack_box()}"/><br>
Chicken goujons:   <c:out value="${checkout_total.getQty_chicken_goujons()}"/><br>
Chicken nuggets:   <c:out value="${checkout_total.getQtychicken_nuggets()}"/><br>
 


Your order total:
 	 <c:out value="${checkout_total.getTotal()}"/>