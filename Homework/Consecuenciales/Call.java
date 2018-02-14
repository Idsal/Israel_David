/***********************
Call.java
Israel David Salinas Lopez
This program calculates the user's payment for a call
**********************/
import javax.swing.JOptionPane;
public class Call{
  public static void main(String[]args){
    double time;
    String schedule, turn;
    double priceForTime, tax, paymentTotal=0;

    time=Double.parseDouble(JOptionPane.showInputDialog(null,"enter to time of the call in minutes"));
    if (time>5) {
    if (time>8) {
    if (time>10) {
          priceForTime=((((time-10)*0.50)+1.4)+2.4)+5;
    }else {
          priceForTime=(((time-8)*0.70)+2.4)+5;
        }
    }else {
        priceForTime=((time-5)*0.80)+5;
      }
    }else {
      priceForTime=time*1;
    }
    schedule = JOptionPane.showInputDialog(null,"enter the current day (Weekday or Sunday)(*capitalized the first letter*)");
    switch (schedule) {
      case "Weekday":
              turn = JOptionPane.showInputDialog(null,"unter the turn of the call(Evening or Morning)(*capitalized the first letter*)");
              switch (turn) {
                case "Morning":
                    tax=((priceForTime/100)*15);
                    paymentTotal=priceForTime+tax;
                break;
                case "Evening":
                    tax=((priceForTime/100)*10);
                    paymentTotal=priceForTime+tax;
                    break;
                default:JOptionPane.showMessageDialog(null,"bad turn");
                  }
      break;
      case "Sunday":
        tax=((priceForTime/100)*3);
        paymentTotal=priceForTime+tax;
        break;
      default:
        JOptionPane.showMessageDialog(null,"bad day");
    }//end switch
    JOptionPane.showMessageDialog(null,"nwith a time of: "+time+" minutes"+"\nOn a schedule: "+schedule+"\nthe call will have total cost: $"+paymentTotal);
  }//end main
}//end class
