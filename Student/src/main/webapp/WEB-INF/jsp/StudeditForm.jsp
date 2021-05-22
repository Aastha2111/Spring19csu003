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
 <h1>EDIT STUDENT DETAILS</h1>  
       <%-- <form:form method="POST" action="/SpringMVCCRUDSimple/editsave"> --%>    
       
       <form:form method="POST" action="editsave">
        <table >    
       <tr>    
          <td>id : </td>   
          <td><form:input path="id"  /></td>  
         </tr>    
         <tr>    
          <td>Name : </td>   
          <td><form:input path="name"  /></td>  
         </tr>    
         <tr>    
          <td>department :</td>    
          <td><form:input path="dept_name" /></td>  
         </tr>   
         <tr>    
          <td>marks :</td>    
          <td><form:input path="marks" /></td>  
         </tr>   
           
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Edit Save" /></td>    
         </tr>    
        </table>    
       </form:form>    


</body>
</html>