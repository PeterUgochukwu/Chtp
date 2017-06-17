//import java packages
import java.awt.Graphics;
import javax.swing.*;

public class CompareApplet extends JApplet {
 String compare;
 //initialize applet by obtaining values from user
  public void init(){
   String no1; //first string to be entered by user
      String no2; //second string to be entered by user
      
      double number1;  //first number to compare
      double number2; //second number to compare
      
    //read in first and second string 
      no1 = JOptionPane.showInputDialog("Enter first number to compare");
      no2 = JOptionPane.showInputDialog("Enter second number to compare");
      
      //convert from type sting to type int
      number1 = Double.parseDouble(no1);
      number2 = Double.parseDouble(no2);
      
      //intialize compare to empty string
      compare = "";
      //compare numbers
      if (number1>number2)
        compare = compare + number1 +" "+ "is Larger"; //" " is just a empty space seperating the two concatenated strings
      if (number2>number1)
        compare = compare + number2 +" "+ "is Larger";
      if (number1==number2)
        compare = compare +" "+"This numbers are equal";
  }
      
    //draw results in a rectangle on applet's background
   public void paint (Graphics g)
   {
    //call superclass version of method paint
    super.paint(g);
    
    //draw rectangle starting from (15,10) at (270 pixels wide, 20 pixels tall
    g.drawRect(15, 10, 270, 20);
    
    //draw results as a String at (25,25)
    g.drawString(compare, 25, 25);
   }
  

}
