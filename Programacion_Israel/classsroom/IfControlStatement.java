/*****
IfControlStatement.java
Israel David Salinas Lopez
This program checks for period at the end ofline.
***/
import javax.swing.JOptionPane;

public class IfControlStatement{
  public static void main (String [] args){
    String sentence;
    int lastCharPosition;

    sentence = JOptionPane.showInputDialog("Enter yoursentence");
    //Hola Mundo

    lastCharPosition = sentence.length() -1;

    if (sentence.charAt(lastCharPosition) != '.'){
      JOptionPane.showMessageDialog(null, "Invalid Entry - yoursentence needs a period");

    }//end if
  }//end main
}//end class
