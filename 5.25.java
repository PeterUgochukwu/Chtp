//Deitel Java how to program 5th Edition; Chapter 5 exercise 5.25 program solution
//The Twelve Days of Christmas song Program

//Write an application that uses repetition and switch statement to print the song "The Twelve Days of christmas"
//One switch statement should be used to print the day(i.e., "First.", "Second", etc). A seperate statement should be
//used to print the remainder of each verse.

import javax.swing.JOptionPane;

public class TwelveDays{
  public static void main (String args [])
  {
    for(int counter = 1; counter <= 12 ; counter++)
    {
      switch (counter)
      {
        case 1:
        JOptionPane.showMessageDialog(null, "On the First day of Christmas\n     my true love sent to me: ");
        break;
        
        case 2:
          JOptionPane.showMessageDialog(null, "On the Second day of Christmas\n     my true love sent to me: ");
          break;
          
        case 3:
          JOptionPane.showMessageDialog(null, "On the Third day of Christmas\n     my true love sent to me:  ");
          break;
          
        case 4:
          JOptionPane.showMessageDialog(null, "On the Fourth day of Christmas\n     my true love sent to me:  ");
          break;
          
        case 5:
          JOptionPane.showMessageDialog(null, "On the Fifth day of Christmas\n     my true love sent to me:  ");
          break;
          
        case 6:
          JOptionPane.showMessageDialog(null, "On the Sixth day of Christmas\n     my true love sent to me:  ");
          break;
          
        case 7:
          JOptionPane.showMessageDialog(null, "On the Seventh day of Christmas\n     my true love sent to me:  ");
          break;
          
        case 8:
          JOptionPane.showMessageDialog(null, "On the Eight day of Christmas\n     my true love sent to me:  ");
          break;
          
        case 9:
          JOptionPane.showMessageDialog(null, "On the Nineth day of Christmas\n     my true love sent to me:  ");
          break;
          
        case 10:
          JOptionPane.showMessageDialog(null, "On the Tenth day of Christmas\n     my true love sent to me:  ");
          break;
          
        case 11:
          JOptionPane.showMessageDialog(null, "On the Eleventh day of Christmas\n     my true love sent to me:  ");
          break;
          
        case 12:
          JOptionPane.showMessageDialog(null, "On the Twelfth day of Christmas\n     my true love sent to me:  ");
          break;
          
      }
      switch (counter)
      {
        case 12:
          JOptionPane.showMessageDialog(null, "    12 Drummers Drumming");
        case 11:
          JOptionPane.showMessageDialog(null, "    Eleven Pipers Piping");
        case 10:
          JOptionPane.showMessageDialog(null, "    Ten Lords a Leaping");
        case 9:
          JOptionPane.showMessageDialog(null, "    Nine Ladies Dancing");
        case 8:
          JOptionPane.showMessageDialog(null, "   Eight Maid a Milking");
        case 7:
          JOptionPane.showMessageDialog(null, "    Seven swans a Swimming");
        case 6:
          JOptionPane.showMessageDialog(null, "    Six Geesee a laying");
        case 5:
          JOptionPane.showMessageDialog(null, "    Five Golden Rings");
        case 4:
          JOptionPane.showMessageDialog(null, "    Four colly Birds");
        case 3:
          JOptionPane.showMessageDialog(null, "    Three French Hens");
        case 2:
          JOptionPane.showMessageDialog(null, "    Two Turtle Doves");
        case 1:
          JOptionPane.showMessageDialog(null, "  A Partidge in a Pear Tree");
          
      }
    }
  }
}
