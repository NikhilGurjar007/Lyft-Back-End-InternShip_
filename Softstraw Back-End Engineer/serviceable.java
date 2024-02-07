package serviceable;

// Serviceable interface represents an abstract base class with a single abstract method needsService.
public interface Serviceable {

    // Abstract method needsService: To be implemented by concrete classes.
    // This method should return a boolean indicating whether the object needs service.
    boolean needsService();
}
