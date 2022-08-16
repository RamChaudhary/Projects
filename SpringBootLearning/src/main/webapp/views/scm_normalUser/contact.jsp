<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page isELIgnored="false" %>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <jsp:include page="../scm_normalUser/navbar.jsp"></jsp:include>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Contact</title>
<style type="text/css">
.input-group
{
margin-bottom: 8px;
}
</style>
 
</head>
<body style="background-color: navy;">
<div class="mainContainer">

<div class="row ">
	<div class="col-md-1">
	
	</div>
	<div class="col-md-10 mt-2">
		<form action="<%=request.getContextPath() %>/user/saveContact" method="post" enctype="multipart/form-data" >
		<div class="card">
		<div class="card-title text-center"><h1>Add Contact</h1></div>
		<div class="card-body">
		
      <div class="input-group">
        <div class="input-group-prepend">
          <div class="input-group-text">@</div>
        </div>
        <input type="text" class="form-control" id="inlineFormInputGroupUsername" placeholder="Enter name" name="name" id="name">
      </div>
      <div class="input-group">
        <div class="input-group-prepend">
          <div class="input-group-text">@</div>
        </div>
        <input type="text" class="form-control" id="inlineFormInputGroupUsername" placeholder="Nick Name" name="nickNmae" id="nickNmae">
      </div>
      
      <div class="input-group">
        <div class="input-group-prepend">
          <div class="input-group-text">@</div>
        </div>
        <input type="text" class="form-control" id="inlineFormInputGroupUsername" placeholder="Enter you work" name="work" id="work">
      </div>
      
      <div class="input-group">
        <div class="input-group-prepend">
          <div class="input-group-text">@</div>
        </div>
        <input type="email" class="form-control" id="inlineFormInputGroupUsername" placeholder="Enter email" name="email" id="email">
      </div>
      
      <div class="input-group">
        <div class="input-group-prepend">
          <div class="input-group-text">@</div>
        </div>
        <input type="number" class="form-control" id="inlineFormInputGroupUsername" placeholder="Enter phone no" name="phoneNo" id="phoneNo">
      </div>
      
      <div class="input-group">
       
        <textarea  rows="10" class="form-control" id="mytextarea"  placeholder="Enter Description" name="decription"></textarea>
      </div>
      
   <div class="input-group">
    <input type="file" class="custom-file-input"  name="profileImage" >
    <label class="custom-file-label" for="validatedCustomFile">Choose Profile picture...</label>
  </div>
      <button type="submit" class="btn btn-success btn-lg">Save</button>
		<button type="reset" class="btn btn-danger btn-lg">Cancel</button>
    
		</div>
		
		</div>
		
		</form>
			
	</div>
	<div class="col-md-1">
	
	</div>

</div>
</div>


<c:if test="${save=='S' }">
<script type="text/javascript">
swal({
	title:"Alert",
	text:"Contact have beeen saved sucessfuly",
	icon:"success"
})
</script>
</c:if>

  <script src="https://cdn.tiny.cloud/1/no-api-key/tinymce/5/tinymce.min.js" referrerpolicy="origin"></script>

    <script>
      tinymce.init({
        selector: '#mytextarea'
      });
    </script>
</body>
</html>