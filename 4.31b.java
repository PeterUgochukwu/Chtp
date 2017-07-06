//Deitel Java how to program 5th Edition; Chapter 4 exercise 4.31b program solution

import java.text.DecimalFormat;   //class to format numbers
import javax.swing.JOptionPane;  //Java packages

public class Decryption{
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
    String decrypted;
    
    //prompt for input:
    aa= JOptionPane.showInputDialog("Enter 1st Digits to Decypt: ");
    bb =JOptionPane.showInputDialog("Enter 2nd Digit to Decrypt: ");
    cc =JOptionPane.showInputDialog("Enter 3rd Digit to Decrypt: ");
    dd =JOptionPane.showInputDialog("Enter 4th Digit to Decrypt: ");
    
    //convert from type string to double
    a = Double.parseDouble (aa);
    b = Double.parseDouble (bb);
    c = Double.parseDouble (cc);
    d = Double.parseDouble (dd);
    
    //initialize floating point number to two dp.
     DecimalFormat twoDigits = new DecimalFormat("0.00");
    
    //Decrypt Values
    
    aCal = (a*10) -7;
    bCal = (b*10) -7;
    cCal = (c*10) -7;
    dCal = (d*10) -7;
    
    //initialize encrypted string to empty string
    decrypted = " ";
    
    decrypted = twoDigits.format(cCal) +"  " +twoDigits.format(dCal)+"  " +twoDigits.format(aCal) + "  " +twoDigits.format( bCal);
    
    //output result
    JOptionPane.showMessageDialog(null,"Decryted Integers are: "+decrypted, "DECRYPTION SIMULATION", JOptionPane.INFORMATION_MESSAGE);
    
    System.exit(0);
  }
}
