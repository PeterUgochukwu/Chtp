//Java how to program 5th edition chapter 2 exercise 2.18 solution
//Arithmetic

//java packages
import javax.swing.JOptionPane;  //program uses JOptionPane;

public class Arithmetic{
  public static void main(String args [])
  {
    String firstNumber;
    String secondNumber;
    String thirdNumber;
    String compare;
    
    int number1;
    int number2;
    int number3;
    int sum;
    int average;
    int product;
    
    //read in firstNumber, secondNumber, thirdNumber from user as a string
    firstNumber = JOptionPane.showInputDialog("Enter first integer" );
    secondNumber = JOptionPane.showInputDialog("Enter second integer");
    thirdNumber = JOptionPane.showInputDialog("Enter third integer");
    
    //convert numbers from type string to type int
    number1 = Integer.parseInt(firstNumber);
    number2 = Integer.parseInt(secondNumber);
    number3 = Integer.parseInt(thirdNumber);
    
    //compute numbers
    sum = number1 + number2 + number3;
    product = number1 * number2 * number3;
    average = sum/3;
    
    //initialize compare to empty String
    compare = "";
    
    if (number1>number2 && number1>number3)
    compare = compare + number1 +" "+ "is greater";
    if (number1<number2 && number1<number3)
    compare = compare + number1 +" "+ "is the smallest";
    if (number2>number1 && number2>number3)
    compare = compare + number2+" "+"is Greater";
    if (number2<number1 && number2<number3)
    compare = compare + number2+" "+"is the smallest";
    if(number3>number1 && number3>number2)
    compare = compare + number3+" "+"is greater";
    if(number3<number1 && number3<number2)
    compare = compare + number3+" "+"is the smallest";
    
    //display result
    
    //display result
    JOptionPane.showMessageDialog(null, "the sum is:"+" "+sum+"\n"+"The product is:"+" "+product+"\n"+"the average is:"+" "+average+"\n"+compare, "Results", JOptionPane.INFORMATION_MESSAGE);

    System.exit(0);
