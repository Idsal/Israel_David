/***
Circle.java
Israel David Salinas
This class calculates the area of a circle
****/
public class Circle extends GeometricObject
{
  private double radius;
  public Circle()
  {

  }
  public Circle(double radius)
  {
    this.radius=radius;
  }
  public Circle(double radius, String color, boolean filled)
  {
    super(color,filled);
    this.radius=radius;
  }
  public double getRadius()
  {
    return this.radius;
  }

  public void setRadius(double radius)
  {
    this.radius=radius;
  }
  public double getArea()
  {
    return Math.PI*Math.pow(this.radius, 2);
  }
  public double getPerimeter()
  {
    return Math.PI*(this.radius*2);
  }
  public double getDiameter()
  {
    return this.radius*2;
  }
  @Override
  public String toString()
  {
    return "Date Created: " + super.getdateCreated() + "\nColor: " + super.getColor() + "\nArea: " + getArea();
  }
/*  public void printCircle()
  {
    JOptionPane.showMessageDialog(null, "The circle created " + getdateCreated() + "has a color" + getColor());
  }*/

}
