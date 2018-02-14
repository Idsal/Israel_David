/****************
Credit.java
Israel David Salinas Lopez
The program is to identify the type of card
****************/
import javax.swing.JOptionPane;
public class Credit{
  public static void main(String[]args){
  int tt;
  double la, ac, nc;
  int cards;

  cards = Integer.parseInt(JOptionPane.showInputDialog("With how many credid cards account"));

if (cards >= 2) {
   JOptionPane.showMessageDialog(null,"Select only one   The program will open until you indicate a single card");
}else if (cards >=1 && cards < 2) {

  tt = Integer.parseInt(JOptionPane.showInputDialog("Select the type of card --1--  --2--  --3-- --?--"));
  la = Double.parseDouble(JOptionPane.showInputDialog("Current limit of your credit "));


    if (tt >=1 && tt < 2) {
      ac = (la*25)/100;
      nc = (la+ac);
      JOptionPane.showMessageDialog(null,"Type 1 "+" The increase of your credit is of "+ac+" The new credit limit is "+nc);
    }else if (tt >=2 && tt < 3) {
      ac = (la*35)/100;
      nc = (la+ac);
      JOptionPane.showMessageDialog(null,"Type 2 "+" The increase of your credit is of "+ac+" The new credit limit is "+nc);
    }else if (tt >=3 && tt < 4) {
      ac = (la*40)/100;
      nc = (la+ac);
      JOptionPane.showMessageDialog(null,"Type 3 "+" The increase of your credit is of "+ac+" The new credit limit is "+nc);
    }else if (tt >=4) {
      ac = (la*50)/100;
      nc = (la+ac);
      JOptionPane.showMessageDialog(null,"The card is of type greater than 3 "+" The increase in your credit is "+ac+" The new credit limit is "+nc);
      }//end if
    }//end if
  }//end main
}//end the program
