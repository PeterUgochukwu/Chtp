//import java packages
import java.awt.Graphics;
import javax.swing.*;

public class ArithmeticApplet extends JApplet {

	double sum; // sum of values entered by user
	double product; //product of values entered by user
	double difference; //difference of values entered by user
	double quotient; //division of values entered by user
	
	//initialize applet by obtaining values from user
	public void init()
	{
		String firstNumber; //first string entered by user
		String secondNumber; //second string entered by user
		
		double number1; //first number to add/multiply/subtract/divide
		double number2; //second number to add/multiply/subtract/divide
		
		//obtain string from user
		firstNumber = JOptionPane.showInputDialog("Enter first floating number");
		secondNumber = JOptionPane.showInputDialog("Enter second floating number");
		
		//convert from type string to type double
		number1= Double.parseDouble(firstNumber);
		number2= Double.parseDouble(secondNumber);
		
		//compute numbers
		sum = number1 + number2;
		product= number1 * number2;
		difference = number1 - number2;
		quotient = number1 / number2;
		
	}
	//draw results in a rectangle on applet's background
	public void paint (Graphics g)
	{
		//call superclass version of method paint
		super.paint(g);
		
		//draw rectangle starting from (15,10) at (270 pixels wide, 80 pixels tall
		g.drawRect(15, 10, 270, 80);
		
		//draw results as a String at (25,25)
		g.drawString("The sum is: " + sum,25, 25);
		g.drawString("The product is: "+product, 25,40);
		g.drawString("The difference is: " + difference, 25, 55);
		g.drawString("The quotient is: " + quotient, 25, 70);
	
	}

}
