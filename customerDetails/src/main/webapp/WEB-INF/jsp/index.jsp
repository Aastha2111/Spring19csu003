<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<link href="resources/css/cust1.css"  rel="stylesheet">
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>AdmissionPage</title>		
	</head>
	<body>		
	<br><br><br>
	<img src="resources/image/mvc-image2.PNG"/>	
	<br><br><br>
	
		<h2>${welcome_msg}</h2>
		<br><br>
		<form action="reg" method="post">
		<hr />		
<!--		<a id="en" href="/customerDetails/myCust/init?lang=en">English</a> | <a id="fr" href="/customerDetails/myCust/init?lang=fr">French</a>  -->
		<a id="en" href="/customerDetails/init?lang=en">English</a> | <a id="fr" href="/customerDetails/init?lang=fr">French</a> 
		<div>&nbsp;</div>
		
		<div id="welcome_text">			
			<h4><spring:message code="index.message" /></h4>
			<br>
			<h4><spring:message code="index1.message" /></h4>
		</div>
		<br><br>
		<button><spring:message code="button.message" /></button>
		</form>
	</body>
</html>
