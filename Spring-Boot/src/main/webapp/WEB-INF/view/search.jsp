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
.buttons {
    background-color:red;
    border: none;
    color: white;
    padding: 8px 10px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
    
}
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
<input type="button" class="button" onclick="location.href='/index'" value="Home" align="centre"><br>
<h1 class="buttons">Employee Information</h1>

<h2>User Id:</h2>
<h4>${searchTerm.id}</h4>

<h2>User Name:</h2>
<h4>${searchTerm.name}</h4>

<h2>User Dept:</h2>
<h4>${searchTerm.dept}</h4>

<h2>User Age:</h2>
<h4>${searchTerm.age}</h4>

<h2>User Sallary:</h2>
<h4>${searchTerm.sallary}</h4>

</body>
</html>