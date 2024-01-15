from battery.battery_type.nubbin_battery import NubbinBattery
from battery.battery_type.spindler_battery import SpindlerBattery

import unittest
import datetime

# TestNubbinBattery class inherits from unittest.TestCase and contains test cases for NubbinBattery.
class TestNubbinBattery(unittest.TestCase):
    # Test case: needs_service returns True when the battery needs service.
    def test_needs_service_true(self):
        current_date = datetime.datetime(2022, 7, 31)
        last_service_date = datetime.datetime(2019, 1, 27)
        battery = NubbinBattery(current_date, last_service_date)
        self.assertTrue(battery.needs_service())

    # Test case: needs_service returns False when the battery doesn't need service.
    def test_needs_service_false(self):
        current_date = datetime.datetime(2022, 7, 31)
        last_service_date = datetime.datetime(2021, 1, 10)
        battery = NubbinBattery(current_date, last_service_date)
        self.assertFalse(battery.needs_service())

# TestSpindlerBattery class inherits from unittest.TestCase and contains test cases for SpindlerBattery.
class TestSpindlerBattery(unittest.TestCase):
    # Test case: needs_service returns True when the battery needs service.
    def test_needs_service_true(self):
        current_date = datetime.datetime(2022, 7, 31)
        last_service_date = datetime.datetime(2017, 1, 25)
        battery = SpindlerBattery(current_date, last_service_date)
        self.assertTrue(battery.needs_service())

    # Test case: needs_service returns False when the battery doesn't need service.
    def test_needs_service_false(self):
        current_date = datetime.datetime(2022, 7, 31)
        last_service_date = datetime.datetime(2021, 1, 10)
        battery = SpindlerBattery(current_date, last_service_date)
        self.assertFalse(battery.needs_service())

# This code snippet does not specify a particular license, so the general Python open-source license (PSF) can be assumed.
# If you want to include a specific license, you can add a license comment or include a separate LICENSE file.
# Always make sure to comply with the licensing terms of any third-party code or libraries you use.
