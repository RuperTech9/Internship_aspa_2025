package pruebasUnitarias;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class IntegerCalculatorUnitTest {

    Calculator<Integer> calculator = new IntegerCalculator();

    @Test
    void testSum() {
        assertEquals(10, calculator.sum(4, 3, 2, 1),"No correct sum");
    }

    @Test
    void testSubtract() {
        assertEquals(-6, calculator.subtract(1, 2, 3, 2), "No correct subtraction");
    }

    @Test
    void testMultiply() {
        assertEquals(24, calculator.multiply(2, 3, 4));
    }

    @Test
    void testDivide() {
        assertEquals(2, calculator.divide(10, 5));
    }

    @Test
    void testDivideByZeroThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
    }

    @Test
    void testNullInVarargsThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> calculator.sum(1, null, 3));
    }

    @Test
    void testNullDividendThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(null, 2));
    }

    @Test
    void testNullDivisorThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(2, null));
    }
}
