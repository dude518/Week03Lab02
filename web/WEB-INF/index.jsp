<%-- 
    Document   : index
    Created on : Sep 28, 2017, 1:07:07 PM
    Author     : 578291
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:import url="/includes/header.html"/>
<h1>Simple JSP Calculator</h1>
<div>
    <form action="calculator" method="POST">
        First: <input type="text" name="first"><br/>
        Second: <input type="text" name="second"><br/>
        <input type="submit" name="operation" value="+"> <input type="submit" name="operation" value="-"> 
        <input type="submit" name="operation" value="*"> <input type="submit" name="operation" value="%">
    </form>
</div>
<br/>
<c:if test="${finish == true}">
    <p>RESULT: ${result}</p>
</c:if>
<c:if test="${finish == false}">
    <p> ${message}</p>
</c:if>
<c:import url="/includes/footer.html"/>
