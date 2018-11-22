<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
.buttons {
    background-color:red;
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
<h1 class="buttons">Employee Updation Form</h1>
<form:form method="post" modelAttribute="employee" action="${pageContext.request.contextPath}/employeepost">

<table>
    <tr>
        <td>User Id </td>
        <td><form:input path="id" value="${employee.id}" /></td>
    </tr>
    <tr>
        <td>User name :</td>
        <td><form:input path="name" value="${employee.name}"/></td>
    </tr>
   <tr>
        <td>User dept :</td>
        <td><form:input path="dept"  value="${employee.dept}" /></td>
    </tr>
     <tr>
        <td>User age :</td>
        <td><form:input path="age" value="${employee.age}" /></td>
    </tr>
      <tr>
        <td>User sallary :</td>
        <td><form:input path="sallary" value="${employee.sallary}" /></td>
    </tr>
    <tr>
    <td rowspan="2"><input type="submit" class="button" value="Update"></td>
    </tr>
    </table>
 </form:form>
</body>
</html>