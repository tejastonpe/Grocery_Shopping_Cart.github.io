<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>


<center>
	<h1>Welcome To Shopping Application</h1>
	<h6>Created by @_tejas_tonpe_</h6>

	<hr>
	<br>
	<br>




	<form action="chklogin" method="post">
		<label for="username">Username:</label> <input type="text"
			name="txtusername"><br>
		<br> <label for="password">Password:</label> <input
			type="password" name="txtpwd"><br>
		<br>

		<button type="submit" value="Login">Login</button>
		<button action="register" type="submit" value="register">
			<a href="register">Register</a>
		</button>


	</form>
</center>


</body>
</html>
