//Java How to Program 5th Edition Chapter 3 Exercise 3.15 Program Solution

import java.awt.Graphics;
import javax.swing.*;

public class DrawRectApplet extends JApplet {
	double xCordinate;
	double yCordinate;
	double width;
	double height;
	//initialize applet by obtaining values from user
	  public void init()
	  {
		  String x;
		  String y;
		  String a;
		  String b;
		  
		  x = JOptionPane.showInputDialog("Enter the x-cordinate to draw rectangle");
		  y = JOptionPane.showInputDialog("Enter the y-cordinate to draw rectangle");
		  a = JOptionPane.showInputDialog("Enter the width of the rectangle");
		  b = JOptionPane.showInputDialog("Enter the height of the rectangle");
		  
		//convert from type string to double
		  xCordinate = Double.parseDouble(x);
		  yCordinate = Double.parseDouble(y);
		  width = Double.parseDouble(a);
		  height = Double.parseDouble(b);
		  
	  }
	//draw results in a rectangle on applet's background
	    public void paint (Graphics g)
	    {
	    	//call superclass version of method paint
		      super.paint(g);
		      
		      //draw rectangle starting from (15, 10) that is 270 pixels wide and 20 pixels tall
		      
		      g.drawRect(xCordinate,yCordinate, width,height);

}
}
