//Deitel Java how to program 5th Edition; Chapter 4 exercise 4.17 program solution

//import java packages
import javax.swing.JOptionPane;  //Java packages

public class TwoLargestNumber{
  public static void main (String args [])
  {
    int salesCounter = 1;
    int number;
    int largest= 0;
    
    
    String input;
    
    
    while ( salesCounter <=10)
    {
      input = JOptionPane.showInputDialog ("Enter sales digit number: ");
      
      //convert from type string to int
      number = Integer.parseInt(input);
      
      if (salesCounter == 1){
        largest = number;
      }else
      {
        largest = (number > largest ? number : largest);
      }
      
      salesCounter = salesCounter + 1;
    } //end while
    
      JOptionPane.showMessageDialog(null, "Largest value is: "+largest , "Largest Integer", JOptionPane.INFORMATION_MESSAGE);
    
    
    
    
    
    System.exit(0);
  }
}
