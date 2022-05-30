/**
 * Write a description of class CovarDemoTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CovarDemoTester {
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class CovarDemoTester
     */
    public CovarDemoTester() {
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

        SuperReturnType sprRtnTp = new SuperReturnType();
        System.out.println(sprRtnTp);
        SubReturnType sbRtnTp = new SubReturnType();
        System.out.println(sbRtnTp);
    }
}
