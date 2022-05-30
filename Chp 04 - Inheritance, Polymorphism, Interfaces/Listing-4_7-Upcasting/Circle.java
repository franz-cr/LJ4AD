/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Circle extends Point {
    // instance variables - replace the example below with your own
    private int radius;

    /**
     * Constructor for objects of class Circle
     */
    public Circle(int x, int y, int radius) {
        // initialise instance variables
        super(x, y);
        this.radius = radius;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getRadius() {
        return this.radius;
    }
    
    public String toString() {
        return " " + radius;
    }
    
    public void draw() {
        System.out.println("Circle drawn at " + super.toString() + 
            " with radius " + this.toString());
    }
}
