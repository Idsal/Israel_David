/********
Milk.java
Israel David Salinas Lopez
This program is for productor of Milk
*******/
import java.util.Scanner;

public class Milk{
  public static void main(String[]args){
    int Litros;
    final double LitrosDeUnGalon =3.785;
    int PrecioDeUnGalon;
    double Ganancia;
    System.out.println("Cantidad de litros que produce o entregara");
    Scanner L= new Scanner (System.in);
    Litros = L.nextInt();
    final double galones= Litros/LitrosDeUnGalon;
    System.out.println("Produce "+galones+" Galones");
    System.out.println("Ingrese el precio del galon");
    Scanner PG= new Scanner (System.in);
    PrecioDeUnGalon=PG.nextInt();
    Ganancia= galones*PrecioDeUnGalon;
    System.out.println("Ganancia por la entrega de la leche es de: "+Ganancia);

  }//end main
}//end Program ProductorOfMilk
