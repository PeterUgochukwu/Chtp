//Deitel Java how to program 5th Edition; Chapter 5 exercise 5.7 program solution

                                  //write an application that calculates the product of the odd integers from 1 to 15 
                                  //and displays the results in a message dialog
import javax.swing.*;

public class OddIntegers{
  public static void main (String args [])
  {
    int x,odd, product = 1;
    
    String output = "";
    for (x = 1; x <=15; x+=2){
     odd =product;
     product *=x;
     
     output = odd + " * " + x + " = " + product ;
     JOptionPane.showMessageDialog(null,output, "Product of Odd from 1-15", JOptionPane.INFORMATION_MESSAGE);
    }
    
    System.exit(0);
  }
  
}
