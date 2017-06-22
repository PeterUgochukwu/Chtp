//Deitel Java how to program 5th Edition; Chapter 4 exercise 4.12 program solution

import java.text.DecimalFormat;   //class to format numbers
import javax.swing.JOptionPane;  //Java packages

public class CreditLimit{
  public static void main (String args[])
  {
    int accountNumber;  //number of the account
    int bBalance;      // number of beginning balance of the month
    int tCharged;  // number of the total charged by the customer this month 
    int cApplied;  // number of the credits applied 
    int aCredit;  // number of the allowed credit;
    double nBalance;  //number of the calculated new balance
    
    String account;  
    String balance;  
    String charges; 
    String applied;
    String credit;
    
    //initialization phase
    nBalance = 0;  //initalize new balance
    
    //processing phase
    //get strings from user
    account = JOptionPane.showInputDialog("Enter account number");
    //convert from type string to integer
    accountNumber = Integer.parseInt(account);
    
    balance = JOptionPane.showInputDialog("Enter balance at the beginning of the month");
    //convert from type string to integer
    bBalance = Integer.parseInt(balance);
    
    charges = JOptionPane.showInputDialog("Enter total of all items charged by the customer this month");
    //convert from type string to integer
    tCharged = Integer.parseInt(charges);
    
    applied = JOptionPane.showInputDialog("Enter total of all credits applied to the customer's account this month");
    //convert from type string to integer
    cApplied = Integer.parseInt(applied);
    
    credit = JOptionPane.showInputDialog("Enter the allowed credit limit");
    //convert from type string to integer
    aCredit = Integer.parseInt(credit);
    
    //termination phase
    DecimalFormat twoDigits = new DecimalFormat("0.00");
    
  //calculate new balance
    nBalance =(double) (bBalance + tCharged ) - (cApplied + aCredit);
    
    JOptionPane.showMessageDialog(null, "The new Balance is: "+twoDigits.format(nBalance), "Credit Limit", JOptionPane.INFORMATION_MESSAGE);
    
    //determine if new balance exceed credit limit
    if (nBalance < aCredit)
      JOptionPane.showMessageDialog(null, "The new Balance is: "+twoDigits.format(nBalance) + "\nCredit Limit Exceeded", "Credit Limit", JOptionPane.INFORMATION_MESSAGE);
    
    System.exit(0);
    
    
  }
}
