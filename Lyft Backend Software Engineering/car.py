from serviceable import Serviceable

# Car class represents a car and implements the Serviceable interface.
class Car(Serviceable):
    # Constructor initializes the car with an engine, battery, and tires.
    def __init__(self, engine, battery, tires):
        self.engine = engine
        self.battery = battery
        self.tires = tires

    # needs_service method checks if the car needs service based on its engine, battery, and tires.
    def needs_service(self):
        return self.engine.needs_service() or self.battery.needs_service() or self.tires.needs_service()

