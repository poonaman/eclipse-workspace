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
<H1 align="center" class="buttons">Registration Form</H1>
<form:form method="post" modelAttribute="employee" action="${pageContext.request.contextPath}/employeepost">

<table>
    <tr>
        <td>User Id :</td>
        <td><form:input path="id" /></td>
    </tr>
    <tr>
        <td>User name :</td>
        <td><form:input path="name"/></td>
    </tr>
   <tr>
        <td>User dept :</td>
        <td><form:input path="dept"/></td>
    </tr>
     <tr>
        <td>User age :</td>
        <td><form:input path="age"/></td>
    </tr>
      <tr>
        <td>User sallary :</td>
        <td><form:input path="sallary"/></td>
    </tr>
    <tr>
    <td rowspan="1"><input type="submit" class="button" value="Register"></td>
    </tr>
    </table>
 </form:form>
</body>
</html>