//Deitel Java how to program 5th Edition; Chapter 4 exercise 4.31a program solution

import java.text.DecimalFormat;   //class to format numbers
import javax.swing.JOptionPane;  //Java packages

public class Encryption{
  public static void main (String args[]){
    double a;
    double b;
    double c;
    double d;
    double aCal, bCal, cCal, dCal;
    
    String aa;
    String bb;
    String cc;
    String dd;
    String encrypted;
    
    //prompt for input:
    aa= JOptionPane.showInputDialog("Enter 1st Digits to Encrypt: ");
    bb =JOptionPane.showInputDialog("Enter 2nd Digit to Encrypt: ");
    cc =JOptionPane.showInputDialog("Enter 3rd Digit to Encrypt: ");
    dd =JOptionPane.showInputDialog("Enter 4th Digit to Encrypt: ");
    
    //convert from type string to double
    a = Double.parseDouble (aa);
    b = Double.parseDouble (bb);
    c = Double.parseDouble (cc);
    d = Double.parseDouble (dd);
    
    DecimalFormat twoDigits = new DecimalFormat("0.00");
    
    // processing phase
    aCal = (double) (a+7) / 10;
    bCal = (double) (b+7) / 10;
    cCal = (double) (c+7) /10;
    dCal = (double) (d+7) /10;
    
    //initialize encrypted string to empty string
    encrypted = " ";
    
    encrypted = twoDigits.format(cCal) +"  " +twoDigits.format(dCal)+"  " +twoDigits.format(aCal) + "  " +twoDigits.format( bCal);
    
    //output result
    JOptionPane.showMessageDialog(null,"Encryted Integers are: "+encrypted, "ENCRYPTION SIMULATION", JOptionPane.INFORMATION_MESSAGE);
    
    System.exit(0);
    
  }
}
