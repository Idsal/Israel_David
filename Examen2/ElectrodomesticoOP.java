/*

*/
import javax.swing.*;
public class ElectrodomesticosOP{
  public static void main(String[] args) {
        Electrodomestico listElectrodomesticos[]=new Electrodomestico[10];
        listElectrodomesticos[0]=new Electrodomestico();
        listElectrodomesticos[1]=new Lavadora(150, 30);
        listElectrodomesticos[2]=new Television(500, 80, 'E', "BLACK", 42, false);
        listElectrodomesticos[3]=new Electrodomestico();
        listElectrodomesticos[4]=new Electrodomestico(600, 20, 'D', "GRAY");
        listElectrodomesticos[5]=new Lavadora(300, 40, 'Z', "WHITE", 40);
        listElectrodomesticos[6]=new Television(250, 70);
        listElectrodomesticos[7]=new Lavadora(400, 100, 'A', "GREEN", 15);
        listElectrodomesticos[8]=new Television(200, 60, 'C', "ORANGE", 30, true);
        listElectrodomesticos[9]=new Electrodomestico(50, 10);

        double sumElectrodomesticos=0;
        double sumTelevision=0;
        double sumLavadora=0;

        for(int i=0;i<listElectrodomesticos.length;i++){

            if(listaElectrodomesticos[i] instanceof Electrodomestico){
                sumElectrodomesticos+=listElectrodomesticos[i].precioFinal();
            }
            if(listaElectrodomesticos[i] instanceof Lavadora){
                sumLavadoras+=listElectrodomesticos[i].precioFinal();
            }
            if(listaElectrodomesticos[i] instanceof Television){
                sumTelevisiones+=listElectrodomesticos[i].precioFinal();
            }
        }
        JOptionPane.showMessageDialog(null,"Total por Lavadoras "+sumLavadoras);
        JOptionPane.showMessageDialog(null,"Total por Televisiones" +sumTelevisiones);
        JOptionPane.showMessageDialog(null,"Total por los dos Electrodomesticos" + sumElectrodomesticos);

}//end class ImplementElectrodomesticos
