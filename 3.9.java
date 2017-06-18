//Java how to program 5th edition chapter 3 exercise 3.9 solution

import java.awt.Graphics;
import javax.swing.*;

public class Arithmetic2 extends JApplet {

	double sum;
	double average;
	double product;
	String larger;
	String smaller;
	//initialize applet by obtaining values from user
	  public void init()
	  {
		  String firstNumber; //first number to be entered as a string
		  String secondNumber; //second number to be entered as a string
		  String thirdNumber; //third number to be entered as a string
		  
		  double number1; //first number to calculate
		  double number2; //second number to calculate
		  double number3; //third number to calculate
		  
		//obtain numbers from user
		    firstNumber = JOptionPane.showInputDialog("Enter first floating number");
		    secondNumber = JOptionPane.showInputDialog("Enter second floating number");
		    thirdNumber = JOptionPane.showInputDialog("Enter third floating number");
		 
		  //convert from type string to int
		    number1 = Double.parseDouble(firstNumber);
		    number2 = Double.parseDouble(secondNumber);
		    number3 = Double.parseDouble(thirdNumber);
		    
		  //compute the sum, average and product
		    sum = number1 + number2 + number3;
		    average = sum / 3;
		    product = number1 * number2 * number3;
		  //intialize larger and smaller to empty string
		      larger = "";
		      smaller = "";
		      //compare numbers
		      if (number1>number2 && number1>number3)
		        larger = larger + number1 + " is Larger";
		      if (number2>number1 && number2>number3)
		        larger = larger + number2 + "  is Larger";
		      if(number3>number1 && number3>number2)
		    	larger = larger + number3 + "  is Larger";
		      if (number1<number2 && number1<number3)
			        smaller = smaller + number1 + " is Smaller";
			      if (number2<number1 && number2<number3)
			        smaller = smaller + number2 + "  is Smaller";
			      if(number3<number1 && number3<number2)
			    	smaller = smaller + number3 + "  is Smaller";
		     
	  }
	//draw results in a rectangle on applet's background
	    public void paint (Graphics g)
	    {
	      //call superclass version of method paint
	      super.paint(g);
	      
	      //draw rectangle starting from (15, 10) that is 270 pixles wid and 20 pixels tall
	      g.drawRect(15, 10, 270, 90);
	      
	      //draw results as a string at (25, 25, 40, 55, 70, 85)
	      g.drawString("The sum is:  " + sum, 25, 25);
	      g.drawString("The average is:  "+average,25, 40);
	      g.drawString("The product is:  "+product, 25, 55);
	      g.drawString(larger, 25, 70);
	      g.drawString(smaller,25, 85);
	                   
	    }

}
