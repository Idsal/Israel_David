/********************
NumberNegativeOrPositive.java
Isral David Salinas Lopez
This program is for know it is negative or positive
*********************/
import javax.swing.JOptionPane;
public class NumberNegativeOrPositive{
  public static void main(String[]args){
    double number;

    number = Double.parseDouble(JOptionPane.showInputDialog("Enter the number "));
    if (number >= 0) {
      JOptionPane.showMessageDialog(null,"The number is positive");
    }else{
      JOptionPane.showMessageDialog(null,"The number is negative");
    }//end if
  }//end main
}//end the program
