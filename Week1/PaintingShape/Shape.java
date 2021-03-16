package PaintingShape;

// ==============================
// Write an abstract class Shape with the following properties:
// ==============================

public abstract class Shape 
{
    
    // An instance variable shapeName of type String. 
    String shapeName;

    //---------------------------------- 
    //Constructor: Sets up the shape. 
    //----------------------------------
    public Shape(String name) {
      shapeName = name;
    }

    //----------------------------------------- 
    // An abstract method area().
    //Returns the surface area of the shape. 
    //-----------------------------------------
    public abstract double area();
    
    //----------------------------------- 
    //A toString method that returns the name of the shape.
    //Returns the shape as a String. 
    //-----------------------------------
    public String toString() {
      return shapeName;
    }
  }