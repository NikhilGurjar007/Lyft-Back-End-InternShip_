from abc import ABC

# Engine is an abstract base class (ABC) representing the common interface for different engine types.
class Engine(ABC):
    # Abstract method needs_service: To be implemented by concrete engine classes.
    # This method should return a boolean indicating whether the engine needs service.
    @abstractmethod
    def needs_service(self):
        pass

# The above class defines an abstract base class (ABC) named 'Engine'. An abstract base class is a common design pattern
# in object-oriented programming that allows you to define a common interface for a group of related classes.
# The 'Engine' class has one abstract method 'needs_service', which must be implemented by any concrete class
# (i.e., specific types of engines such as CapuletEngine, SternmanEngine, WilloughbyEngine, etc.).

# By marking 'Engine' as an ABC, we signal that it should not be instantiated on its own, but rather serve as a base
# class for other classes. The abstract method 'needs_service' enforces that any concrete engine class must provide
# an implementation for this method.

