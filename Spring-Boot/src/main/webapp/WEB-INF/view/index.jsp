<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
.button {
    background-color: #4CAF50;
    border: none;
    color: white;
    padding: 15px 32px;
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
    padding: 15px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
}
</style>
<title>Insert title here</title>
</head>
<body>
<h1 class="buttons">Employee Management System</h1><br>
<input type="button"  class="button"onclick="location.href='/addEmployee'" value="Register"/>

<input type="button" class="button" onclick="location.href='/deletePage'" value="Delete" />
<input type="button" class="button" onclick="location.href='/searchPage'" value="Search" />
<input type="button" class="button" onclick="location.href='/updatePage'" value="Update" />
<input type="button" class="button" onclick="location.href='/employee'" value="Get All Employee" />
</body>
</html>