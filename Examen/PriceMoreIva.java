/****
PriceMoreIva.java
Israel David Salinas Lopez
This proram calculates final price more iva
*****/
import javax.swing.JOptionPane;// Para utilizar modo grafico GUI
public class PriceMoreIva{// El nombre de nuestra clase
  public static void main(String[] args) {// No retorna nuestro programa
    final double Iva=0.21;//Declaramos la variable Iva con un valor unico o constante
    String mensaje =JOptionPane.showInputDialog("Introduce el precio de un producto");//Primera impresion de pantalla pidiendo datos
    double price = Double.parseDouble(mensaje);//Captura de Informacion
    double finalprice=price+(price*Iva);//Operacion

    JOptionPane.showMessageDialog(null, "El precio final mas iva es: "+ finalprice);//Impresion de pantalla con el resultado
    }
}
