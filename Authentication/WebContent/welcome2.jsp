<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="u" scope="session" class="com.dao.NameAndAge"/>
	
    <jsp:setProperty property = "name" name = "u"/>
    <jsp:setProperty property = "age" name="u"/>
   
   <%--  <jsp:getProperty property = "name" name="u"/>
    <jsp:getProperty property = "age" name="u"/> --%>
    
    <% out.print(u.getAge()+ " "+ u.getName());%>
</body>
</html>