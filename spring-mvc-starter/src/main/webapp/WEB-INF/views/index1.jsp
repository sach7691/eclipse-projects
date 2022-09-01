<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="http://localhost:8080/" method="POST">
		<table class ="center" style ="margin-top:200px">
		<tr>
		<td><label for="firstName">First name:</label><br> </td>
		<td><input type="text" id="firstName" name="firstName" value="" ><br></td> 
		</tr>
		<tr>
		<td><label for="lastName">Last name:</label><br></td> 
		<td><input type="text" id="lastName" name="lastName" value=""><br></td>
		</tr>
		<tr>
		<td><label for="email">Email:</label><br> </td>
		<td><input type="text" id="email" name="email"><br></td> 
		</tr>
		<tr>
		<td><label for="age">Age:</label><br> </td>
		<td><input type="text" id="age" name="age" ><br></td>
		</tr>
		<tr>
		<td><input type="submit" class="signupbtn" value="Sign up"></td>
		</tr>
		</table>
	</form>
</body>
</html>