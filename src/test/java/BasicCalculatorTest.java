import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicCalculatorTest {

    @Test
    void add() {
        BasicCalculator calculator = new BasicCalculator(2);
        int a = 0;
        int b = 0;
        long actual = calculator.add(10L, 25L);
        long expected = 35;
        assertEquals(expected, actual);
    }

    @Test
    void addFail() {
        BasicCalculator calculator = new BasicCalculator(2);
        int a = 0;
        int b = 0;
        long actual = calculator.add(12L, 25L);
        long expected = 35;
        //assertEquals(expected, actual);
        assertFalse(expected < 40);
    }
    @Test
    void addMoreValuesPass() {
        BasicCalculator calculator = new BasicCalculator(2);
        long actual = calculator.add(4, 2, 3);
        long expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void addMoreValuesFail() {
        BasicCalculator calculator = new BasicCalculator(2);
        long actual = calculator.add(4, 2, 3);
        long expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void addDoubleValuesPass() {
        BasicCalculator calculator = new BasicCalculator(2);
        double actual = calculator.add(2.1, 2.0);
        double expected = 4.1;
        assertEquals(expected, actual);
    }

    @Test
    void addDoubleValuesPassFail() {
        BasicCalculator calculator = new BasicCalculator(2);
        double actual = calculator.add(2.1, 2.0);
        double expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void multiplyPass() {
        BasicCalculator calculator = new BasicCalculator(2);
        long actual = calculator.multiply(2, 3);
        long expected = 6;
        assertEquals( expected, actual);
        assertFalse(actual < 4);
    }

    @Test
    void multiplyFail() {
        BasicCalculator calculator = new BasicCalculator(2);
        long actual = calculator.multiply(2, 3);
        long expected = 5;
        assertEquals( expected, actual);
    }

    @Test
    void divide() {
        BasicCalculator calculator = new BasicCalculator(2);
        double div = calculator.divide(5,2);
        double expected = 2.5;
        assertEquals( expected, div);
    }

    @Test
    void divideFail() {
        BasicCalculator calculator = new BasicCalculator(2);
        double div = calculator.divide(5,2);
        double expected = 4;
        assertEquals( expected, div);
    }

    @Test
    void format() {
    }
}