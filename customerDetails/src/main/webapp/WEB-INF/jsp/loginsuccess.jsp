<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link href="resources/css/cust1.css"  rel="stylesheet">

</head>
<body  >

<h1 >     Account created Successful    </h1>
<br>
<br>
<%-- <h1>   ${Name} Account Details   </h1>
<br>
<h1> Lname    :  ${LName}</h1>
<br>
<h1> Email Id :  ${Email}</h1>
<br>
<h1> Contact  :  ${Contact}</h1>
<br>
<h1> Gender   :  ${Gender}</h1>
<br>
<h1> Address  :  ${Address}</h1>
<br>
<h1> State    :  ${State}</h1>
<br>
<h1> Country  :  ${Country}</h1>
<br>
 --%>
 
<h1>  THANK YOU :  <c:out value="${UserModel.userid}"></c:out> FOR REGISTRATION </h1>
<br>
<%-- <h1>   Hello  :  <c:out value="${UserModel.lname}"></c:out> </h1>
<br> --%>
<h1> Email Id :  <c:out value="${UserModel.email}"></c:out></h1>
<br>
<h1> phno     :  <c:out value="${UserModel.phno}"></c:out></h1>
<br>
<h1> Gender   :  <c:out value="${UserModel.gender}"></c:out></h1>
<br>
<br>
<h1> Area     :  <c:out value="${UserModel.addr}"></c:out></h1>
<br>
<h1> State    :  <c:out value="${UserModel.state}"></c:out></h1>
<br>
<h1> Country   :  <c:out value="${UserModel.country}"></c:out></h1>
<br> 
<br>
<h1> CourseCode : <c:out value="${UserModel.courseCode}"></c:out></h1>
<br> 

<!--

<form action="upd" method="post">

<button>update</button>


 -->
</body>
</html>