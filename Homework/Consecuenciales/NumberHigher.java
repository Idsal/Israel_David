/******************
NumberHigher.java
Israel David Salinas Lopez
This program detected number higher
bigger number

********************/
import javax.swing.JOptionPane;
public class NumberHigher{
  public static void main(String[]args){
    int numberOne, numberTwo;

    numberOne = Integer.parseInt(JOptionPane.showInputDialog("Enter the number one"));
    numberTwo = Integer.parseInt(JOptionPane.showInputDialog("Enter the number two"));

    if (numberOne > numberTwo) {
      JOptionPane.showMessageDialog(null,"Nunmber one is higher "+numberOne+" and number two is less "+numberTwo);
    }else if (numberTwo > numberOne) {
      JOptionPane.showMessageDialog(null,"Number two is higher "+numberTwo+" and number one is less "+numberOne);
    }//end if
  }//end main
}//end the program
