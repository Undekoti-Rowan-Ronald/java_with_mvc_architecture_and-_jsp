<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success</title>
</head>
<body>
<h1>Registered sucessfully</h1>
<%String name =(String)session.getAttribute("name"); %>
<h2>HI <%=  name %> your registration is done </h2>
<a href="index.html"><button type="button">Go Back</button></a>
</body>
</html>