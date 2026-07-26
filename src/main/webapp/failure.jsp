<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>Failure</title>

<style>

body{

margin:0;
height:100vh;
display:flex;
justify-content:center;
align-items:center;
font-family:Arial;
background:linear-gradient(135deg,#ff416c,#ff4b2b);

}

.card{

background:white;
padding:45px;
border-radius:20px;
text-align:center;
box-shadow:0 20px 40px rgba(0,0,0,.3);

}

h1{

color:#e74c3c;
font-size:45px;

}

h2{

color:#333;

}

button{

margin-top:25px;
padding:12px 30px;
border:none;
border-radius:10px;
background:#e74c3c;
color:white;
font-size:18px;
cursor:pointer;

}

button:hover{

background:#c0392b;

}

</style>

</head>

<body>

<div class="card">

<h1>✖</h1>

<%
String name=(String)session.getAttribute("name");
%>

<h2>Sorry <%=name %></h2>

<p>Registration failed. Please verify your details and try again.</p>

<a href="index.html">

<button>Try Again</button>

</a>

</div>

</body>

</html>