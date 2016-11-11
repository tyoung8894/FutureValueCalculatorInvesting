/**
    Document   : currencyFormatTag
    Created on : Nov 10, 2016, 7:30:51 PM
    Author     : Tyler Young and Dominic Vernazza
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
        String dolarSign = "$";
        money = dolarSign + money;
        try {
            JspWriter out = pageContext.getOut();
            out.print(money);
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
        return SKIP_BODY;
    }
    
}
