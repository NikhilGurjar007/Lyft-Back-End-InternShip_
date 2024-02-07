package tires;

// Tires interface representing the general concept of tires.
public interface Tires {

    // Abstract method needsService: To be implemented by concrete tire classes.
    // This method should return a boolean indicating whether the tires need service.
    boolean needsService();
}
