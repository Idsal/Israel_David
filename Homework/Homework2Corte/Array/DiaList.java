/*********
Dialist.java
Israel David Salinas Lopez
This program creates a cell phone dial phone number
List and prints the created List
*/
import javax.swing.*;
public class DiaList
{
  public static void main(String[] args)
  {
    long phoneList[]; //list of phone numbers
    int sizeList; //number of phone numbers
    long phoneNum; //an entered phone number

    sizeList=Integer.parseInt(JOptionPane.showInputDialog("How many phone number would you like to enter??"));
      phoneList=new long[sizeList]; //Inicializando el arreglo
    for (int i=0;i<sizeList;i++)
    {
      phoneNum=Long.parseLong(JOptionPane.showInputDialog("Enter a phone number"));
      phoneList[i]=phoneNum;
    }
    for (int i=0;i<sizeList;i++)
    {
      JOptionPane.showMessageDialog(null, "Index: " + i + " element number: " + (i+1) + " phone number: " + phoneList[i]);
    }
  }
}
