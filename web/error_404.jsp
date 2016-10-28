<%-- 
    Document   : error_404
    Created on : Oct 27, 2016, 11:05:01 PM
    Author     : Tyler Young and William Breen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="styles/main.css"/>
        <title>CSC330 Homework 2</title>
    </head>
    <body>
        <h1>404 Error</h1>
        <p id="error">The server was not able to find the file you requested.</br>
            To continue, click the Back button.</p>
         <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
         <c:import url="/Includes/footer.jsp" />
    </body>
</html>
