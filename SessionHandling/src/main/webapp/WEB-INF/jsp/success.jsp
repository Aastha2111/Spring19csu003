<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
    
<!DOCTYPE html>
<html>
<head><meta charset="ISO-8859-1">
<link href="resources/css/Session.css" rel="stylesheet">
<title>successful login</title>
</head>
<body>

 <h1>Login Successfully!!</h1>
  <p>You are logged in with email ${user.email}.</p>
 
  <!-- Click here to view the session attributes -->
  
  <c:set var="contextPath" value="${pageContext.request.contextPath}"/>
  <a href="${contextPath}/info">CUSTOMER DETAILS(session data)</a>
  <br>
   <c:set var="contextPath" value="${pageContext.request.contextPath}"/>
  <a href="${contextPath}/info2">CUSTOMER CONTACT DETAILS(session data)</a>
  <br>
    <spring:url value="/edit/${user.email}" var="deleteURL" />
     <a href="${deleteURL }">EDIT</a>


</body>
</html>