/*************
Students.java
Israel David Salinas Lopez
The program is for trip of the students
****************/
import javax.swing.JOptionPane;
public class Students{
  public static void main(String[]args){
    int na;
    double tot;

    na = Integer.parseInt(JOptionPane.showInputDialog("Enter the students quantity "));

    if (na >= 100) {
      JOptionPane.showMessageDialog(null,"The price for each student is"+"$65");
      tot = (na*65.00);
      JOptionPane.showMessageDialog(null,"The total price is "+"$"+tot);
    }else if (na >=50 && na < 99) {
      JOptionPane.showMessageDialog(null,"The price for each student is "+"$70");
      tot = (na*70);
      JOptionPane.showMessageDialog(null,"The total price is "+"$"+tot);
    }else if (na >= 30 && na < 49) {
      JOptionPane.showMessageDialog(null,"The price for each student is $95");
      tot = (na*95);
      JOptionPane.showMessageDialog(null,"The total price is "+"$"+tot);
    }else if (na < 30) {
      JOptionPane.showMessageDialog(null,"Total cost of bus rental is $4000.00");
    }//end if
  }//end main
}//end the program
