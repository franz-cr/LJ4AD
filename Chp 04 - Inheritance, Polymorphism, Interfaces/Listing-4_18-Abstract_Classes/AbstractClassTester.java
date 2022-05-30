
/**
 * Write a description of class AbstractClassTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AbstractClassTester {
    private int x;

    /**
     * Constructor for objects of class UpcastingTester
     */
    public AbstractClassTester() {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void main(String[] args) {

        System.out.println("PART 1: Regular declaration");
        Point point = new Point(10, 10);
        point.draw();
        
        Point circle = new Circle(20, 20, 10);
        circle.draw();
        
        Rectangle rectangle = new Rectangle(10, 10, 30, 20);
        rectangle.draw();
        
        System.out.println();
        System.out.println("PART 2: Abstract class use example");
        Shape[] shapes = new Shape[] { 
            new Point(10, 20), 
            new Circle(10, 20, 30), 
            new Rectangle(20, 30, 15, 25) };
        for (int i = 0; i < shapes.length; i++)
            shapes[i].draw();
        for (int i = 0; i < shapes.length; i++)
            System.out.println(shapes[i].toString());
    }
}
