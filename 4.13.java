//Deitel Java how to program 5th Edition; Chapter 4 exercise 4.13 program solution

//import java packages
import java.text.DecimalFormat;   //class to format numbers
import javax.swing.JOptionPane;  //Java packages

public class Sales {
  public static void main (String args[])
  {
    double itemSold; //totoal amount of item sold
    double salary; //salary for the sales person 
    
    String input; //string to prompt for input
    
    input = JOptionPane.showInputDialog("Enter total merchandise sold this week: ");
    
    //convert from type String to type Double
    itemSold = Double.parseDouble(input);
    
    //compute 
    
    salary = (double) 200 + (0.09 * itemSold) ;
    
    //termination phase
    DecimalFormat twoDigits = new DecimalFormat("0.00");
    
    //display output
    JOptionPane.showMessageDialog(null,"Your Earning is: "+twoDigits.format( salary ), "Sales Payment", JOptionPane.INFORMATION_MESSAGE);
    
    System.exit(0);
  }
}
