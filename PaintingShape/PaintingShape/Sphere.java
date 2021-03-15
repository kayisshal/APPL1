package PaintingShape;

// ==================================
// The file Sphere.java contains a class for a sphere which is a descendant of Shape.
// ==================================

public class Sphere extends Shape 
{
    private double radius;  // The radius of Sphere (in feet)
  
    //----------------------------------
    // Constructor: Sets up the sphere.
    //---------------------------------- 
    public Sphere(double r) 
    {
    super("Sphere"); 
      radius = r;
    } 
  
    //-----------------------------------------
    // Returns the surface area of the sphere.
    //----------------------------------------- 
    public double area() 
    { 
      return 4*Math.PI*radius*radius;
    } 
  
    //-----------------------------------
    // Returns the sphere as a String.
    // Overriding abstract method from class Shape.java
    //-----------------------------------. 
    public String toString() 
    {
      return super.toString() + " with r : " + radius;
    }
}