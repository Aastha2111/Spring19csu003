<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<link href="/resources/css/first.css"  
    rel="stylesheet">
    
<title>Insert title here</title>
</head>
<body>

<h1> My Home Page </h1>

<!--  <form action="login" method="get">
<input type="text" name="studentName" placeholder="enter student name"/>
<input type="submit" />
</form>  -->

<form:form action="loginModelAttribute" method="post" modelAttribute="userModel">
user id:<form:input path="userid" />
pwd:<form:input path="pwd" />



<form:button>Login</form:button>
</form:form> 



</body>
</html>