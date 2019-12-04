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
<spring:url value='/admin/form' var="demo"/>

	
	<sp:form method="post" modelAttribute="product">
		<table style="background-color: cyan; margin: auto;">
			<tr>
				<td>Enter Product name</td>
				<td><sp:input path="prodName" /></td>
			</tr>
				<tr>
				<td>Enter Product price</td>
				<td><sp:input path="prodPrice" /></td>
			</tr>
				<tr>
				<td>Enter Availability</td>
				<td><sp:input path="availability" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Add" /></td>
			</tr>
</table>
</sp:form>
</body>
</html>