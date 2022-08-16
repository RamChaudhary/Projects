<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Upload file page</title>
</head>
<body>
<h1 style="text-align: center;text-decoration: underline;">File upload page</h1>

<form action="<%=request.getContextPath()%>/FileUploadingAction/file-upload" method="post" enctype="multipart/form-data">
<input type="file" name="fileId" id=fileId/>

<button type="submit">Submit</button>
</form>
</body>
</html>