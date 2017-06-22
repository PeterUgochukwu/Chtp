//Deitel Java how to program 5th Edition; Chapter 4 exercise 4.11 program solution

import java.text.DecimalFormat;   //class to format numbers
import javax.swing.JOptionPane;  //Java packages

public class GasMileage{
  public static void main (String args [])
  {
    int milesDriven;          // number of miles driven
    int gallonUsed;           // number of gallon used
    double average;          //average of the numbers
    
    String miles;          //miles to be entered as string
    String gallon;         //gallon used to be entered as string
    
    //first miles and gallon
    miles = JOptionPane.showInputDialog("Enter Miles Driven:");
    //convert miles to int
    milesDriven = Integer.parseInt(miles);
    
    gallon= JOptionPane.showInputDialog("Enter Gallons Used:");
    //convert gallons to int
    gallonUsed = Integer.parseInt(gallon);
    
    //termination phase
    DecimalFormat twoDigits = new DecimalFormat("0.00");
    
    //calcualte average
      average = (double) milesDriven/gallonUsed;
      
      //display message with two digits of precision
      JOptionPane.showMessageDialog(null, "The miles/gallon for this tank was:  " + twoDigits.format(average), "Gas Mileage", JOptionPane.INFORMATION_MESSAGE); 
    
      
  }
}
