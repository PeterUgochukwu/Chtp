//Deitel Java how to program 5th Edition; Chapter 4 exercise 4.30 program solution

import javax.swing.JOptionPane;

public class Triangle{
  public static void main (String args []){
    double hypo;
    double side1;
    double side2;
    
    String input1;
    String input2;
    String input3;
    
    //prompt for input
    input1 = JOptionPane.showInputDialog("Enter hypo segment ");
    input2 = JOptionPane.showInputDialog("Enter side1 segment ");
    input3 = JOptionPane.showInputDialog("Enter side2 segment ");
    
    //convert from string to double
    hypo = Double.parseDouble(input1);
    side1 = Double.parseDouble(input2);
    side2 = Double.parseDouble(input3);
    
    //compute result
    if ((hypo*hypo == side1 * side1 + side2 * side2) || (side1 * side1 == hypo * hypo - side2 * side2) || (side2 * side2 == hypo * hypo - side1 * side1)){
      JOptionPane.showMessageDialog(null, "This segments could represent sides of the right triangles! ", "SIDES OF A RIGHT ANGLE TRIANGLE", JOptionPane.INFORMATION_MESSAGE);
    }else{
      JOptionPane.showMessageDialog(null, "This segments could NOT represent sides of the right triangles! ", "SIDES OF A RIGHT ANGLE TRIANGLE", JOptionPane.INFORMATION_MESSAGE);
    }
    
    System.exit(0);
    
  }
}
