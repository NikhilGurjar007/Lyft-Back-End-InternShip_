package engine.engine_type;

import engine.Engine;

// SternmanEngine class inheriting from Engine
public class SternmanEngine extends Engine {

    // Field to store the status of the warning light
    private boolean warningLightIsOn;

    // Constructor to initialize the warning light status
    public SternmanEngine(boolean warningLightIsOn) {
        this.warningLightIsOn = warningLightIsOn;
    }

    // Method to check if the engine needs service
    @Override
    public boolean needsService() {
        // Returning true if the warning light is on, otherwise false
        return warningLightIsOn;
    }
}
