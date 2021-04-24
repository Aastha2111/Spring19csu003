<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="resources/css/cust1.css"  rel="stylesheet">
<link href="resources/image/welcome.png"  rel="stylesheet">

<!-- <img src="resources/css/welcome.jfif"/> -->	

<title>Insert title here</title>
</head>
<body>

<!-- <img src="resources/image/welcome.jfif"/> -->	
<br>
<h1>Update Page </h1>
<br>
<br>


<form:form action="final" method="post" modelAttribute="UpdateModel">

<br>
FirstName : <form:input path="userid" />
<br>
LastName :  <form:input path="lname" />
<br>

Email Id :  <form:input path="email" />
<br>
Password :  <form:input path="pwd" type="password"/>
<br>
Contact  :  <form:input path="phno" />
<br>
Gender   :  
Male: <form:radiobutton path="gender" value="Male"/>
Female: <form:radiobutton path="gender" value="Female"/>

<br>
Address  :  <form:input path="addr" />
<br>
State    :  <form:input path="state" />
<br>
Country  :  <form:input path="country" />
<br>
<br>

<form:button>CONFIRM</form:button>
</form:form>

</body>
</html>








