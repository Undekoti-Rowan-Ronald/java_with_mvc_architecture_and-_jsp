<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>failure</title>
</head>
<body>
<h1>data updation failed </h1>
<%String name =(String)session.getAttribute("name"); %>
<h2>HI <%=  name %> your registration is failed recheck you entered details </h2>

</body>
</html>