
/**
 * Write a description of class Cars here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cars
{
    public static void main(String[] args) {
        System.out.println("Initial Counter: " + Car.carsCounter);
        Car myCar = new Car(56732, 4, 10, "Nissan", "Sentra", "Marielos");
        myCar.setGas(8.3);
        System.out.println("| Mileage |   Gas   |");
        System.out.printf("| %7d | %7.2f |\n", myCar.getMileage(), myCar.getGasInTank());
        Car yourCar = new Car(23581, 2, 7, "Toyota", "Hilux", "Franz");
        yourCar.setGas(12.8);
        System.out.printf("| %7d | %7.2f |\n", myCar.getMileage(), myCar.getGasInTank());
        Car hisCar = new Car(109548, 5, 15, "KIA", "Sportage", "Harold");
        hisCar.setGas(3.4);
        System.out.printf("| %7d | %7.2f |\n", myCar.getMileage(), myCar.getGasInTank());
        System.out.println("Cars Counter: " + Car.carsCounter);
    }
}

class Car {
        // Class Variables or Fields
    static int carsCounter = 0;
    
    // Instance variables - replace the example below with your own
    private String make, model, owner;
    private int mileage, numbrDoors;
    private double gasInTank, fuelEfficiency;
    private final int WHEELS = 4;
    private final int REGISTRATION;

    /**
     * Constructor for objects of class Cars
     */
    public Car(int mileage, int numbrDoors, double fuelEfficiency, 
        String make, String model, String owner)
    {
        // Changing Class Variables
        REGISTRATION = carsCounter++;
        
        // Initialise instance variables
        this.mileage = mileage;
        this.numbrDoors = numbrDoors;
        this.fuelEfficiency = fuelEfficiency;
        this.make = make;
        this.model = model;
        this.owner = owner;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setGas(double gas)
    {
        // put your code here
        this.gasInTank += gas;
    }
    
    public double getGasInTank() {
        return this.gasInTank;
    }
    
    public int getMileage() {
        return this.mileage;
    }
}
