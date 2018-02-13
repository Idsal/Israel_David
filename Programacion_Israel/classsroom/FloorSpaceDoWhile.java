/*****
FloorSpaceDoWhile.java
Israel David Salinas Lopez
This program calculates total floor in a house.
*****/
import javax.swing.JOptionPane;
public class FloorSpaceDoWhile{
  public static void main(String [] args){
    double length, widht; // room dimensions
    double floorSpace = 0;// house's total floorSpace
    char response ;// user's response

    do{
    length = Double.parseDouble(JOptionPane.showInputDialog("Enter the room's length"));
    widht = Double.parseDouble(JOptionPane.showInputDialog("Enter the room's width"));
    floorSpace += length * widht;
    response = JOptionPane.showInputDialog("Any more room? y/n").charAt(0);
  }while(response == 'y' || response == 'y');
  JOptionPane.showMessageDialog(null, "The total floor space is "+ floorSpace, "Hello", JOptionPane.WARNING_MESSAGE);
  }
}
