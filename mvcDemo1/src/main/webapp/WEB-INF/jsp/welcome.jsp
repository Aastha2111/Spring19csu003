<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>${msg} welcomes u in first Spring mvc project!!</h2>
<form action="login" method="post">
<input type="text" name="userId" placeholder="enter user name">
<input type="password" name="pwd" placeholder="enter user pwd">
<button>login</button>
</form>

</body>
</html>