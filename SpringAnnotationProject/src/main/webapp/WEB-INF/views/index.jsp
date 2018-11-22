<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1" align="center">
				<tr>
					<th>ID</th>
					<th>FirstName</th>
					<th>Age</th>
					
				</tr>
				
				<!-- loop over and print our customers -->
				<c:forEach var="tempCustomer" items="${employees}">
				
									<h1>${tempCustomer.id}</h1>
					
					
				
				</c:forEach>
						
			</table>

</body>
</html>