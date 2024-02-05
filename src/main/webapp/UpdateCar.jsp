<%@page import="com.vivek.carManagementProject.Car"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="Styling\UpdateCar.css">
<title>Car Update data</title>
</head>
<body>
	<%
	Car c = (Car) request.getAttribute("existingCar");
	%>
	<form action="updateData">
		<input type="number" value="<%=c.getCarId()%>" name="carId" readonly="true" > <br>
		<input type="text" value="<%=c.getCarModel()%>" name="carModel"> <br>
		<input type="text" value="<%=c.getCarBrand()%>" name="carBrand"> <br>
		<input type="number" value="<%=c.getCarPrice()%>" name="carPrice"> <br>
		<input type="submit" value="Update">
	</form>
</body>
</html>