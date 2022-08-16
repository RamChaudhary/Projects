<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <%@ page isELIgnored="false" %>
    <jsp:include page="../scm_normalUser/navbar.jsp"></jsp:include>
    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View contact</title>
<style type="text/css">
h1
{
text-align: center;
font-weight: bold;
}
.contact-card
{
margin-top: 15px;
}
body {
	
	background-color: navy;
}
.contact-proile
{
width: 40px;
height: 40px;
border-radius: 50%;
border: 0.3px solid;
}

#search-block
{
position: relative;
}
#search-result
{
position: absolute;
background: black;
margin-left: 15px;
margin-right: 15px;
width: 100%;
display: none;
}
</style>
<script type="text/javascript">
function searchName()
{
alert("WIP");
}
</script>
</head>
<body>

<div class="mainContainer">

<div class="card contact-card">
<div class="card-title">
<h1>Your Contacts</h1>

<div class="container" id="search-block">
<div class="input-group flex-nowrap">
  <input type="text" id="name" name="name" onkeyup="searchName()" class="form-control" placeholder="search name..." aria-label="Username" aria-describedby="addon-wrapping">
</div>
</div>
<div class="container" id="search-result">
	<h1>Search result here..</h1>

</div>

</div>
<div class="card-body">
<table class="table">
  <thead>
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Name</th>
      <th scope="col">Phone No</th>
      <th scope="col">About</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${userContactDetails }" var="data">

    <tr>
      <th scope="row"><a href="<%=request.getContextPath()%>/user/viewsContact/${data.id}"> ${data.id }</a></th>  
      <td>
        <img class="contact-proile" src='<c:url value="/img/lotus.png"  />'> 
         <%-- <img class="contact-proile" src='<c:url value="${data.image }"  />'>  --%>
      ${data.name }
      </td>
       <td>${data.phoneNo }</td>
       <td>${data.decription }</td>
       <td>
       <a href="<%=request.getContextPath()%>/user/deleteContact/${data.id }"><button class="btn btn-danger btn-sm">Delete</button></a>
      <a href=""> <button class="btn btn-primary btn-sm">Update</button></a>
       </td>
      
    </tr>
    </c:forEach>
    
  </tbody>
</table>
<c:if test="${totalPage!=0 }">
<nav aria-label="Page navigation example">
  <ul class="pagination">
  <c:if test="${currentPage!=0 }">
    <li class="page-item"><a class="page-link" href="<%=request.getContextPath()%>/user/viewContact/${currentPage-1}">Previous</a></li>
    </c:if>
    <c:forEach var="i" begin="1" end="${totalPage }">
   <c:choose>
   <c:when test="${currentPage==i-1 }">
    <li class="page-item active"><a class="page-link" href="<%=request.getContextPath()%>/user/viewContact/${i-1}">${i }</a></li>
    </c:when>
    <c:otherwise>
        <li class="page-item"><a class="page-link" href="<%=request.getContextPath()%>/user/viewContact/${i-1}">${i }</a></li>
    </c:otherwise>
    </c:choose>
    
    </c:forEach>
<c:if test="${currentPage!=totalPage-1}">
    <li class="page-item"><a class="page-link"  href="<%=request.getContextPath()%>/user/viewContact/${currentPage+1}">Next</a></li>
  </c:if>
  </ul>
</nav>
</c:if>



</div>
</div>

</div>
<c:if test="${deleteStatus =='S'}">
<script type="text/javascript">
swal({
	title:"Alert",
	text:"Data Deleted Sucessfully",
	icon:"success"
})
</script>
</c:if>

<c:if test="${deleteStatus =='E'}">
<script type="text/javascript">
swal({
	title:"Alert",
	text:"Something went wrong! Please try again!!",
	icon:"error"
})
</script>
</c:if>
</body>
</html>