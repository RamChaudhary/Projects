<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:include page="../scm_normalUser/navbar.jsp"></jsp:include>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<div class="mainContainer">
<h1>User dashbord</h1>
<h1>User Name:- ${userDtl.userName }</h1>
<h1>User Name:- ${userDtl.userEmail }</h1>
<h1>User Name:- ${userDtl.userPassword }</h1>
<h1>User Name:- ${userDtl.profileImage }</h1>


</div>
</body>
</html>