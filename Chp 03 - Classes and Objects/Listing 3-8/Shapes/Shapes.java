
/**
 * Listing 3-8 declares three classes: 
 * Circle, Rectangle, and Shapes. Unlike Circle and Rectangle,
 * Shapes is declared public. Because Shapes is public and all 
 * three classes are declared in the same source file, the name 
 * of this source file is Shapes.java.
 * Each class declares a main() method. However, the main 
 * application class is 'Shapes' because it demonstrates Circle and 
 * Rectangle, which are components of the application. To identify 
 * an application’s main class in a multiclass application, I 
 * declare the main class public.
 */

class Circle
{
    Circle()
    {
        System.out.println("Circle() called");
    }
    
    public static void main(String[] args)
    {
        new Circle();
        System.out.println("Circle.main() called");
    }
}

class Rectangle
{
    Rectangle()
    {
        System.out.println("Rectangle() called");
    }

    public static void main(String[] args)
    {
        new Rectangle();
        System.out.println("Rectangle.main() called");
    }
}

public class Shapes
{
    // instance variables - replace the example below with your own
    private int x;

    public static void main(String[] args)
    {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        System.out.println("Shapes.main() called");
    }

    /**
     * Constructor for objects of class Shapes

    public Shapes()
    {
        // initialise instance variables
        x = 0;
    }
     */
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
