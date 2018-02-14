/**********
Circle.java
Israel David Salinas Lopez
This program is for the circle area
**********/
 import java.util.Scanner;

public class Circle{
  public static void main(String args[]){
    int radio;
    final double pi=3.1416;
    String area;
    final double result;
    System.out.println("Enter radio of circle");
    Scanner R = new Scanner (System.in);
    radio = R.nextInt();

    area="Area of the circle is";
     result= ((radio*radio)*pi);
    System.out.println(area+result);

  }//end main
}//end CircunferenciaArea
