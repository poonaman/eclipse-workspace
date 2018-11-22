<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.button {
    background-color: #4CAF50;
    border: none;
    color: white;
    padding: 10px 20px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
}
</style>
</head>
<body>
<h1>List Of Employees</h1>
<input type="button" class="button" onclick="location.href='/index'" value="Home" align="centre"></body>
 <table border="1" align="center" >
				<tr>
					<th>ID</th>
					<th>FirstName</th>
					<th>Dept</th>
					
					<th>Age</th>
					<th>Sallary</th>
					<th>Delete</th>
					<th>Update</th>
				</tr>
				
				<!-- loop over and print our customers -->
				<c:forEach var="tempCustomer" items="${newEmployee}">
				
									
					
					<tr bgcolor="pink">
						<td> ${tempCustomer.id} </td>
						<td> ${tempCustomer.name} </td>
						<td> ${tempCustomer.dept} </td>
					
						<td> ${tempCustomer.age} </td>
						<td> ${tempCustomer.sallary} </td>
						<td><input type="button" onclick="location.href='/delete/${tempCustomer.id}'" value="Delete" align="centre"></td>
						<td><input type="button" onclick="location.href='/updatePages/${tempCustomer.id}/${tempCustomer.name}/ ${tempCustomer.dept}/ ${tempCustomer.age}/${tempCustomer.sallary}'" value="Update" align="centre"></td>
				    </tr>
				
				</c:forEach>
						
			</table>

</html>