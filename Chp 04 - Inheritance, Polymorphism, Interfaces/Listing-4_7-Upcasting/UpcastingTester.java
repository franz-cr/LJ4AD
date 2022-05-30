/**
 * Write a description of class UpcastingTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UpcastingTester {
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class UpcastingTester
     */
    public UpcastingTester() {
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
        
        System.out.println("PART 2: Upcasting example");
        Point[] points = new Point[] {new Point(15, 15), new Circle(25, 25, 15)};
        for (int i = 0; i < points.length; i++)
            points[i].draw();
    }
}
