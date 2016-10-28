/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Copyright 2016 Tyler Young and William Breen
 */
package elon.business;

import java.io.Serializable;

/**
 *
 * @author tyoung12
 */
public class User implements Serializable {
    
    private String investmentAmount;
    private String yearlyInterestRate;
    private String numberOfYears;
    private String futureValue;
    
    public User() {
        investmentAmount = "";
        yearlyInterestRate = "";
        numberOfYears = "";
        futureValue = "";
    }

    public User(String investmentAmount, String yearlyInterestRate, String numberOfYears) {
        /*throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.*/
    }
    
    public String getInvestmentAmount() {
        return investmentAmount;
    }

    public void setInvestmentAmount(String investmentAmount) {
        this.investmentAmount = investmentAmount;
    }

    public String getYearlyInterestRate() {
        return yearlyInterestRate;
    }

    public void setYearlyInterestRate(String yearlyInterestRate) {
        this.yearlyInterestRate = yearlyInterestRate;
    }

    public String getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(String numberOfYears) {
        this.numberOfYears = numberOfYears;
    }
    
    public String getFutureValue() {
        return futureValue;
    }

    public void setFutureValue(String futureValue) {
        this.futureValue = futureValue;
    }
    
    

}
