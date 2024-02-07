import battery.battery_type.NubbinBattery;
import battery.battery_type.SpindlerBattery;
import org.junit.Test;
import java.time.LocalDateTime;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

// TestNubbinBattery class contains test cases for NubbinBattery.
public class TestNubbinBattery {

    // Test case: needsService returns true when the battery needs service.
    @Test
    public void testNeedsServiceTrue() {
        LocalDateTime currentDate = LocalDateTime.of(2022, 7, 31, 0, 0);
        LocalDateTime lastServiceDate = LocalDateTime.of(2019, 1, 27, 0, 0);
        NubbinBattery battery = new NubbinBattery(currentDate, lastServiceDate);
        assertTrue(battery.needsService());
    }

    // Test case: needsService returns false when the battery doesn't need service.
    @Test
    public void testNeedsServiceFalse() {
        LocalDateTime currentDate = LocalDateTime.of(2022, 7, 31, 0, 0);
        LocalDateTime lastServiceDate = LocalDateTime.of(2021, 1, 10, 0, 0);
        NubbinBattery battery = new NubbinBattery(currentDate, lastServiceDate);
        assertFalse(battery.needsService());
    }
}

// TestSpindlerBattery class contains test cases for SpindlerBattery.
public class TestSpindlerBattery {

    // Test case: needsService returns true when the battery needs service.
    @Test
    public void testNeedsServiceTrue() {
        LocalDateTime currentDate = LocalDateTime.of(2022, 7, 31, 0, 0);
        LocalDateTime lastServiceDate = LocalDateTime.of(2017, 1, 25, 0, 0);
        SpindlerBattery battery = new SpindlerBattery(currentDate, lastServiceDate);
        assertTrue(battery.needsService());
    }

    // Test case: needsService returns false when the battery doesn't need service.
    @Test
    public void testNeedsServiceFalse() {
        LocalDateTime currentDate = LocalDateTime.of(2022, 7, 31, 0, 0);
        LocalDateTime lastServiceDate = LocalDateTime.of(2021, 1, 10, 0, 0);
        SpindlerBattery battery = new SpindlerBattery(currentDate, lastServiceDate);
        assertFalse(battery.needsService());
    }
}
