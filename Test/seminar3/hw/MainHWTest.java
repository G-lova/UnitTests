import org.junit.Before;
import org.junit.Test;
import seminar3.hw.MainHW;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainHWTest {
    private MainHW number;
    @Before
    public void createNumber() {
        number = new MainHW();
    }

    @Test
    public void testEvenNumber() {
        assertTrue(number.evenOddNumber(0));
        assertTrue(number.evenOddNumber(2));
        assertTrue(number.evenOddNumber(4));
        assertTrue(number.evenOddNumber(100));
    }

    @Test
    public void testOddNumber() {
        assertFalse(number.evenOddNumber(1));
        assertFalse(number.evenOddNumber(3));
        assertFalse(number.evenOddNumber(5));
        assertFalse(number.evenOddNumber(101));
    }

    @Test
    public void testNegativeEvenNumber() {
        assertTrue(number.evenOddNumber(-2));
        assertTrue(number.evenOddNumber(-4));
        assertTrue(number.evenOddNumber(-100));
    }

    @Test
    public void testNegativeOddNumber() {
        assertFalse(number.evenOddNumber(-1));
        assertFalse(number.evenOddNumber(-3));
        assertFalse(number.evenOddNumber(-101));
    }

    @Test
    public void testPositiveEvenNumber() {
        assertTrue(number.evenOddNumber(2));
        assertTrue(number.evenOddNumber(4));
        assertTrue(number.evenOddNumber(100));
    }

    @Test
    public void testPositiveOddNumber() {
        assertFalse(number.evenOddNumber(1));
        assertFalse(number.evenOddNumber(3));
        assertFalse(number.evenOddNumber(101));
    }


    @Test
    public void testNumberInRange() {
        assertTrue(number.numberInInterval(26));
        assertTrue(number.numberInInterval(50));
        assertTrue(number.numberInInterval(99));
    }

    @Test
    public void testNumberNotInRange() {
        assertFalse(number.numberInInterval(25));
        assertFalse(number.numberInInterval(100));
        assertFalse(number.numberInInterval(0));
        assertFalse(number.numberInInterval(101));
    }

    @Test
    public void testNegativeNumber() {
        assertFalse(number.numberInInterval(-26));
        assertFalse(number.numberInInterval(-50));
        assertFalse(number.numberInInterval(-99));
    }

    @Test
    public void testNumberOnBoundary() {
        assertFalse(number.numberInInterval(24));
        assertFalse(number.numberInInterval(101));
    }
}