<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <%@ page isELIgnored="false" %>
<jsp:include page="../scm_normalUser/library.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<style>
body {
  margin: 0;
  font-family: "Lato", sans-serif;
}

.sidebar {
 /*  margin: 0;
  padding: 0;
  width: 200px;
  background-color: #f1f1f1;
  height: 100%; */
  
  position: fixed;
	    top: 0%;
    left: 0%;
    width: 18%;
     background-color: white;
      height: 100%; 

}

.sidebar a {
  display: block;
  color: black;
  padding: 16px;
  text-decoration: none;
  font-weight: bold;
  text-align: center;
  border-bottom: .5px solid;
}
 
.sidebar a.active {
   /* fallback for old browsers */
 /*  background: #fccb90; */

  /* Chrome 10-25, Safari 5.1-6 */
  /* background: -webkit-linear-gradient(to right, #ee7724, #d8363a, #dd3675, #b44593); */

  /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
 /*  background: linear-gradient(to right, #ee7724, #d8363a, #dd3675, #b44593); */
  color: black;
  font-weight: bold;
}

.sidebar a:hover {
   /* fallback for old browsers */
   background: #fccb90; 

  /* Chrome 10-25, Safari 5.1-6 */
   background: -webkit-linear-gradient(to right, #ee7724, #d8363a, #dd3675, #b44593); 

  /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
   background: linear-gradient(to right, #ee7724, #d8363a, #dd3675, #b44593); 
}

div.content {
  margin-left: 200px;
  padding: 1px 16px;
  height: 1000px;
}

@media screen and (max-width: 700px) {
  .sidebar {
    width: 100%;
    height: auto;
    position: relative;
  }
  .sidebar a {float: left;}
  div.content {margin-left: 0;}
}

@media screen and (max-width: 400px) {
  .sidebar a {
    text-align: center;
    float: none;
  }
}
.sidebar .active {
  /* fallback for old browsers */
 /*  background: #fccb90; */

  /* Chrome 10-25, Safari 5.1-6 */
 /*  background: -webkit-linear-gradient(to right, #ee7724, #d8363a, #dd3675, #b44593); */

  /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
 /*  background: linear-gradient(to right, #ee7724, #d8363a, #dd3675, #b44593); */
}
.mainContainer
{
padding-left: 245px;
}

.card-title img
{
width: 100%;
height: auto;
border-radius: 50px;
padding: 0;
margin: 0;
}
.sidebar .card-body
{
padding: 0;
margin: 0;
}
.sidebar .card-body h4
{
text-align: center;
font-weight: bold;
}
</style>
</head>
<body>

<div class="sidebar">

<div class="card">
<div class="card-title">
<img alt="" src='<c:url value="../img/${userDtl.profileImage }" />'>
</div>
<div class="card-body">
<h4>${userDtl.userName }</h4>
</div>

</div>
  <a class="active" href="<%=request.getContextPath() %>/user/userDashbord">Home</a>
  <a href="<%=request.getContextPath()%>/user/addContact">Add Contact</a>
    <a href="<%=request.getContextPath()%>/user/viewContact/0">View Contact</a>
  
  <a href="#about">About</a>
  
   <a href="<%=request.getContextPath()%>/logout">Logout</a>
</div>


</body>
</html>
