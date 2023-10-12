package seminar2.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    @Test
    public void testCarIsInstanceOfVehicle() {
        Car car = new Car("Dodge", "Ram", 2010);
        assertTrue(car instanceof Vehicle);
    }

    @Test
    public void testCarHasFourWheels() {
        Car car = new Car("Dodge", "Ram", 2010);
        assertEquals(4, car.getNumWheels());
    }

    @Test
    public void testMotorcycleHasTwoWheels() {
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2021);
        assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    public void testCarAcceleratesToSixtyDuringTestDrive() {
        Car car = new Car("Dodge", "Ram", 2010);
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    @Test
    public void testMotorcycleAcceleratesToSeventyFiveDuringTestDrive() {
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2021);
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    public void testCarStopsDuringPark() {
        Car car = new Car("Dodge", "Ram", 2010);
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    @Test
    public void testMotorcycleStopsDuringPark() {
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2021);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }


}