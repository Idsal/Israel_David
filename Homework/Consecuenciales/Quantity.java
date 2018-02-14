/**********
Quantity.java
Israel David Salinas Lopez
This program calculates
************/
import javax.swing.JOptionPane;
public class Quantity{
  public static void main(String[]args){
    Double one, two, three;

    one = Double.parseDouble(JOptionPane.showInputDialog("Enter the number one"));
    two = Double.parseDouble(JOptionPane.showInputDialog("Enter the number two"));
    three = Double.parseDouble(JOptionPane.showInputDialog("Enter the number three"));

    if (one > two && one > three ) {
      JOptionPane.showMessageDialog(null,"Number one is higher "+one);
        } else  if (two > one && two > three ) {
          JOptionPane.showMessageDialog(null,"Number two is higher "+two);
        }  else if (three > one && three > two) {
          JOptionPane.showMessageDialog(null,"Number three is higher "+three);
    }//end if
  }//end main
}//end the program
