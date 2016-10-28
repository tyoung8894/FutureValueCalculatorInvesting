<%-- 
    Document   : newjsp
    Created on : Oct 27, 2016, 10:30:51 PM
    Author     : Tyler Young and William Breen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>



   
 <html id="calc">
     <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title> 
    </head>
 
 <body id="calcjsp">
     <jsp:useBean id="user" scope="request" class="elon.business.User"/>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <c:import url="/Includes/header.jsp" />
 <label>Investment Amount:</label>
 <span>&#36;<jsp:getProperty name="user" property="investmentAmount"/></span><br>
    <label>Yearly Interest Rate:</label>
    <span><jsp:getProperty name="user" property="yearlyInterestRate"/></span><br>
    <label id="numyearslabel">Number Of Years:</label>
    <span><jsp:getProperty name="user" property="numberOfYears"/></span><br>
    <label id="futurevaluelabel">Future Value:</label>
    <span>&#36;<jsp:getProperty name="user" property="futureValue"/></span><br>
      <c:import url="/Includes/footer.jsp" />
 </body>
 
 
</html>