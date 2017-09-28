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
    <form action="index.jsp" method="GET">
        First: <input type="text" name="first"><br/>
        Second: <input type="text" name="second"><br/>
        <input type="submit" name="operation" value="+"> <input type="submit" name="operation" value="-"> 
        <input type="submit" name="operation" value="*"> <input type="submit" name="operation" value="%">
    </form>
</div>
<br/>
<p>RESULT: ${result}</p>
<c:import url="/includes/footer.html"/>
