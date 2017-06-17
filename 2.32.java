//java how to program 5th Edition Chapter 2 Exercise 2.32 Solution

//import java packages
import javax.swing.JOptionPane;

public class Seperate{
  public static void main(String args[])
  {
    String firstNumber;  //no to be inputed as string
    
    int number;
    int one;
    int two;
    int thr;
    int fou;
    int fiv;
    
    //input integers as string 
    firstNumber = JOptionPane.showInputDialog("Enter a five digit number");
    
    //convert from type string to int.
    
    number = Integer.parseInt(firstNumber);
    
    //compute
    one = number / 10000;
    two = (number % 10000) / 1000;
    thr = ((number % 10000) % 1000) / 100;
    fou = (((number % 10000) % 1000) % 100) / 10;
    fiv = ((((number % 10000) % 1000) % 100) % 10) / 1;
    
    //display result
    
    JOptionPane.showMessageDialog(null, one +" " + two +" "+ thr + " "+fou +" "+fiv , "Result",JOptionPane.INFORMATION_MESSAGE);
    
    System.exit(0);
    
    
  }
}
