# Importing the Battery class
from battery.battery import Battery

# NubbinBattery class inheriting from Battery
class NubbinBattery(Battery):
    # Constructor to initialize the current and last service dates
    def __init__(self, current_date, last_service_date):
        self.current_date = current_date
        self.last_service_date = last_service_date
        self.nubbin_year_need_service = 3  # Service needed every 3 years

    # Method to check if the battery needs service
    def needs_service(self):
        # Calculating the date when service is needed
        date_need_service = self.last_service_date.replace(year=self.last_service_date.year + self.nubbin_year_need_service)
        # Returning True if service is needed, otherwise False
        return date_need_service < self.current_date

# Adding a reference to the license and the author
# License: Nikhil Gurjar
