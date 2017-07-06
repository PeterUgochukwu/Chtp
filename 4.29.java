//Deitel Java how to program 5th Edition; Chapter 4 exercise 4.29 program solution

import javax.swing.JOptionPane;

public class Triangle2{
  public static void main (String args []){
    double side1;
    double side2;
    double side3;
    
    String input1;
    String input2;
    String input3;
    
    //prompt for input
    input1 = JOptionPane.showInputDialog("Enter side1 segment ");
    input2 = JOptionPane.showInputDialog("Enter side2 segment ");
    input3 = JOptionPane.showInputDialog("Enter side3 segment ");
    
    //convert from string to double
    side1 = Double.parseDouble(input1);
    side2 = Double.parseDouble(input2);
    side3 = Double.parseDouble(input3);
    
    //compute result
    if (side1 == side2 && side1 == side3 && side2 == side3){
      JOptionPane.showMessageDialog(null, "This segments could represent sides of the triangles! ", "SIDES OF A TRIANGLE", JOptionPane.INFORMATION_MESSAGE);
    }else{
      JOptionPane.showMessageDialog(null, "This segments could NOT represent sides of the triangles! ", "SIDES OF A TRIANGLE", JOptionPane.INFORMATION_MESSAGE);
    }
    
    System.exit(0);
    
  }
}
