<%-- 
    Document   : index
    Created on : Oct 28, 2016, 12:09:20 AM
    Author     : Copyright 2016 Tyler Young and William Breen
--%>


<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>CSC330 Homework 2</title>
        <link rel="stylesheet" href="styles/main.css"/>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    
    <body>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
     <c:import url="/Includes/header.jsp"/>
     <div id="input">
        <form action="calculate" method="post">
       <input type="hidden" name="action" value="add">
       
            <p class="InvestmentAmount"><label>Investment Amount</label>
            <input id="InvestmentAmountText" name="investmentAmount" type="number" min="0" autofocus required/></p>
            <p class="YearlyInterestRate"><label>Yearly Interest Rate</label>
            <input id="YearlyInterestRateText" name="yearlyInterestRate" type="number" required/></p>
            <p class="NumberOfYears"><label>Number Of Years</label>
            <input id="NumberOfYearsText" name="numberOfYears" type="text" placeholder="Integer number of years" pattern="^\d+$" required/></p>
            <p class="CalculateButton"><input type="submit" id="Calculate" value="Calculate"/></p> 
       </form>
     </div>
   <c:import url="/Includes/footer.jsp"/>
    </body>
</html>
