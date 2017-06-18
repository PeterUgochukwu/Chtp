//Java How to Program 5th Edition Chapter 3 Exercise 3.10 Program Solution
//import java packaes
import java.awt.Graphics;
import javax.swing.*;

public class CirceApplet extends JApplet {
	double diameter;
	double circumference;
	double area;
	//initialize applet by obtaining values from user
	  public void init()
	  {
		  String number; //String number to be input
		  
		  double radius; //radius to calculate
		 
		  
		 number = JOptionPane.showInputDialog("Enter radius of a cirlce");
		 
		//convert from type string to double
		 radius = Double.parseDouble(number);
		 
		 //calculate results
		 diameter = 2 * radius;
		 circumference = 2 * Math.PI * radius;
		 area = Math.PI * (radius * radius);
		 
	  }
	  //draw results in a rectangle on applet's background
	    public void paint (Graphics g)
	    {
	    	//call superclass version of method paint
		      super.paint(g);
		      
		      //draw rectangle starting from (15, 10) that is 270 pixles wid and 60 pixels tall
		      g.drawRect(15, 10, 270, 60);
		      
		    //draw results as a string at (25, 25, 40, 55)
		      g.drawString("The diameter is  " + diameter, 25, 25);
		      g.drawString("The Circumference is: "+circumference, 25, 40);
		      g.drawString("The area is: "+area, 25, 55);
	    }

}
