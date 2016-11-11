/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Copyright 2016 Tyler Young and William Breen
 */
package elon.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.DecimalFormat;
import elon.business.User;

/**
 *
 * @author tyoung12
 */
@WebServlet(name = "CalculatorServlet", urlPatterns = {"/calculate"})




/**
 *
 * @author tyoung12
 */
public class CalculatorServlet extends HttpServlet {

   
    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        
        String url = "/index.jsp";
        String action = request.getParameter("action");
        System.out.println(action);
       
        if (action == null) {
            action = "join";  
        }
        if (action.equals("join")) {
            url = "/index.jsp";    
        } 
        else if (action.equals("add")){    
        String investmentAmount = request.getParameter("investmentAmount");
        System.out.println(investmentAmount);
        String yearlyInterestRate = request.getParameter("yearlyInterestRate");
        String numberOfYears = request.getParameter("numberOfYears");
        
        double futureValue = Double.parseDouble(investmentAmount);
        int counter = 0;
        int years = Integer.parseInt(numberOfYears);
        while (counter < years){
            futureValue = futureValue + (futureValue * (Double.parseDouble(yearlyInterestRate)/100));
            counter++;
        }
        futureValue = Math.round(futureValue*100);
        futureValue = futureValue/100;
        
        double amount = Double.parseDouble(investmentAmount);
        //amount = Math.round(amount * 100);
        //amount = amount/100;
        //DecimalFormat df = new DecimalFormat("##.00");
        //df.format(amount);
        String currentVal = String.format("%.2f", amount);
        
        double rate = Double.parseDouble(yearlyInterestRate);
        
        
        User user = new User();
        user.setInvestmentAmount(currentVal);
        user.setYearlyInterestRate(Double.toString(rate));
        user.setNumberOfYears(numberOfYears);
        user.setFutureValue(Double.toString(futureValue));
        System.out.println(user.getFutureValue());
       
        request.setAttribute("user", user);
       
       String[] madeMoney = new String[years];
       double futureValueYears = Double.parseDouble(investmentAmount);
       for(int i = 0; i < years; i++) {
           futureValueYears = futureValueYears + (futureValueYears * (Double.parseDouble(yearlyInterestRate)/100));
           madeMoney[i] = (String.format("%.2f",futureValueYears));
            
        }
       request.setAttribute("madeMoney", madeMoney);
       url = "/calculate.jsp";
        }
        
      
        
    
    getServletContext().getRequestDispatcher(url).forward(request, response);
}
        
     @Override
        protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response); 
       
        }
}