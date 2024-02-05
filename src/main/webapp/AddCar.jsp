<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="Styling\addCar.css">
<title>Add page</title>
</head>
<body>
	<div class="container">
		<h1>Enter Car Details</h1>
		<form action="addNewCarDet" method="post">
			<input type="number" placeholder="Enter carId" name="carId"><br>
			<input type="text" placeholder="Enter carModel" name="carModel"><br>
			<input type="text" placeholder="Enter carBrand" name="carBrand"><br>
			<input type="number" placeholder="Enter carPrice" name="carPrice"><br>
			<input type="submit" value="Add">
		</form>
	</div>
</body>
</html>