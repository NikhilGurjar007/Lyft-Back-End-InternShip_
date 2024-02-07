package engine.engine_type;

import engine.Engine;

// CapuletEngine class inheriting from Engine
public class CapuletEngine extends Engine {

    // Fields to store current mileage, last service mileage, and mileage needed for service
    private int currentMileage;
    private int lastServiceMileage;
    private final int capuletMileageNeedService = 30000;

    // Constructor to initialize the current mileage and last service mileage
    public CapuletEngine(int currentMileage, int lastServiceMileage) {
        this.currentMileage = currentMileage;
        this.lastServiceMileage = lastServiceMileage;
    }

    // Method to check if the engine needs service
    @Override
    public boolean needsService() {
        // Checking if the difference between current mileage and last service mileage exceeds the service threshold
        return (currentMileage - lastServiceMileage) > capuletMileageNeedService;
    }
}
