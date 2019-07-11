<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Confirmation</title>
</head>
<body>
The Customer is confirmed: ${customer.firstName} ${customer.lastName}
<br>
with ${customer.freePasses} free passes
<BR>
Postal Code :  ${customer.postalCode} 
<br>
Course Code :  ${customer.courseCode}
</body>
</html>