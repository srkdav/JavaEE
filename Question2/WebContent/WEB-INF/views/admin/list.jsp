<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
    <%@ taglib uri="http://www.springframework.org/tags"  prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table style="background-color: cyan; margin: auto;" border="1">
			<c:forEach var="p" items="${requestScope.prod_details}">
				<tr>
					<td><a href="<spring:url value='/admin/form?pid=${p.id}'/>"></a>${p.prodName}</td>		
					<td>${p.prodPrice}</td>
				</tr>
			</c:forEach>
			</table>
			<h3>
			<a href="<spring:url value='/admin/form'/>">Add New Product</a>
			</h3>
</body>
</html>