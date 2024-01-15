# Importing the ABC (Abstract Base Class) module
from abc import ABC

# Battery class, an abstract class inheriting from ABC
class Battery(ABC):
    # Abstract method to check if the battery needs service
    def needs_service(self):
        pass

# Adding a reference to the license and the author
# License: Nikhil Gurjar
