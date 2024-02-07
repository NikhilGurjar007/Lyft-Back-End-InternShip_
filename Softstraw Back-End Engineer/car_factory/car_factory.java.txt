// Importing the Car class
import car.Car;

// Importing battery types
import battery.battery_type.nubbin_battery.NubbinBattery;
import battery.battery_type.spindler_battery.SpindlerBattery;

// Importing engine types
import engine.engine_type.capulet_engine.CapuletEngine;
import engine.engine_type.sternman_engine.SternmanEngine;
import engine.engine_type.willoughby_engine.WilloughbyEngine;

// Importing tire types
import tires.tires_type.carrigan_tires.CarriganTires;
import tires.tires_type.octoprime_tires.OctoprimeTires;

// CarFactory class responsible for creating different car models
public class CarFactory {

    // Static method to create a Calliope model
    public static Car createCalliope(LocalDate currentDate, LocalDate lastServiceDate, int currentMileage, int lastServiceMileage, int tireWear) {
        CapuletEngine engine = new CapuletEngine(currentMileage, lastServiceMileage);
        SpindlerBattery battery = new SpindlerBattery(currentDate, lastServiceDate);
        CarriganTires tires = new CarriganTires(tireWear);
        return new Car(engine, battery, tires);
    }

    // Static method to create a Glissade model
    public static Car createGlissade(LocalDate currentDate, LocalDate lastServiceDate, int currentMileage, int lastServiceMileage, int tireWear) {
        WilloughbyEngine engine = new WilloughbyEngine(currentMileage, lastServiceMileage);
        SpindlerBattery battery = new SpindlerBattery(currentDate, lastServiceDate);
        OctoprimeTires tires = new OctoprimeTires(tireWear);
        return new Car(engine, battery, tires);
    }

    // Static method to create a Palindrome model
    public static Car createPalindrome(LocalDate currentDate, LocalDate lastServiceDate, boolean warningLightIsOn, int tireWear) {
        SternmanEngine engine = new SternmanEngine(warningLightIsOn);
        SpindlerBattery battery = new SpindlerBattery(currentDate, lastServiceDate);
        CarriganTires tires = new CarriganTires(tireWear);
        return new Car(engine, battery, tires);
    }

    // Static method to create a Rorschach model
    public static Car createRorschach(LocalDate currentDate, LocalDate lastServiceDate, int currentMileage, int lastServiceMileage, int tireWear) {
        WilloughbyEngine engine = new WilloughbyEngine(currentMileage, lastServiceMileage);
        NubbinBattery battery = new NubbinBattery(currentDate, lastServiceDate);
        OctoprimeTires tires = new OctoprimeTires(tireWear);
        return new Car(engine, battery, tires);
    }

    // Static method to create a Thovex model
    public static Car createThovex(LocalDate currentDate, LocalDate lastServiceDate, int currentMileage, int lastServiceMileage, int tireWear) {
        CapuletEngine engine = new CapuletEngine(currentMileage, lastServiceMileage);
        NubbinBattery battery = new NubbinBattery(currentDate, lastServiceDate);
        CarriganTires tires = new CarriganTires(tireWear);
        return new Car(engine, battery, tires);
    }

    // Adding a reference to the license and the author
    // License: Nikhil Gurjar
}
