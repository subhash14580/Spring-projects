<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
	<jsp:useBean id="u" scope="session" class="com.dao.LnaguageAndAge"/>
	 <jsp:setProperty property = "*" name = "u"/>
    
	

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		 <% out.print(u.getLanguage()+ " "+ u.getName());%>
</body>
</html>