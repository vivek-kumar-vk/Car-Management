<%@page import="com.vivek.carManagementProject.Car"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Cars</title>
</head>
<body>

	<%List<Car> carList= (List)request.getAttribute("carList");%>
	<table border="">
	<tr>
	<th>CarId</th>
	<th>CarModel</th>
	<th>CarBrand</th>
	<th>CarPrice</th>
	<th>Update</th>
	<th>Delete</th>
	</tr>
	
	<% for(Car c:carList){ %>
	<tr>
	<td><%=c.getCarId() %></td>
	<td><%=c.getCarModel() %></td>
	<td><%=c.getCarBrand() %></td>
	<td><%=c.getCarPrice() %></td>
	<td><a href="updateCar?carId=<%=c.getCarId()%>" >Update</a></td>
	<td><a href="deleteCar?carId=<%=c.getCarId()%>">Delete</a></td>
	</tr>
	<% } %>
	</table>
</body>
</html>