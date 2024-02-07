import battery.battery_type.NubbinBattery;
import battery.battery_type.SpindlerBattery;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

// TestNubbinBattery class contains test cases for NubbinBattery.
public class TestNubbinBattery {

    // Test case: needsService returns true when the battery needs service.
    @Test
    public void testNeedsServiceTrue() {
        LocalDate currentDate = LocalDate.of(2022, 7, 31);
        LocalDate lastServiceDate = LocalDate.of(2019, 1, 27);
        NubbinBattery battery = new NubbinBattery(currentDate, lastServiceDate);
        assertTrue(battery.needsService());
    }

    // Test case: needsService returns false when the battery doesn't need service.
    @Test
    public void testNeedsServiceFalse() {
        LocalDate currentDate = LocalDate.of(2022, 7, 31);
        LocalDate lastServiceDate = LocalDate.of(2021, 1, 10);
        NubbinBattery battery = new NubbinBattery(currentDate, lastServiceDate);
        assertFalse(battery.needsService());
    }
}

// TestSpindlerBattery class contains test cases for SpindlerBattery.
public class TestSpindlerBattery {

    // Test case: needsService returns true when the battery needs service.
    @Test
    public void testNeedsServiceTrue() {
        LocalDate currentDate = LocalDate.of(2022, 7, 31);
        LocalDate lastServiceDate = LocalDate.of(2017, 1, 25);
        SpindlerBattery battery = new SpindlerBattery(currentDate, lastServiceDate);
        assertTrue(battery.needsService());
    }

    // Test case: needsService returns false when the battery doesn't need service.
    @Test
    public void testNeedsServiceFalse() {
        LocalDate currentDate = LocalDate.of(2022, 7, 31);
        LocalDate lastServiceDate = LocalDate.of(2021, 1, 10);
        SpindlerBattery battery = new SpindlerBattery(currentDate, lastServiceDate);
        assertFalse(battery.needsService());
    }
}
