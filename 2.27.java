//java how to program 5th Edition Chapter 2 Exercise 2.27 Solution

//import java packages
import javax.swing.JOptionPane;

public class oddEven{
  public static void main(String args[])
  {
    String x; // string to be input by user
    String oddEven;
    
    int y ;
    
    //input integer string
    x = JOptionPane.showInputDialog("Enter an Integer:");
    
    //convert from type sting to type int
    
    y = Integer.parseInt(x);
    
    //initialize oddEven to empty string
    oddEven= "";
    
    //determine whether the integer inputed is odd or even
    if ( y % 2 == 1)
      oddEven = oddEven + "Number is Odd";
    else if (y % 2 == 0)
      oddEven = oddEven + "Number is Even";
    
    //display result
    JOptionPane.showMessageDialog(null, oddEven, "Result", JOptionPane.INFORMATION_MESSAGE);
    
    System.exit(0);
     
  }
}
