/**
 * Write a description of class Rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle extends Shape {
    // instance variables
    Point point1;
    Point point2;
    /**
     * Constructor for objects of class Rectangle
     */
    public Rectangle(int x1, int y1, int x2, int y2) {
        // initialise instance variables
        this.point1 = new Point(x1, y1);
        this.point2 = new Point(x2, y2);
    }

    /**
     * Gets the string representation of the rectangle
     *
     * @return  the string representation of the rectangle
     */
    public String toString() {
        return (this.point1.toString() + ", " + this.point2.toString());
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void draw() {
        
        System.out.println("Rectangle drawn at: " + this.toString());
    }
}
