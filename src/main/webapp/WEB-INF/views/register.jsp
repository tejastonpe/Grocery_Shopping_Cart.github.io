<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<html>
<head>
<title>Registration Form</title>
</head>
<body>
	<center>
		<h1>New User Register</h1>
		<hr>
		<form action="/register" method="post">
			<label for="username">Username:</label> <input type="text"
				name="username" required><br>
			<br> <label for="password">Password:</label> <input
				type="password" name="password" required><br>
			<br> <label for="email">Email:</label> <input type="email"
				name="email" required><br>
			<br> <input type="submit" value="Register"><br>
			<br>
		</form>
	</center>
</body>
</html>
</body>
</html>