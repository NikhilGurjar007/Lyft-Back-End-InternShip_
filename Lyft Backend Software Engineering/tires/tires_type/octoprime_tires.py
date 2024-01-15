from tires.tires import Tires

# OctoprimeTires class inherits from Tires and represents Octoprime tires.
class OctoprimeTires(Tires):
    # Constructor initializes OctoprimeTires with tire wear data and service threshold.
    def __init__(self, tire_wear):
        self.tire_wear = tire_wear
        self.tire_need_to_service = 3.0

    # needs_service method checks if the sum of tire wear values meets the service threshold.
    def needs_service(self):
        return sum(self.tire_wear) >= self.tire_need_to_service