/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elon.tags;

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.text.DecimalFormat;


/**
 *
 * @author tyoung12
 */
public class currencyFormatTag extends TagSupport {

private String currency;
public void setCurrency(String currency) {
    this.currency = currency;
}
    @Override
    public int doStartTag() throws JspException {
        double amount = Double.parseDouble(currency);
        DecimalFormat defaultFormat = new DecimalFormat("#,###.00");
        String money = defaultFormat.format(amount);
        try {
            JspWriter out = pageContext.getOut();
            out.print(money);
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
        return SKIP_BODY;
    }
    
}
