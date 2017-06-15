//java how to program 5th Edition Chapter 2 Exercise 2.26 Solution

//import javax packages
import javax.swing.JOptionPane;

public class Comparison{
  public static void main(String args[])
  {
    String aVal; //first string input by user
    String bVal; //second string input by user
    String cVal; //third String input by user
    String dVal; //fourth String input by user
    String eVal; //fifth string input by user
    String compare; 
    
    int a; //first number to compare
    int b; //second number to compare
    int c; //third number to compare
    int d; //fourth number to compare
    int e; //fifth number to compare
    
    // read first-fifth integers as string
    aVal = JOptionPane.showInputDialog("Enter first Integer:");
    bVal = JOptionPane.showInputDialog("Enter second Integer:");
    cVal = JOptionPane.showInputDialog("Enter third Integer:");
    dVal = JOptionPane.showInputDialog("Enter fourth Integer:");
    eVal = JOptionPane.showInputDialog("Enter firth Integer:");
    
    //convert from type String to type int
    a = Integer.parseInt(aVal);
    b = Integer.parseInt(bVal);
    c = Integer.parseInt(cVal);
    d = Integer.parseInt(dVal);
    e = Integer.parseInt(eVal);
    
    //intialize compare to empty string
    compare = " ";
    //compare a
    if(a>b && a>c && a>d && a>e)
      compare = compare + a +" "+ "is the Largest" +"\n";
    if(a<b && a<c && a<d && a<e)
      compare= compare+a+" "+ "Is the Smallest" +"\n";
    
    //compare b
    if(b>a && b>c && b>d && b>e)
      compare = compare + b +" "+ "is the Largest" +"\n";
    if(b<a && b<c && b<d &&b<e)
      compare = compare + b +" "+ "is the Smallest" +"\n";
    
    //compare c
    if(c>a && c>b && c>d && c>e)
      compare = compare + c +" "+ "is the Largest" +"\n";
    if(c<a && c<b && c<d && c<e)
      compare = compare + c +" "+ "is the Smallest" +"\n";
    
    //compare d
    if(d>a && d>b && d>c && d>e)
      compare = compare + d +" "+ "is the Largest" +"\n";
    if(d<a&& d<b && d<c && d<e)
      compare = compare + d +" "+ "is the Smallest" +"\n";
 
    //compare e
    if(e>a && e>b && e>c && e>d)
      compare = compare + e +" "+ "is the Largest" +"\n";
    if(e<a && e<b && e<c && e<d)
      compare = compare + e +" "+ "is the Smallest" +"\n";
   
    
    //display result
    JOptionPane.showMessageDialog(null, compare, "Result", JOptionPane.INFORMATION_MESSAGE);
    
    System.exit(0);
      
      
  }
}
