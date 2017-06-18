//Java How to Program 5th Edition Chapter 3 Exercise 3.12 Program Solution
//import java packages
import java.awt.Graphics;
import javax.swing.*;

public class StringApplet extends JApplet {

			public void paint (Graphics g)
			{
				//call superclass version of method paint
				super.paint(g);
				
				//draw results as a String at (25,25)
				g.drawString("*", 25, 25);
				g.drawString("***", 25, 55);
				g.drawString("*****", 25, 85);
				g.drawString("****", 25, 70);
				g.drawString("**", 25,40);
			}
}
