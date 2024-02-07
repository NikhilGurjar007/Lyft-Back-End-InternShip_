import serviceable.Serviceable;

// Car class represents a car and implements the Serviceable interface.
public class Car implements Serviceable {

    // Fields to store the car's engine, battery, and tires.
    private Engine engine;
    private Battery battery;
    private Tires tires;

    // Constructor initializes the car with an engine, battery, and tires.
    public Car(Engine engine, Battery battery, Tires tires) {
        this.engine = engine;
        this.battery = battery;
        this.tires = tires;
    }

    // needsService method checks if the car needs service based on its engine, battery, and tires.
    @Override
    public boolean needsService() {
        return engine.needsService() || battery.needsService() || tires.needsService();
    }
}
