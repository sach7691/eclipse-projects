<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>

	<h1>Registration Form</h1>
  <form action="http://localhost:8080/customer-management-application/CustomerRegistration"  method ="POST">
  <label for="firstName">First name:</label><br>
  <input type="text" id="firstName" name="firstName"><br>
  <label for="lastName">Last name:</label><br>
  <input type="text" id="lastName" name="lastName"><br>
  <label for="customerEmail">Email:</label><br>
  <input type="text" id="customerEmail" name="customerEmail"><br>
  <label for="customerpassword">Password:</label><br>
  <input type="password" id="customerpassword" name="customerpassword"><br><br>
  <input type="submit" value="Submit">
  </form>

 <label>Are you a registered Customer ? </label><a href="login.jsp">Click Here to Login</a>
</body>
</html>