<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<center>


	<h2>Welcome To Shopping Page</h2>

	<h2>Customer</h2>
	<%=request.getAttribute("customer") %>
	<hr>
	Welcome: ${customer}
	<hr>
	<h3>Avaiable Products</h3>
	<table border="3">
		<c:forEach var="e" items="${requestScope.prds }">
			<tr>
				<td><c:out value="${e.prdid}" /></td>
				<td><c:out value="${e.name}" /></td>
				<td><c:out value="${e.price}" /></td>
				<td><a href="prdid=${e.prdid}">Add To Cart</a></td>

			</tr>
		</c:forEach>
	</table>
</center>
</body>
</html>