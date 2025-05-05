package pruebasUnitarias;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

/**
 * Test unitario con JUnit 5 + Mockito usando IntegerCalculator.
 */
@ExtendWith(MockitoExtension.class) // conector que hace que JUnit y Mockito trabajen juntos
class IntegerCalculatorMockitoTest {

    @Mock // para crear objetos falsos
    Calculator<Integer> calculator;

    @InjectMocks // para que Mockito inyecte esos mocks en una clase
    IntegerCalculator realCalculator = new IntegerCalculator(); // no lo usa porque es de prueba

    @Test
    void testSum() {
        when(calculator.sum(1, 2, 3)).thenReturn(6);

        Integer result = calculator.sum(1, 2, 3);

        assertEquals(6, result);
        verify(calculator).sum(1, 2, 3);
    }

    @Test
    void testMultiply() {
        when(calculator.multiply(2, 3, 4)).thenReturn(24);

        Integer result = calculator.multiply(2, 3, 4);

        assertEquals(24, result);
        verify(calculator).multiply(2, 3, 4);
    }

    @Test
    void testDivideByZero() {
        when(calculator.divide(anyInt(), eq(0)))
                .thenThrow(new IllegalArgumentException("Cannot divide by zero"));

        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
        verify(calculator).divide(10, 0);
    }
}