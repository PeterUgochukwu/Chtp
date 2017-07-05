//Deitel Java how to program 5th Edition; Chapter 4 exercise 4.16 program solution

//import java packages
import javax.swing.JOptionPane;  //Java packages

public class Table
{
  public static void main (String args [])
  {
    int counter = 1; 
    
    System.out.print("N\t10*N\t100*N\t1000*N\n");
                   while (counter <=10){
    System.out.printf("%d\t%d\t%d\t%d\n", counter, counter *10, counter *100, counter *1000);
                   counter++;
                   }
  }
}
