/*****
FactorialForLoop.java
Israel David Salinas Lop
This Program prints the factorial of a number
******/
import javax.swing.JOptionPane;
public class FactorialForLoop{
  public static void main(String [] agrs){
    int factorial = 1, number;
    number = Integer.parseInt(JOptionPane.showInputDialog("Enter the number"));
    for (int i=1; i <= number; i++){
      factorial *= i;
    }
    JOptionPane.showMessageDialog(null,"The factorial of" + number+ " is "+ factorial, "Factorial", JOptionPane.OK_OPTION);
  }
}
