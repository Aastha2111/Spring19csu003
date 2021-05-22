<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
      <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
      
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="resources/css/Student.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
<h1>STUDENT DETAILS</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>Name</th><th>Department</th><th>Marks</th><th>Edit</th><th>Delete</th></tr>  
   <c:forEach var="stud" items="${list}">   
   <tr>  
   <td>${stud.id}</td>  
   <td>${stud.name}</td>  
   <td>${stud.dept_name}</td>  
   <td>${stud.marks}</td>  
   <td><a href="editemp/${stud.id}">Edit</a></td>  
   <td><a href="deleteemp/${stud.id}">Delete</a></td>  
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   <a href="StudForm">Add New STUDENT</a>  


</body>
</html>