
<%-- 
    Document   : newjsp
    Created on : Oct 27, 2016, 10:30:51 PM
    Author     : Tyler Young and William Breen
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="elon" uri="/WEB-INF/elon.tld" %>
<!DOCTYPE html>
 <html id="calc">
     <head>
         <meta charset="utf-8">
        <title>JSP Page</title> 
        <link rel="stylesheet" href="styles/main.css"/>
    </head>
 <body id="calcjsp">
    <c:import url="/Includes/header.jsp" />
    <label>Investment Amount:</label>
    <span><elon:currencyFormat currency="${user.investmentAmount}"/></span><br>
    <label>Yearly Interest Rate:</label>
    <span>${user.yearlyInterestRate}</span><br>
    <label id="numyearslabel">Number Of Years:</label>
    <span>${user.numberOfYears}</span><br>
    <label id="futurevaluelabel">Future Value:</label>
    <span><elon:currencyFormat currency="${user.futureValue}"/></span><br>
    <div class="column">
    <ul>
        <p><b>Years</b></p>
        <c:forEach items="${madeMoney}" var="number" begin="0" end="${user.numberOfYears}" step="1" varStatus="status">
            <li>${status.count}</li>
        </c:forEach>
            
    </ul>
    </div>
    <div class="column">
    <ul>
        <p><b>Value</b></p>
        <c:forEach items="${madeMoney}" var="number" begin="0" end="${user.numberOfYears}" step="1" varStatus="status">
            <li><elon:currencyFormat currency="${madeMoney[status.index]}"/></li>
        </c:forEach>
    </ul>
 </div>
    <br>
    <a href="index.jsp"> Return to Calculator</a>
      <c:import url="/Includes/footer.jsp" />
 </body>
</html>