package PaintingShape;

// ==================================
// The file Cylinder.java contains a class for a cylinder which is a descendant of Shape.
// ==================================


public class Cylinder extends Shape 
{
  private double radius;  // The radius of Cylinder (in feet)
  private double height;  // height in feet

  //---------------------------------- 
  //Constructor: Sets up the cylinder. 
  //---------------------------------- 
  public Cylinder(double r, double h) 
  {
    super("Cylinder"); 
    radius = r;
    height = h;
  } 
  //----------------------------------------- 
  //Returns the surface area of the cylinder. 
  //----------------------------------------- 
  public double area() 
  {
    return Math.PI*radius*radius*height;
  }

  //----------------------------------- 
  //Returns the cylinder as a String. 
  // Overriding abstract method from class Shape.java 
  //----------------------------------- 
  public String toString() 
  {
    return super.toString() + " with r : " + radius + " and h : " + height;
  }
}
