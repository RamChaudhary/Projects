<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Server side validation form</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<style type="text/css">
.error
{
color: red;
}
 label {
        display: inline-block;
        width: 200px;
        margin: 5px;
        text-align: left;
    }
    input[type=text], input[type=password], select {
        width: 200px;  
    }
    input[type=radio] {
        display: inline-block;
        margin-left: 45px;
    }
    input[type=checkbox] {
        display: inline-block;
        margin-right: 190px;
    }  
     
    button {
        padding: 10px;
        margin: 10px;
    }
</style>
</head>
<body>
<div style="text-align: center;margin-top: 20px">
<h1>Server side validation...</h1>

<div class="row">
<div class="col-md-3">
</div>

<div class="col-md-6">
<form:form action="formProcessing"  method="post"    modelAttribute="myFormData">
 
 		
            <form:label path="name">Full name:</form:label>
            <form:input path="name"/>
             <p><form:errors path="name" cssClass="error" ></form:errors></p> 
            <form:label path="email">E-mail:</form:label>
            <form:input path="email"/>
             <p><form:errors path="email" cssClass="error" ></form:errors></p> 
             
            <form:label path="password">Password:</form:label>
            <form:password path="password"/>
             <p><form:errors path="password" cssClass="error" ></form:errors></p>   
 
            <form:label path="birthday">Birthday (yyyy-mm-dd):</form:label>
            <form:input path="birthday"/>
             <p><form:errors path="birthday" cssClass="error" ></form:errors></p> 
             
            <form:label path="gender">Gender:</form:label>
            <form:radiobutton path="gender" value="Male"/>Male
            <form:radiobutton path="gender" value="Female"/>Female
             <p><form:errors path="gender" cssClass="error" ></form:errors></p> 
             
            <form:label path="profession">Profession:</form:label>
            <form:select path="profession" items="${professionList}" />
             <p><form:errors path="profession" cssClass="error" ></form:errors></p> 
                     
            <form:label path="married">Married?</form:label>
            <form:checkbox path="married"/>
             <p><form:errors path="married" cssClass="error" ></form:errors></p> 
             
            <form:label path="note">Note:</form:label>
            <form:textarea path="note" cols="25" rows="5"/>
             <p><form:errors path="note" cssClass="error" ></form:errors></p> 
                 
            <form:button>Submit</form:button>
 
 <%-- <div class="form-group">
    <label for="exampleInputEmail1">User name</label>
    <input type="text" class="form-control" id="userName" name="userName" aria-describedby="emailHelp" placeholder="Enter user name">
  <form:errors path="userName" cssClass="error" >11111</form:errors> 
  </div>
  
  <div class="form-group">
    <label for="exampleInputEmail1">Email address</label>
    <input type="email" class="form-control" id="userEmail" name="userEmail" aria-describedby="emailHelp" placeholder="Enter email">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" class="form-control" id="exampleInputPassword1" name="password" id="password" placeholder="Password">
  </div>
  <div class="form-group form-check">
    <input type="checkbox" class="form-check-input" id="checkMe" name="checkMe">
    <label class="form-check-label" for="exampleCheck1">Check me out</label>
  </div>
  <button type="submit" class="btn btn-primary">Submit</button> --%>
</form:form>

</div>

<div class="col-md-3">
</div>

</div>

</div>
</body>
</html>