//this applet calculates the Hypotenus of a right angled triangle

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Hypotenus extends JApplet implements ActionListener {
	JLabel side1Label, side2Label, resultLabel;
	JTextField side1Field, side2Field, resultField;
	
	//create GUI Components
	public void init()
	{
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		
		side1Label = new JLabel("Enter side1:");
		side1Field = new JTextField(10);
		container.add(side1Label);
		container.add(side1Field);
		
		side2Label = new JLabel("Enter side2:");
		side2Field = new JTextField(10);
		container.add(side2Label);
		container.add(side2Field);
		
		side2Field.addActionListener(this);
		
		resultLabel = new JLabel ("Hypotenus is: ");
		resultField = new JTextField(15);
		resultField.setEditable(false);
		container.add(resultLabel);
		container.add(resultField);
		
	}
	
	public void actionPerformed (ActionEvent event)
	{
		double side1, side2, hypo = 0;
		
		side1 = Double.parseDouble(side1Field.getText());
		side2 = Double.parseDouble(side2Field.getText());
		
		showStatus("Calculating.........");
		
		hypo = hypotenus(side1, side2); //hypo calls method hypotenus to calculate and return result;
		
		showStatus("Done!");
		resultField.setText(Double.toString(hypo) );
		
	}
	
	public double hypotenus(double x, double y)
	{
		double result = Math.sqrt((x*x) + (y*y));
		
		return result;
	}

}
