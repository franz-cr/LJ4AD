/**
 * Write a description of class Point here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Point {
    // instance variables - replace the example below with your own
    private int x, y;

    /**
     * Constructor for objects of class Point
     */
    public Point(int x, int y) {
        // initialise instance variables
        this.x = x;
        this.y = y;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getX() {
        return this.x;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getY() {
        return this.y;
    }
    
    public String toString() {
        return ("(" + this.x + ", " + this.y + ")");
    }
    
    public void draw() {
        System.out.println("Point drawn at " + this.toString());
    }
}
