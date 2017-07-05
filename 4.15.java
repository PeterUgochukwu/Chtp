//Deitel Java how to program 5th Edition; Chapter 4 exercise 4.15 program solution

//import java packages
import javax.swing.JOptionPane;  //Java packages

public class LargestNumber{
  public static void main (String args [])
  {
    int salesCounter = 1; //initalizing counter
    int number; 
    int largest= 0;   //initializing largest value
    int largest_ID=0; //initalizing largest_ID
  
    
    String input;
    
    //loop 10 times and increment counter
    while ( salesCounter <=10)
    {
      input = JOptionPane.showInputDialog ("Enter sales digit number: ");
      
      //convert from type string to int
      number = Integer.parseInt(input);
      
      //if number is larger, largest value gets the number
      if (number > largest){
        largest = number;
        largest_ID = salesCounter;  //this determines the position of the largest value
      }
      //increment salesCounter
      
      salesCounter = salesCounter + 1;
    } //end while
    
    //output result
    
      JOptionPane.showMessageDialog(null, "Largest value is: "+largest + "\n"+"Position: "+largest_ID, "Largest Integer", JOptionPane.INFORMATION_MESSAGE);
    
    
    System.exit(0);
  }
}
