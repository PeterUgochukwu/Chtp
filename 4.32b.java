//Deitel Java how to program 5th Edition; Chapter 4 exercise 4.32b program solution

//import java packages
import java.text.DecimalFormat;   //class to format numbers
import javax.swing.JOptionPane;

public class Exponential{
  public static void main (String args []){
    
    double e = 2.7182817459;
    double approx = 0.0;
    double precision;
    double denominator_factorial = 1;
    int counter = 0;
    int counter_backup;
    
    String input;
    
    //prompt for input
    input = JOptionPane.showInputDialog("Insert desired precision ([0,1] interval, thanks..)");
    //convert from type string to double
    precision = Double.parseDouble(input);
    
    DecimalFormat tenDigits = new DecimalFormat("0.0000000000");
    
    while (e - approx > precision){
      
      counter_backup = counter;
      
      //calculating factorial 
      while (counter >=0){
        denominator_factorial = (counter > 0 ? denominator_factorial * counter : denominator_factorial * 1);
        
        counter--;
      }
      
      approx = approx * (double) 1 / denominator_factorial;
      denominator_factorial = 1;
      counter = counter_backup;
    }
    
    //output result
    
    JOptionPane.showMessageDialog(null, "e = "+tenDigits.format(e) +"\n"+"approx = "+tenDigits.format(approx)+"diff = "+tenDigits.format(e-approx), "EXPONENTIAL",JOptionPane.INFORMATION_MESSAGE);
    
    System.exit(0);
  }
}
