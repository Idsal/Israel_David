/***********
BMIOOP.java
Israel David Salinas Lopez
This class calculates the body Mass Index
******/
import javax.swing.JOptionPane;
public class BMIOOP{
//properities
private String name;
private int age;
private double weigth;//in pounds
private double height;// in inches
private final double KILOGRAMS_PER_POUND = 0.45359237;
private final double METERS_PER_INCH = 0.0254;


//methods
  public void setName(String name){
  this.name = name;
  }
  public String getName(){
  return this.name;
  }
  public void setAge(int age){
  this.age = age;
  }
  public int setAge(){
  return this.age;
  }
  public void setHeight(double age){
  return this.height;
  }
  public void setHeight(int age){
  return this.height;
  }
  public void setWeigth(double age){
  return this.weigth;
  }
  public void setWeigth(int age){
  return this.weigth;

  public double getbmi(){
  double bmi = this.weigth* KILOGRAMS_PER_POUND/ ((this.height * METERS_PER_INCH))*(this.height * METERS_PER_INCH);
  return Math.round(bmi *100)/100;
  }
  weight = Float.parseFloat(JOptionPane.showInputDialog("Enter your weight in prounds"));
  height = Float.parseFloat(JOptionPane.showInputDialog("Enter your height in inches"));

  double weightInKilograms = weight * KILOGRAMS_PER_POUND;
  double heightInMeters = height * METERS_PER_INCHES;

  double bmi = weightInKilograms / (Math.pow(heightInMeters,2));
  if (bmi < 16) {
    JOptionPane.showMessageDialog(null,"You are seriously underweight");
  }else if (bmi < 18) {
    JOptionPane.showMessageDialog(null,"Your are underweight");
  }else if (bmi < 24) {
    JOptionPane.showMessageDialog(null,"You are normal weight ");
  }else if (bmi < 29) {
    JOptionPane.showMessageDialog(null,"Your are over weight ");
  }else if (bmi < 35) {
    JOptionPane.showMessageDialog(null,"You are seriously Overweight");
  }else {
    JOptionPane.showMessageDialog(null,"You are gravely Overweight");
  }//end if
}//end main
}//end BMI.java
