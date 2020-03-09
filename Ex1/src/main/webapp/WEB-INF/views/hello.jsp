<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<title>Insert title here</title>
	<link rel="stylesheet" href="<c:url value='/static/css/Style.css'/>" >
	<script type="text/javascript" src="<c:url value='/static/js/main.js'/>"></script>
</head>
<body>
	<c:url value="/add3" var="url"></c:url>
	<form:form action="${url}" modelAttribute="user" method="POST">
		<form:input path="name"/>	
		<p><form:errors path="name"></form:errors></p>	
		<button type="submit">Submit</button>
	</form:form>
	<img alt="a" src="<c:url value='/static/image/meow.png'/>" width="300px" height="300px">
</body>
</html>