// Engine interface representing the common interface for different engine types.
public interface Engine {

    // Abstract method needsService: To be implemented by concrete engine classes.
    // This method should return a boolean indicating whether the engine needs service.
    boolean needsService();
}

// The above interface defines a common contract for different engine types. Any class implementing this interface
// must provide an implementation for the 'needsService' method.

// Concrete engine classes such as CapuletEngine, SternmanEngine, WilloughbyEngine, etc., should implement the 'Engine'
// interface by providing their specific implementation for the 'needsService' method.
