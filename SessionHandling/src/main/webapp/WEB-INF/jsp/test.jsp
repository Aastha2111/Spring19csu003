<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<link href="resources/css/Session.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>

<h1>CUSTOMER CONTACT DETAILS</h1>
  <table>
    <tr>
      <td>NAME</td>
      <td>${user.fname} ${user.lname}</td>
    </tr>
     <tr>
      <td>CONTACT EMAIL DETAILS  </td>
      <td>${user.email}</td>
    </tr>
     
     </table>
</body>
</html>