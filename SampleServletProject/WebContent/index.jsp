<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<link href='https://fonts.googleapis.com/css?family=Satisfy' rel='stylesheet' type='text/css'/>
<link rel="stylesheet" type = "text/css" href="{% static 'css_style/style.css'%}" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		
		<b><h1>Addition of two numbers</h1></b>
		<div class = "col-xs-6">
		<div class="form-group">
		<form action ="greeting" >
			<span><label>
					enter the number one
			</label>
			</span>
			<input type="number" name = "inp1" value= "" class="form-control"/><br>
				<span><label>
					enter the number two
			</label>
			</span>
				<input type="number" name = "inp2" class="form-control"/><br><br>
				<input type = "submit" value = "submit" class="btn btn-success"/>
		</form></div></div>
		
		
</body>
</html>