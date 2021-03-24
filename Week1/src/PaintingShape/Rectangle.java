package PaintingShape;

public class Rectangle extends Shape 
{
    
    private double length;  //The length of Rectangle (in feet)
    private double width;  //The width of Rectangle (in feet)
    
    //---------------------------------- 
    //Constructor: Sets up the cylinder. 
    //---------------------------------- 
    public Rectangle(double l, double w) 
    {
        super("Rectangle"); 
        length = l;
        width = w;
    } 
    
    //----------------------------------------- 
    //Returns the surface area of the rectangle. 
    //----------------------------------------- 
    public double area() 
    {
        return length * width;
    }
  
    //----------------------------------- 
    //Returns the rectangle as a String. 
    // Overriding abstract method from class Shape.java 
    //----------------------------------- 
    public String toString() 
    {
        return super.toString() + " with l : " + length + " and w : " + width;
    }
}