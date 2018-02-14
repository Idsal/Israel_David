/*************
Grapes.java
Israel David Salinas Lopez
The program is to determine how many kilos are selling
**************/
import javax.swing.JOptionPane;
public class Grapes{
  public static void main(String[]args){
    String ti;
    int ta;
    double precio, kilos;

    ti = JOptionPane.showInputDialog("Type of grapes A or B");
    ta = Integer.parseInt(JOptionPane.showInputDialog("Size of the grape"));
    kilos = Double.parseDouble(JOptionPane.showInputDialog("How many kilos?"));

    switch(ti){
    case "A":
    if (ta >= 1 && ta < 2) {
      precio = (kilos*0.20);
      JOptionPane.showMessageDialog(null,"Type A, Size 1 "+" The profit obtained is "+precio);
    }else if (ta >=2 && ta < 3) {
      precio = (kilos*0.30);
      JOptionPane.showMessageDialog(null,"Type A, Size 2 "+" The profit obtained is "+precio);
    }
    case "B":
    if (ta >=1 && ta < 2) {
      precio = (kilos*0.30);
      JOptionPane.showMessageDialog(null,"Type B, Size 1 "+" The profit obtained is "+precio);
    }else if (ta >=2 && ta < 3) {
      precio = (kilos*0.50);
      JOptionPane.showMessageDialog(null,"Type B, Size 2 "+" The profit obtained is "+precio);
        }//end if
      }//end switch
    }//end main
  }//end the program
