//Java how to program 5th edition chapter 2 exercise 2.16 solution
//Arithmetic

//java packages
import javax.swing.JOptionPane;  //program uses JOptionPane;

public class Arithmetic{
  public static void main(String args [])
  {
    String firstNumber;
    String secondNumber;
    
    int number1;
    int number2;
    int sum;
    int product;
    int difference;
    int division;
    
    //read in firstNumber, secondNumber, thirdNumber from user as a string
    firstNumber = JOptionPane.showInputDialog("Enter first integer" );
    secondNumber = JOptionPane.showInputDialog("Enter second integer");
    
    //convert numbers from type string to type int
    number1 = Integer.parseInt(firstNumber);
    number2 = Integer.parseInt(secondNumber);
    
    //compute numbers
    sum = number1 + number2;
    product = number1 * number2;
    difference = number1 - number2;
    division = number1/number2;
    
    //display result
    
    JOptionPane.showMessageDialog(null,"The sum is: "+" " + sum +"\n"+ "The Product is "+" " + product+"\n"+ "The Difference is "+" " +difference
    +"\n"+"The quotient is "+" "+division, "Results", JOptionPane.INFORMATION_MESSAGE);
    
    System.exit(0);
