from abc import ABC, abstractmethod

# Serviceable is an abstract base class (ABC) with a single abstract method needs_service.
class Serviceable(ABC):
    @abstractmethod
    def needs_service(self):
        pass
