from tires.tires import Tires

# CarriganTires class inherits from Tires and represents Carrigan tires.
class CarriganTires(Tires):
    # Constructor initializes CarriganTires with tire wear data and service threshold.
    def __init__(self, tire_wear):
        self.tire_wear = tire_wear
        self.tire_need_to_service = 0.9

    # needs_service method checks if any tire needs service based on wear threshold.
    def needs_service(self):
        for tire in self.tire_wear:
            if tire >= self.tire_need_to_service:
                return True
        return False
