/*********
RectangleArea.java
Israel David Salinas Lopez
This program is for the rectangle area
*********/
import java.util.Scanner;

 public class RectangleArea{
  public static void main(String args []){
     int height;
     int Base;
     String area;
    System.out.println("Go to enter the height");
     Scanner A = new Scanner (System.in);
      height = A.nextInt();
      System.out.println("Go the next base");
     Scanner B = new Scanner (System.in);
       Base = B.nextInt();
        area= "Area del rectangulo es "+(height*Base);
     System.out.println(area);

  }//end main
}//end RectangleArea
