//Deitel Java how to program 5th Edition; Chapter 5 exercise 5.9 program solution
//calculating compound interest

import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.*;

public class CompoundInterest{
  public static void main (String args[])
  {
    double amount1;
    double amount2;
    double amount3;
    double amount4;
    double amount5;
    double amount6;
    
    double principal = 1000.0;
    double rate = 0.05;
    double rate2 = 0.06;
    double rate3 = 0.07;
    double rate4 = 0.08;
    double rate5 = 0.09;
    double rate6 = 0.1;
    
    NumberFormat moneyFormat = NumberFormat.getCurrencyInstance(Locale.US);
    
    JTextArea outputTextArea = new JTextArea(17, 20);
    JScrollPane Scroller = new JScrollPane(outputTextArea);
    
    outputTextArea.setText("Year\tAmount on deposit\n");
    
    for(int year = 1; year <=10; year++){ //for amount1
      amount1 = principal *Math.pow(1.0+rate,year);
      
      outputTextArea.append(year + "\t" + moneyFormat.format(amount1) +"\n") ;
    }
    outputTextArea.append("\n"); //for new line
    
    for(int year = 1; year <=10; year++){ //for amount2;
      amount2 = principal * Math.pow(1.0+rate2,year);
      
      outputTextArea.append(year + "\t"+ moneyFormat.format(amount2) +"\n");
    }
    outputTextArea.append("\n");
    for(int year = 1; year <=10; year++)
    {
      amount3 = principal * Math.pow(1.0+rate3,year);
      
       outputTextArea.append(year + "\t"+ moneyFormat.format(amount3) +"\n");
    }
    outputTextArea.append("\n");
    for(int year = 1; year <=10; year++)
    {
      amount4 = principal * Math.pow(1.0+rate4,year);
      
       outputTextArea.append(year + "\t"+ moneyFormat.format(amount4) +"\n");
    }
    outputTextArea.append("\n");
    for(int year = 1; year <=10; year++)
    {
      amount5 = principal * Math.pow(1.0+rate5,year);
      
       outputTextArea.append(year + "\t"+ moneyFormat.format(amount5) +"\n");
    }
    outputTextArea.append("\n");
    for(int year = 1; year <=10; year++)
    {
      amount6 = principal * Math.pow(1.0+rate6,year);
      
       outputTextArea.append(year + "\t"+ moneyFormat.format(amount6) +"\n");
    }
    
    
    JOptionPane.showMessageDialog(null, Scroller, "Compound Interest", JOptionPane.INFORMATION_MESSAGE);
    
    System.exit(0);
  }
}
