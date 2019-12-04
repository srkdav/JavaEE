<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="sp"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h4>Item already available in list! Please click below links : </h4>
<h3><a href="<spring:url value='/admin/form'/>">Click to go back to add new Item</a></h3>
<h3><a href="<spring:url value='/admin/list'/>">Click to go back to check the list</a></h3>
</body>
</html>

