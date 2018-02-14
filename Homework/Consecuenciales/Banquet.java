/********************
Banquet.java
Israel David Salinas Lopez
This Program Calculate price of banquet
********************/
import javax.swing.JOptionPane;
public class Banquet{
  public static void main(String[]args){
    double np;
    double tp;

    np = Double.parseDouble(JOptionPane.showInputDialog("Enter the number of dishes"));

    if (np >= 200 && np < 300) {
      tp = (np*85);
      JOptionPane.showMessageDialog(null,"The total price of the banquet is "+"$"+tp);
    }else if (np < 200) {
      tp = (np*95);
      JOptionPane.showMessageDialog(null,"The total price of the banquet is "+"$"+tp);
    }else if (np > 300) {
      tp = (np*75);
      JOptionPane.showMessageDialog(null,"The total price of the banquet is "+"$"+tp);
    }//end if
  }//end main
}//end the program
