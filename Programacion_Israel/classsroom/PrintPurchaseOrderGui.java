/********
PrintPurchaseOrderGui.java
Israel David Salinas Lopez
This Program calculates and prints a PrintPurchase order report
********/

import javax.swing.JOptionPane;
public class PrintPurchaseOrderGui{
  public static void main(String[] args){
  String itemName;//name of purchase item
  double prices;//price of purchase item
  int quantity;//number of items purchase
  itemName = JOptionPane.showInputDialog("Enter name of purchase item: ");
  prices  = Double.parseDouble(JOptionPane.showInputDialog("Enter price of one item: "));
  quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter quantity: "));
  JOptionPane.showMessageDialog(null, "PURCHASE ORDER: \n\n"+"Item: "+itemName+"\nPrice: "+prices+"\nQuantity: "+quantity+"\nTotal: $"+ (prices *quantity));
  }//end
}//end class PrintPurchaseOrderGui
