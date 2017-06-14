//Java how to program 5th edition chapter 2 exercise 2.17 solution

//import java packages
import javax.swing.JOptionPane;

public class Compare{
  public static void main(String args[])
  {
    String no1; //first string to be entered by user
    String no2; //second string to be entered by user
    String compare;
    
    int number1;  //first number to compare
    int number2; //second number to compare
    
    //read in first string 
    no1 = JOptionPane.showInputDialog("Enter first number to compare");
    no2 = JOptionPane.showInputDialog("Enter second number to compare");
    
    //convert from type sting to type int
    number1 = Integer.parseInt(no1);
    number2 = Integer.parseInt(no2);
    
    //intialize compare to empty string
    compare = "";
    if (number1>number2)
      compare = compare + number1 +" "+ "is Larger"; //" " is just a empty space seperating the two concatenated strings
    if (number2>number1)
      compare = compare + number2 +" "+ "is Larger";
    if (number1==number2)
      compare = compare +" "+"This numbers are equal";
    
    //Output result
    JOptionPane.showMessageDialog(null, compare, "Comparison Results", JOptionPane.INFORMATION_MESSAGE);
    
    System.exit(0);
  }
}
