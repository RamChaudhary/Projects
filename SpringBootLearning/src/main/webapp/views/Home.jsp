<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<h1 style="text-align: center;font-weight: bold;text-decoration: underline;">--- Spring Boot Practical ---</h1>


<table>
<tr>
<td>File uploading</td>
<td>
<a href="<%=request.getContextPath()%>/FileUploadingAction/UploadFile">Click here</a>
</td>
</tr>

<tr>
<td>Server side validation Form</td>
<td>
<a href="<%=request.getContextPath()%>/ServerSideValidationController/openForm">Click here</a>
</td>
</tr>

<tr>
<td><b>Smart contact Manager project</b> </td>
<td>
<a href="<%=request.getContextPath()%>/ContactManagerController/Home">Click here</a>
</td>
</tr>
</table>
</body>
</html>