package components;

/**
 * Class that manage when the creation of the car is started and when it is finished
 */
public class Engine {
    private final double volume;
    private double mileage;
    private boolean started;

    public Engine(double volume, double mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }

    /**
     * Start the engine
     */
    public void on() {
        started = true;
    }

    /**
     * Stop the engine
     */
    public void off() {
        started = false;
    }

    /**
     * Verify if the engine is started
     */
    public boolean isStarted() {
        return started;
    }

    /**
     * Init and increment the mileage of the engine
     */
    public void go(double mileage) {
        if (started) {
            this.mileage += mileage;
        } else {
            System.err.println("Cannot go(), you must start engine first!");
        }
    }

    public double getVolume() {
        return volume;
    }

    public double getMileage() {
        return mileage;
    }
}
