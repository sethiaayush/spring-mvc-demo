<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student-Confirmation</title>
</head>
<body>
<!--  student is very important here-->
	The Student is confirmed : ${student.firstName} ${student.lastName}
	<br>
	<br> Country ${student.country}
	<br>
	<br> Programming language ${student.favoriteLanguage}
	<br>
	<br>Operating Systems:
	<ul> 
	<!-- good use of jstl library here, using forEach -->
		<c:forEach var="operatingSystem" items="${student.operatingSystems}">
			<li>${operatingSystem}</li>
		</c:forEach>
	</ul>
</body>
</html>