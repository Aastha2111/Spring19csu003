<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<br>
<br>

<!-- student name: ${param.studentName} -->

<h1>${msg} login successfully !!</h1>
<form action="login" method="post" >
<input type="text" name="userid" placeholder="Type userid here">
<input type="password" name="pwd" placeholder="Type password here">
<button>Login</button>
</form>



</body>
</html>