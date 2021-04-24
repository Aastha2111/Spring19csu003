<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="resources/css/cust1.css" rel="stylesheet">

<title>Insert title here</title>

<style>
		.error {color:red}
	</style>
	
</head>
<body>


<img src="resources/image/welcome.PNG"/>	
<br>
<!-- <h1>Welcome Page </h1> -->
<h1> Welcome to the customer Registeration Portal </h1>
<i> Asterisk (*) means compulsory fields required.</i>

<br>
<br>


<form:form action="login" method="post" modelAttribute="UserModel">

First Name :  <form:input path="userid"/>
<br>
<br>
LastName(*) :  <form:input path="lname"/>
<form:errors path="lname" cssClass="error" />
<br>
<br>
Email Id(*)  :  <form:input path="email"/>
<form:errors path="email" cssClass="error"></form:errors>
<br>
<br>
Password  :  <form:input path="pwd" type="password"/>
<br>
<br>
Contact no(*):  <form:input path="phno" />
<form:errors path="phno" cssClass="error"></form:errors>
<br>
<br>
Gender     :  
Male: <form:radiobutton path="gender" value="Male"/>
Female: <form:radiobutton path="gender" value="Female"/>

<br>
<br>
Address   : <form:input path="addr" />
<br>
<br>
State     : <form:input path="state" />
<br>
<br>

Country : <form:select path="country">  
        <form:option value="India" label="India"/>  
        <form:option value="China" label="China"/>  
        <form:option value="UK" label="UK"/>  
        <form:option value="Brazil" label="Brazil"/>  
        </form:select>  
<br>
 <br>
CourseCode(*) :<form:input path="courseCode" />
<form:errors path="courseCode" cssClass="error" />
<br> 
<br>


<form:button>SIGN UP</form:button>
</form:form>

</body>
</html>








