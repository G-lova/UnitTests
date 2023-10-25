package seminar6;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class AverageCalculatorTest {

    private AverageCalculator calculator;

    @Before
    public void setUp() {
        calculator = new AverageCalculator();
    }

    @Test
    public void testCalculateAverage() {
        assertEquals(3, calculator.calculateAverage(Arrays.asList(1, 2, 3, 4, 5)), 0.001);
    }

    @Test
    public void testCalculateAverageWithEmptyList() {
        assertThrows(IllegalArgumentException.class, () -> calculator.calculateAverage(Collections.emptyList()));
    }

    @Test
    public void testCompareAveragesFirstListIsGreater() {
        assertEquals("Первый список имеет большее среднее значение",
                calculator.compareAverages(Arrays.asList(1, 2, 3), Arrays.asList(1, 2)));
    }

    @Test
    public void testCompareAveragesSecondListIsGreater() {
        assertEquals("Второй список имеет большее среднее значение",
                calculator.compareAverages(Arrays.asList(1, 2), Arrays.asList(1, 2, 3)));
    }

    @Test
    public void testCompareAveragesListsHaveEqualAverages() {
        assertEquals("Средние значения равны",
                calculator.compareAverages(Arrays.asList(5, 7, 6), Arrays.asList(4, 6, 8)));

    }
}

