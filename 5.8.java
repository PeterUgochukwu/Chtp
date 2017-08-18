//Deitel Java how to program 5th Edition; Chapter 5 exercise 5.8 program solution

                              //factorials are used frequently in probability problems. The factorial of a positive integer n
                              //(written n! and pronounced as "n factorial")is equal to the product of the positive integers from 1 to n.
                              //write an application that evaluates the factorials of the integers from 1 to 5. Displays the results in tabular format
                             //in a JTextArea that is displayed on a message dialog.
import javax.swing.*;

public class Factorial_1{
  public static void main (String args [])
  {
    int factorial = 1, n;
    
    //create JTextArea to display output
    JTextArea outputTextArea = new JTextArea();
    
    //set first line of text in outputTextArea
    outputTextArea.setText("number\tFactorial\n");
    
    for (n=1; n <=5; n++){
      factorial *=n;
      
      //append one line of text to outputTextArea
      outputTextArea.append(n + "\t" + factorial + "\n");
    }
    
    //display results
    JOptionPane.showMessageDialog(null, outputTextArea, "Factorial of 1-5", JOptionPane.INFORMATION_MESSAGE);
    
    System.exit(0);
  }
}
