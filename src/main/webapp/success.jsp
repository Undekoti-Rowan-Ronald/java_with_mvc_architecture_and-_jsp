<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>Success</title>

<style>

body{

margin:0;
height:100vh;
display:flex;
justify-content:center;
align-items:center;
font-family:Arial;
background:linear-gradient(135deg,#11998e,#38ef7d);

}

.card{

background:white;
padding:45px;
border-radius:20px;
text-align:center;
box-shadow:0 20px 40px rgba(0,0,0,.3);

}

h1{

color:#27ae60;
font-size:45px;

}

h2{

color:#444;

}

button{

margin-top:25px;
padding:12px 30px;
border:none;
border-radius:10px;
background:#27ae60;
color:white;
font-size:18px;
cursor:pointer;

}

button:hover{

background:#1f8f50;

}

</style>

</head>

<body>

<div class="card">

<h1>✔</h1>

<%
String name=(String)session.getAttribute("name");
%>

<h2>Welcome <%=name %></h2>

<p>Your registration was completed successfully.</p>

<a href="index.html">

<button>Register Another User</button>

</a>

</div>

</body>

</html>