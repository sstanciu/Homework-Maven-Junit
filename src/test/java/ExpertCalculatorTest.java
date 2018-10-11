import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpertCalculatorTest {
    @Test
    void powerPass() {
        ExpertCalculator calculator1 = new ExpertCalculator(2);
        long actual = calculator1.power(2, 3);
        long expected = 8;
        assertEquals(expected, actual);
    }
    @Test
    void powerPassFail() {
        ExpertCalculator calculator1 = new ExpertCalculator(2);
        long actual = calculator1.power(2, 3);
        long expected = 4;
        assertEquals(expected, actual);
        assertTrue(actual <3);
    }

    @Test
    void sqrtPass() {
        ExpertCalculator calculator1 = new ExpertCalculator(2);
        assertNotNull(calculator1);
        double expected = calculator1.sqrt(9);
        double actual = 3;
        assertTrue(actual >= 0);
        assertEquals(expected, actual);
    }


    @Test
    void sqrtPassFail() {
        ExpertCalculator calculator1 = new ExpertCalculator(2);
        assertNotNull(calculator1);
        int val = -9;
        assertTrue(val >= 0);
        double expected = calculator1.sqrt(val);
        double actual = 3;
        assertEquals(expected, actual);
    }


    @Test
    void factPass() {
        ExpertCalculator calculator1 = new ExpertCalculator(2);
        long expected = calculator1.fact(3);
        long actual = 6;
        assertNotNull(calculator1);
        assertEquals(expected, actual);
    }

    @Test
    void factPassFail() {
        ExpertCalculator calculator1 = new ExpertCalculator(2);
        long expected = calculator1.fact(3);
        long actual = 8;
        assertNotNull(calculator1);
        assertEquals(expected, actual);
    }
}