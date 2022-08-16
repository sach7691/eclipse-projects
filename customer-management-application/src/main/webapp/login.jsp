<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>

  <h1>Login Form</h1>
  <form action="http://localhost:8080/customer-management-application/LoginCustomerServlet"  method ="POST">
  <label for="customerEmail">Customer Email:</label><br>
  <input type="text" id="customerEmail" name="customerEmail"><br>
  <label for="customerpassword">Customer Password:</label><br>
  <input type="password" id="customerpassword" name="customerpassword"><br><br>
  <input type="submit" value="Login"> 
  </form>
  
  <label>Are you a New User ? </label><a href="index.jsp">Click Here to Register</a>


</body>
</html>