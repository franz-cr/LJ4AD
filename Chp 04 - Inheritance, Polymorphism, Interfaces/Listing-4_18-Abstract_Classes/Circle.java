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
     * 
     * @param  x  the x axis dimension of the center point
     * @param  y  the y axis dimension of the center point
     * @param  radius  the radius dimension of the circle
     */
    public Circle(int x, int y, int radius) {
        // initialise instance variables
        super(x, y);
        this.radius = radius;
    }

    /**
     * Gets the radius of the circle
     *
     * @return  the radius of the circle
     */
    public int getRadius() {
        return this.radius;
    }
    
    /**
     * Gets the string representation of the circle
     *
     * @return  the string representation of the circle
     */
    public String toString() {
        return " " + radius;
    }
    
    public void draw() {
        System.out.println("Circle drawn at " + super.toString() + 
            " with radius " + this.toString());
    }
}
