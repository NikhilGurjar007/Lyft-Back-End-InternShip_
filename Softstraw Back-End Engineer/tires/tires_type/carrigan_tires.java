package tires.tires_type;

import tires.Tires;

// CarriganTires class inherits from Tires and represents Carrigan tires.
public class CarriganTires extends Tires {

    // Field to store tire wear data and service threshold.
    private double[] tireWear;
    private final double tireNeedToService = 0.9;

    // Constructor initializes CarriganTires with tire wear data.
    public CarriganTires(double[] tireWear) {
        this.tireWear = tireWear;
    }

    // needsService method checks if any tire needs service based on the wear threshold.
    @Override
    public boolean needsService() {
        for (double tire : tireWear) {
            if (tire >= tireNeedToService) {
                return true;
            }
        }
        return false;
    }
}
