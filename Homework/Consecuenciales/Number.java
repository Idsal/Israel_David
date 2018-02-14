/*************
Number.java
Israel David Salinas Lopez
The program calculates the price of the appointment depending on the number that is the same
****************/
import javax.swing.JOptionPane;
public class Number{
  public static void main(String[]args){
    int queryNumber;
    double queryprice=0, paymentTotal=0;
    queryNumber = Integer.parseInt(JOptionPane.showInputDialog(null,"enter inquiry number that is"));
    if (queryNumber>3) {
    if (queryNumber>6) {
    if (queryNumber>9) {
              queryprice=50;
                paymentTotal=((queryNumber-8)*queryprice)+1200;
      }else {
            queryprice=100;
              paymentTotal=((queryNumber-5)*queryprice)+900;
          }
      }else {
            queryprice=150;
            paymentTotal=((queryNumber-3)*queryprice)+600;
          }
      }else {
      queryprice=200;
      paymentTotal=queryprice*queryNumber;
    }//end if
    JOptionPane.showMessageDialog(null,"the patient will pay by appointment: $"+queryprice+"\nthe patient has paid for the entire treatment: $"+paymentTotal);
  }//end main
}//end the program
