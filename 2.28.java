//java how to program 5th Edition Chapter 2 Exercise 2.28 Solution

//import java packages
import javax.swing.JOptionPane;

public class multiple{
  public static void main(String args[])
  {
    String a; // first string to be input by user
    String b; //second string to be input by user
    String multiple;
    
    int c ;
    int d ;
    
    //input fist and second string
    a = JOptionPane.showInputDialog("Enter first Integer:");
    b = JOptionPane.showInputDialog("Enter second Integer:");
    
    //convert from type sting to type int
    
    c = Integer.parseInt(a);
    d = Integer.parseInt(b);
    
    //initialize multiple String to empty string
    multiple= "";
    
    //determine whether the integer inputed is odd or even
    if ( c % d == 0)
      multiple = multiple + c + " "+ "is a multiple of" +" "+d;
    else
      multiple = multiple + c + " "+ "is not a multiple of" +" "+d;
    
    //display result
    JOptionPane.showMessageDialog(null, multiple, "Result", JOptionPane.INFORMATION_MESSAGE);
    
    System.exit(0);
     
  }
}
