/**************
Costumes.java
Israel David Salinas Lopez
This program is for Costomes
***************/
import javax.swing.JOptionPane;
public class Costumes{
  public static void main(String[]args){
    int ct;
    double pf;
    double de;

    ct = Integer.parseInt(JOptionPane.showInputDialog("Enter the price of your Costumes :v"));

    if (ct >= 2500) {
      de = (ct*15)/100;
      pf = (ct-de);
      JOptionPane.showMessageDialog(null,"Your price of the costumes is of $"+pf);
    }else{
      de = (ct*8)/100;
      pf = (ct-de);
      JOptionPane.showMessageDialog(null,"Your price is lees to 2500 your price is of $"+pf);
    }//end if
  }//end main
}//end the program
