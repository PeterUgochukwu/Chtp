//Deitel Java how to program 5th Edition; Chapter 4 exercise 4.24 program solution
//palindrome tester

import javax.swing.JOptionPane;

public class PalindromeTester{
  public static void main (String args[]){
    
    int number  = 0;
    int firstDigit = 0;
    int secondDigit = 0;
    int thirdDigit = 0;
    int fourthDigit = 0;
    int fifthDigit = 0;
    
    String input;
    
    //read in an integer;
    input = JOptionPane.showInputDialog("Insert a number: ");
    //convert from type string to int
    number = Integer.parseInt(input);
    
    //compute
    firstDigit = number / 10000;
    secondDigit = (number % 10000) / 1000;
    thirdDigit = (number % 1000) / 100;
    fourthDigit  = (number % 100) / 10;
    fifthDigit = (number % 10);
    
    //display integers
    JOptionPane.showMessageDialog(null, "1st Digit: "+firstDigit+"\n"+"2nd Digit: "+secondDigit+"\n"+"3rd Digit: "+thirdDigit+"\n"+"4th Digit: "+fourthDigit+"\n"+"5th Digit: "+fifthDigit, "Palindrome Tester", JOptionPane.INFORMATION_MESSAGE);
    
    //determine and output result
    if ((firstDigit == fifthDigit) && (secondDigit == fourthDigit)){
      JOptionPane.showMessageDialog(null, "Number: "+number+ "  is a palindrome\n", "Palindrome Tester", JOptionPane.INFORMATION_MESSAGE);
    }else{
      JOptionPane.showMessageDialog(null, "Number: "+number+ "  NOT a palindrome\n", "Palindrome Tester", JOptionPane.INFORMATION_MESSAGE);
    }
  }
}
