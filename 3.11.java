//Java How to Program 5th Edition Chapter 3 Exercise 3.11 Program Solution
//import java packages
import java.awt.Graphics;
import javax.swing.*;

public class ComparisonApplet extends JApplet {

	String largest;
	String smallest;
	//initialize applet by obtaining values from user
		public void init()
		{
			String number1; //first string to be entered by user
		    String number2; //second string to be entered by user
		    String number3; //third string to be entered by user
		    String number4; //fourth string to be entered by user
		    String number5; //fifth string to be entered by user
		    
		    double no1;  //first number to compare
		    double no2; //second number to compare
		    double no3; //third number to compare
		    double no4; //fourth number to compare
		    double no5; //fifth number to compare
		    
		    //read in strings
		    number1 = JOptionPane.showInputDialog("Enter first number to compare");
		    number2 = JOptionPane.showInputDialog("Enter second number to compare");
		    number3 = JOptionPane.showInputDialog("Enter third number to compare");
		    number4 = JOptionPane.showInputDialog("Enter fourth number to compare");
		    number5 = JOptionPane.showInputDialog("Enter fifth number to compare");
		    
		  //convert from type sting to type double
		    no1 = Double.parseDouble(number1);
		    no2 = Double.parseDouble(number2);
		    no3 = Double.parseDouble(number3);
		    no4 = Double.parseDouble(number4);
		    no5 = Double.parseDouble(number5);
		    
		  //intialize  largest and smallest to empty string
		    largest = "";
		    smallest = "";
		    
		    //compare numbers
		    if(no1>no2 && no1>no3 && no1>no4 && no1>no5)
		    	largest = largest + no1 + "  Is the Largest";
		    if(no1<no2 && no1<no3 && no1<no4 && no1<no5)
		    	smallest = smallest + no1 + "  Is the Smallest";
		    if(no2>no1 && no2>no3 && no2>no4 && no2>no5)
		    	largest = largest + no2 + "  Is the Largest";
		    if(no2<no1 && no2<no3 && no2<no4 && no1<no5)
		    	smallest = smallest + no2 + "  Is the Smallest";
		    if(no3>no1 && no3>no2 && no3>no4 && no3>no5)
		    	largest = largest + no3 + "  Is the Largest";
		    if(no3<no1 && no3<no2 && no3<no4 && no3<no5)
		    	smallest = smallest + no3 + "  Is the Smallest";
		    if(no4>no1 && no4>no2 && no4>no3 && no4>no5)
		    	largest = largest + no4 + "  Is the Largest";
		    if(no4<no1 && no4<no2 && no4<no3 && no4<no5)
		    	smallest = smallest + no4 + "  Is the Smallest";
		    if(no5>no1 && no5>no2 && no5>no3 && no5>no4)
		    	largest = largest + no5 + "  Is the Largest";
		    if(no5<no1 && no5<no2 && no5<no3 && no5<no4)
		    	smallest = smallest + no5 + "  Is the Smallest";
		}
		//draw results in a rectangle on applet's background
		public void paint (Graphics g)
		{
			//call superclass version of method paint
			super.paint(g);
			
			//draw rectangle starting from (15,10) at (270 pixels wide, 20 pixels tall
			g.drawRect(15, 10, 270, 45);
			
			//draw results as a String at (25,25)
			g.drawString(largest, 25, 25);
			g.drawString(smallest, 25, 40);
		}
	

}
