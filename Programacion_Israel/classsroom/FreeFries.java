/****
FreeFries.java
Israel David Salinas Lopez
This program reads points score by home by team and the opossing team and
determines IF the fans win free
*****/
import javax.swing.JOptionPane;// Para utilizar modo grafico GUI
public class FreeFries{
  public static void main(String [] args){
    int homePoints;//points score by home team
    int OpponentPoints;//points score by opposing team

    homePoints = Integer.parseInt(JOptionPane.showInputDialog(" Enter homePoints"));
    OpponentPoints = Integer.parseInt(JOptionPane.showInputDialog(" Enter OpponentPoints"));

    if (homePoints > OpponentPoints && homePoints >=100){
      JOptionPane.showMessageDialog(null,"A free order of French Fries for White Tigers Fans");

    }//end if
  }//end main
}//end class
