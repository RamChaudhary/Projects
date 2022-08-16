<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%--     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 --%>    
    <jsp:include page="library.jsp"></jsp:include>
<jsp:include page="navabrBeforeLogIn.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<style type="text/css">
.banner
{
width: 100%;
height: 93vh;
background: linear-gradient(rgba(0,0,0,.5),rgba(0,0,0,.5)),url("../img/banner.jpg");
background-size: cover;
}
 .banner h1
{
color: white;
font-weight: bold;
} 
</style>
</head>
<body>
<div class="banner d-flex justify-content-center align-items-center">
<div>
<h1> Smart Contact Manager</h1><br>
<p style="color: white;font-weight: bold;">This is basically user for contact management system.</p>
<div style="text-align: center;">
<button class="btn btn-primary btn-lg">Get Start</button>
</div>
</div>
</div>
	
	
</body>
</html>