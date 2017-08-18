//Deitel Java how to program 5th Edition; Chapter 5 exercise 5.6 program solution

                      //write an application that finds the smallest of several integers. Assume that the first value read 
                      //specifies the number of values to input from the user.
import javax.swing.*;

public class SmallestSequence{
  public static void main (String args[]){
    int number, nofint,counter;
    int min = 9999;
    
    String input;
    String count;
    
   input =  JOptionPane.showInputDialog("Enter # of integers to be inserted: ");
   //convert input from type string to integer
   nofint = Integer.parseInt(input);
   
   for (counter = 1; counter <= nofint; counter++) 
   {
    count = JOptionPane.showInputDialog("Enter # " +counter + ": ");
    //convert from type string to integer
    number = Integer.parseInt(count);
    
    if (number < min)
      min = number;
   }
   
   //output result
  JOptionPane.showMessageDialog(null, "Smallest is: "+min, "Smallest of Several Integers", JOptionPane.INFORMATION_MESSAGE);
  
  System.exit(0);
    
  }
}

