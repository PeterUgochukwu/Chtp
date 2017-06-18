//Java How to Program 5th Edition Chapter 3 Exercise 3.14 Program Solution

import java.awt.Graphics;
import javax.swing.*;


public class RectangleApplet extends JApplet {
	
	//draw results in a rectangle on applet's background
    public void paint (Graphics g)
    {
    	//call superclass version of method paint
	      super.paint(g);
	      
	      //draw rectangle starting from (15, 10) that is 270 pixels wid and 20 pixels tall
	      
	      g.drawRect(15,10,270,20);
	      g.drawRect(20,50, 230 , 40);//draw rectangle starting from (20, 50) that is 230 pixels wide and 40 pixels tall
	      g.drawRect(90, 100, 100, 50); //draw rectangle starting from (90, 100) that is 100 pixels wide and 50 pixels tall
    }
	

}
