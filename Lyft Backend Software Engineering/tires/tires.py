from abc import ABC

# Tires class is an abstract base class (ABC) representing the general concept of tires.
class Tires(ABC):
    # needs_service method is abstract and must be implemented by concrete subclasses.
    def needs_service(self):
        pass
