import java.util.*;

// Abstract Battery class
public abstract class Battery {

    // Abstract method to be implemented by subclasses
    public abstract boolean needsService();

    // common method for all Battery subclasses
    public void commonMethod() {
        // Implementation common to all Battery subclasses
    }
}
