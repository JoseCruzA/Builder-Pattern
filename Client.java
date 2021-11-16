import builders.CarBuilder;
import builders.CarManualBuilder;
import cars.Car;
import cars.Manual;
import director.Director;

/**
 * Main class for create a Car using the Builder Pattern
 */
public class Client {
    public static void main(String[] args) {
        // Create a director for manage the build process
        Director director = new Director();
        // Create a builder for create a car type sport
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // Get the car created
        Car car = builder.getResult();
        // Print the car created
        System.out.println("Car built:\n" + car.getCarType());

        // Create a builder for create a car type manual
        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        // Get the car created manual
        Manual carManual = manualBuilder.getResult();
        // Print the car created manual
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
