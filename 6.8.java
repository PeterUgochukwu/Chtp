//Parking charges of three cars parked in the garage for some specific hour < 24hrs

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class ParkingCharges extends JApplet implements ActionListener {
	
	JLabel car1Label,car2Label,car3Label, resultLabel; //initialize variable for the gui
	JTextField car1Field, car2Field, car3Field;
	JTextArea outputArea;
	
	//Set up GUI
	public void init()
	{
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		
		car1Label = new JLabel("Car 1 Parking hours: ");
		container.add(car1Label);
		car1Field = new JTextField(10);
		container.add(car1Field);
		
		car2Label = new JLabel("Car 2 Parking hours: ");
		container.add(car2Label);
		car2Field = new JTextField(10);
		container.add(car2Field);
		
		car3Label = new JLabel("Car 3 Parking hours: ");
		container.add(car3Label);
		car3Field = new JTextField(10);
		container.add(car3Field);
		
		car3Field.addActionListener(this);
		
		resultLabel = new JLabel("Parking Charges");
		container.add(resultLabel);
		
		outputArea = new JTextArea();
		container.add(outputArea);
		outputArea.setEditable(false);
		
	}
	
	public void actionPerformed (ActionEvent actionEvent)
	 {
	  double car1hrs, car2hrs, car3hrs, totalhrs = 0;
	  double car1chg, car2chg, car3chg, totalchg = 0;
	  String header,para1,para2,para3,total;
	  
	  car1hrs = Double.parseDouble(car1Field.getText() );
	  car2hrs = Double.parseDouble(car2Field.getText() );
	  car3hrs = Double.parseDouble(car3Field.getText() );
	  
	  showStatus ("Calculating......!") ;
	    
	  totalhrs = car1hrs + car2hrs + car3hrs;  //total of the three cars
	  
	  car1chg = calculateCharges(car1hrs); //call method calculateCharges to calculate the charges of the hours of the car packed and return result
	  car2chg = calculateCharges(car2hrs);
	  car3chg = calculateCharges(car3hrs);
	  
	  totalchg = car1chg + car2chg + car3chg;
	  
	  
	  showStatus("Done");
	  
	  header = "cars" + "\t" + "Hours" + "\t " + "Charges" + "\n";
	   para1 = "1" +"\t" + Double.toString(car1hrs) + "\t" + "$"+ Double.toString(car1chg) +"\n";
	   para2 = "2" +"\t" + Double.toString(car2hrs) + "\t" + "$"+Double.toString(car2chg) +"\n";
	   para3 = "3" +"\t" + Double.toString(car3hrs) + "\t" + "$"+ Double.toString(car3chg) +"\n" +"\n";
	   total = "Total" + "\t" + Double.toString(totalhrs) + "\t" +  "$"+Double.toString(totalchg);
	  
	  outputArea.setText(header + para1 + para2 + para3 + total);
	  
	  //clear Field text for other transactions
	  car1Field.setText("");
	  car2Field.setText("");
	  car3Field.setText("");
	   
	  
	  
	 }
	 
	 public double calculateCharges(double hours)
	 {
	  if ((hours - 3.0) <= 0)
	   return 2.0;
	      else if ((hours == 24.0))
	   return 10;
	      else
	   return (Math.ceil(hours) - 3) * 0.5 + 2;
	 }

	}
