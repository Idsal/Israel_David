/****
GreatestNumber.java
Israel David Salinas Lopez
This program finds the greatest of three numbers
******/
import javax.swing.JOptionPane;
public class GreatestNumber{
  public static void main(String[] args) {
  double numberOne, numberTwo, numberThree;
  numberOne =
  Double.parseDouble(JOptionPane.showInputDialog("Enter the first number"));
  numberTwo =
  Double.parseDouble(JOptionPane.showInputDialog("Enter the second number"));
  numberThree =
  Double.parseDouble(JOptionPane.showInputDialog("Enter the third number"));
  if (numberOne > numberTwo){
    if (numberOne > numberThree){
      JOptionPane.showMessageDialog(null, "The greatest number is"+ numberThree);

    }//end if
  }//end if
  if (numberTwo > numberOne){
    if (numberTwo > numberThree){
      JOptionPane.showMessageDialog(null, "The greatest number is"+ numberThree);

    }//end if
  }//end if
  if (numberThree > numberOne){
    if (numberThree > numberTwo){
      JOptionPane.showMessageDialog(null, "The greatest number is"+ numberThree);

    }//end if
  }//end if

  if (numberOne > numberTwo && numberOne > numberThree){
    JOptionPane.showMessageDialog(null, "The greastest number is "+ numberOne);
  }else if (numberTwo > numberOne && numberTwo >numberThree) {
    JOptionPane.showMessageDialog(null, " Teh greastest number "+ numberTwo);
  }else if ( numberThree > numberOne && numberThree > numberTwo) {
    JOptionPane.showMessageDialog(null, "The greatest number is "+ numberThree)
  }else JOptionPane.showMessageDialog(null, "Enter a correct number ";
   {

  }
  }
  }
