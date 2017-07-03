//Deitel Java how to program 5th Edition; Chapter 4 exercise 4.14 program solution

//import java packages
import java.text.DecimalFormat;   //class to format numbers
import javax.swing.JOptionPane;  //Java packages

public class SalaryCalculator{
  public static void main(String args [])
  {
    double hRate; // initalize hourly rate
    double salary; //initialize total salary pay
    int hrs; //initialize no of hours
    
    String rate; // String input rate
    String time; //String input time
    
    //prompt for input
    time = JOptionPane.showInputDialog("Enter number of hrs worked: ");
    rate = JOptionPane.showInputDialog("Enter hourly rate: ");
    
    //convert from type string to type integer and double
    hrs = Integer.parseInt(time);
    hRate = Double.parseDouble(rate);
    
    //calculate salary
    salary = (double) hRate * hrs;
    
    //termination phase
    DecimalFormat twoDigits = new DecimalFormat("0.00");
    
    //output salary
    if (hrs <=40)
      JOptionPane.showMessageDialog(null, "Your gross pay is: "+twoDigits.format(salary), "Salary Calculator", JOptionPane.INFORMATION_MESSAGE);
    
    if (hrs > 40){
      salary = (double) hRate * (0.5 + hrs);
      JOptionPane.showMessageDialog(null, "Your gross pay is: "+twoDigits.format(salary), "Salary Calculator" , JOptionPane.INFORMATION_MESSAGE);
      
    }
    
    System.exit(0);
      
  }
}
