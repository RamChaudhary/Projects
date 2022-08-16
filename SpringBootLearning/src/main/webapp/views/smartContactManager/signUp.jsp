<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ page isELIgnored="false" %>
        <jsp:include page="library.jsp"></jsp:include>
<jsp:include page="navabrBeforeLogIn.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>sign Up</title>
<script type="text/javascript" src='<c:url value="../js/sweetalert.min.js"/>'></script>
<script type="text/javascript" src='<c:url value="/js/validation.js"/>'></script>
<style type="text/css">
.mycard
{
background-color: #fff;

}
.form-floating
{
padding-bottom: 10px;
}
body {
	background-color: white;
}
</style>
</head>
<body>
<div class="container">
<div style="text-align: center;">

<div class="card border-primary bg-white" >
<div class="card-header">
<h2>Register Here !!</h2>
<div class="card-body">
<c:if test="${errorMsg=='Exception' }">
<div class="alert alert-danger text-center">${errorMsgBody }</div>
</c:if>
<div class="row">
<div class="col-md-3"></div>
<div class="col-md-6">
<form action="<%=request.getContextPath() %>/ContactManagerController/registration" method="post">
  <div class="form-floating">
    <input type="text" class="form-control" id="userName" name="userName" value="${user.userName }" >
     <label for="floatingTextarea">Your Name </label>
  </div>
  <div class="form-floating">
    <input type="email" class="form-control" id="userEmail" name="userEmail" aria-describedby="emailHelp" value="${user.userEmail }">
    <label for="floatingTextarea">Your Email</label>
  </div>
  <div class="form-floating">
    <input type="password" class="form-control" id="userPassword"  name="userPassword" >
        <label for="floatingTextarea">Your Password</label>
    
  </div>
  
  <div class="form-floating">
  <textarea class="form-control" placeholder="Leave a comment here" id="userAbout" name="userAbout" style="height: 150px;">${user.userAbout }</textarea>
  <label for="floatingTextarea">Write something here</label>
</div>
<div class="form-group">
<select class="form-select form-select-sm" aria-label=".form-select-sm example" name="userRole" id="userRole">
  <option selected value="">Select Role</option>
  <option value="ROLE_N">NORMAL</option>
  <option value="ROLE_E">EMPLOYEE</option>
  <option value="ROLE_A">ADMIN</option>
</select>
</div>
<div class="form-group">
<input class="form-check-input" type="checkbox" name="agreement" id="agreement" aria-label="Checkbox for following text input">T&C
  </div>
  
  <div class="container">
    <button type="submit" class="btn btn-primary btn-lg" >Submit</button>
  <button type="reset" class="btn btn-warning btn-lg">Reset</button>
  </div>
</form>

</div>

<div class="col-md-3"></div>
</div>

</div>
</div>
</div>
</div>
</div>

<c:if test="${errorMsg=='Agri' }">
<script type="text/javascript">
swal({
	title: "Alert",
	text:"Please select Terms and Condition",
	icon:"error"
})
</script>
</c:if>

<c:if test="${errorMsg=='Exception' }">
<script type="text/javascript">
swal({
		title:"alert",
		text:"Exception Occurred-Please contact to administrator",
		icon:"error"
})
</script>
</c:if>
<c:if test="${errorMsg=='S' }">
<script type="text/javascript">
swal({
	title:"Alert",
	text:"User Registered Successfuly",
	icon:"success"
})
</script>
</c:if>
<c:if test="${errorMsg=='userExist' }">
<script type="text/javascript">
swal({
	title:"Alert",
	text:"User already registered for this mail.",
	icon:"error"
})
</script>

</c:if>
<c:if test="${formError=='formValidation' }">
<script type="text/javascript">
swal({
	title:"Alert",
	text:"Something went wrong in form submission",
	icon:"error"
})
</script>
</c:if>
</body>
</html>