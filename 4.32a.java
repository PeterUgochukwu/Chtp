//Deitel Java how to program 5th Edition; Chapter 4 exercise 4.32a program solution
//factorial

//import java packages
import javax.swing.JOptionPane;

public class Factorial{
  public static void main (String args []){
    int number = 0;
    int factorial = 1;
    int backup;
    
    String input;
    
    input = JOptionPane.showInputDialog("Enter a positive integer: ");
    //convert from type stringto int
    number = Integer.parseInt(input);
    
    while (number < 0 ){
      input = JOptionPane.showInputDialog ("Enter a positive integer: ");
      number = Integer.parseInt(input);
    }
    
    backup = number;
    
    //calculating factorial
    while (number != 0){
      factorial *= number;
      number--;
    }
    
    //output result
    JOptionPane.showMessageDialog(null, backup+" !"+" = "+factorial, "FACTORIAL", JOptionPane.INFORMATION_MESSAGE);
    
    System.exit(0);
  }
}

