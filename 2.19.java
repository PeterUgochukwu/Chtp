//java how to program 5th Edition Chapter 2 Exercise 2.19 Solution

//import java packages
import javax.swing.JOptionPane;

public class Circle{
  public static void main (String args[])
  {
    String number;
    String diameter;
    String circumference;
    String area;
    
    int radius;
    
    //input number as String
    number = JOptionPane.showInputDialog("Enter radius of a Circle");
    
    //convert from type string to int
    radius = Integer.parseInt(number);
    
    //intialize string to empty "
    diameter = " ";
    circumference = "";
    area = "";
    
    //compute and concatenate result
    diameter = diameter + "The Diameter is:"+" "+ (radius*2);
    circumference = circumference + "The Circumference is:"+" "+(2*Math.PI*radius);
    area = area +"Area is:"+" "+(Math.PI*(radius*radius));
    
    //display result
    JOptionPane.showMessageDialog(null, diameter+"\n"+circumference+"\n"+area,"Results", JOptionPane.INFORMATION_MESSAGE);
    
    System.exit(0);
  }
}
