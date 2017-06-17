//java how to program 5th Edition Chapter 2 Exercise 2.34 Solution

//import java packages
import javax.swing.JOptionPane;

public class NameDisplay{
  public static void main (String args [])
  {
    String firstName;  //first name to be input as string
    String lastName; //last name to be input as string
    String fullName; //first name and last name concatenated string
    
    
    //input firstName string
    firstName = JOptionPane.showInputDialog("Enter First Name");
    
    //input lastName string
    lastName = JOptionPane.showInputDialog("Enter Last Name");
    
    //initializs fullName as empty string
    fullName = " ";
    
    //concatenate names
    fullName = fullName + firstName +" "+lastName;
    
    //display result
    JOptionPane.showMessageDialog(null, fullName,"Name Display", JOptionPane.INFORMATION_MESSAGE);
    
    System.exit(0);
  }
}
