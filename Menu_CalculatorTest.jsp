<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: #ff751a; height:100%; width:100%;">
<h1>Please select your order items below!<br></h1>


	<form action="Practise_MenuController" method="POST" id="OrderInput">	
		<div id="burgersdiv">
			<h3><strong>Burgers</strong><br></h3>
			<input type="number" value="0" max="10" name="item_chicken_burger">Chicken burger 4.50<br>
			<input type="number" value="0" max="10" name="item_quarter_pounder">Quarter Pounde 4.50<br>
			<input type="number" value="0" max="10" name="item_half_pounder">Half Pounder 6.50<br>
		</div>
		
		<div id="chipsdiv">
			<h3><strong>Chips</strong><br></h3>
			<input type="number" value="0" max="10" name="item_regular_chips">Regular chips 3.50<br>
			<input type="number" value="0" max="10" name="item_curry_chips">Curry chips 4.50<br>
			<input type="number" value="0" max="10" name="item_taco_chips">Taco chips 4.50<br>
		</div>
		
		<div id="chickendiv">
			<h3><strong>Chicken</strong><br></h3>
			<input type="number" value="0" max="10" name="item_snack_box">Snack box 5.50<br>
			<input type="number" value="0" max="10" name="item_chicken_goujons">Chicken goujons 4.50<br>
			<input type="number" value="0" max="10" name="item_chicken_nuggets">Chicken nuggets 4.50<br>
		</div>
		
		Delivery charge: 5 euro
		
		<div id="submitdiv">
			<br>
			<input type="submit" value="submit">
		</div>
		
		
	</form>

</body>
</html>