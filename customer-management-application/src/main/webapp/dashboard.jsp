<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.List" %>
<%@page import="com.ab.beans.Pet" %>

<html>
<head>
<meta charset="ISO-8859-1">
<title>dashboard</title>
</head>
<body>
<%
p

List<Pet> cus = (List<Pet>)session.getAttribute("cList");
%> 
<h1>Welcome to Dashboard</h1>
<a href="http://localhost:8080/customer-management-application/listRegisteredCustomersServlet" method ="GET"></a>


<table border="1">
  <tr>
    <th>Customer ID</th>
    <th>First Name</th>
    <th>Last Name</th>
    <th>Customer Email</th>
  </tr>
    <c:forEach items="${cList}" var="c">
        <tr>
            <td><c:out value="${c.customerId}" /></td>
            <td><c:out value="${c.firstName}" /></td>
            <td><c:out value="${c.lastName}" /></td>
            <td><c:out value="${c.customerEmail}" /></td>
        </tr>
    </c:forEach>
</table>
</br>
<label>Login as another User</label>	
<a href="login.jsp">Go Back to Login</a>

</body>
</html>