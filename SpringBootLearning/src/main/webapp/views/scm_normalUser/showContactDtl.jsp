<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page isELIgnored="false" %>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <jsp:include page="../scm_normalUser/navbar.jsp"></jsp:include>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.contact-proile-img img
{
width: 150px;
height: 150px;
border-radius: 50%;
background-clip: border-box;
text-align: center;
display: block;
margin-left: auto;
margin-right: auto;
border: 0.5px solid;
}

table tr:hover {
	background-color: silver;
}
tr td
{
font-weight: bold;
}
</style>
</head>
<body style="background-color: navy;">
<div class="mainContainer">
<div class="container">
<div class="card mt-2">
<div class="card-header text-center alert-primary">
<h1>Contact Details</h1>
</div>
<div class="card-title text-center">
<div class="contact-proile-img">
  <img src='<c:url value="/img/banner.jpg"  />'>  
 </div>
<h1>${contactDtl[0].name } (${contactDtl[0].nickNmae })</h1>


</div>
<div class="card-body">
<table class="table">
  <tbody>
    <tr>
      <td >Id</td>
      <td>${contactDtl[0].id }</td>
      </tr>
      <tr>
       <td >Name</td>
      <td>${contactDtl[0].name }</td>
      </tr>
      <tr>
       <td >Work</td>
      <td>${contactDtl[0].work }</td>
      </tr>
      <tr>
       <td >Email</td>
      <td>${contactDtl[0].email }</td>
      </tr>
      <tr>
       <td >Phone No</td>
      <td>${contactDtl[0].phoneNo }</td>
      </tr>
      <tr>
      <td >About</td>
      <td>${contactDtl[0].decription }</td>
    </tr>

</tbody>
  </table>
</div>
    
   
    

 <button class="btn btn-primary btn-block">Update</button>
    <button class="btn btn-danger btn-block">Delete</button>
    <br>
</div>
</div>

</div>
</body>
</html>