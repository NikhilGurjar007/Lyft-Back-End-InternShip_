package tires.tires_type;

import tires.Tires;

// OctoprimeTires class inherits from Tires and represents Octoprime tires.
public class OctoprimeTires extends Tires {

    // Field to store tire wear data and service threshold.
    private double[] tireWear;
    private final double tireNeedToService = 3.0;

    // Constructor initializes OctoprimeTires with tire wear data.
    public OctoprimeTires(double[] tireWear) {
        this.tireWear = tireWear;
    }

    // needsService method checks if the sum of tire wear values meets the service threshold.
    @Override
    public boolean needsService() {
        return sum(tireWear) >= tireNeedToService;
    }

    // Helper method to calculate the sum of an array of doubles.
    private double sum(double[] array) {
        double total = 0.0;
        for (double value : array) {
            total += value;
        }
        return total;
    }
}
