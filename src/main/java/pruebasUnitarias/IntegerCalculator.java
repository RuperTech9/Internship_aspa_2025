package pruebasUnitarias;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Implementación de Calculator para Integer.
 */

public class IntegerCalculator implements Calculator<Integer> {

    /**
     * Suma todos los números recibidos como parámetros.
     *
     * @param numbers los números a sumar
     * @return la suma total
     * @throws IllegalArgumentException si alguno de los números es null
     */
    @Override
    public Integer sum(final Integer... numbers) throws IllegalArgumentException {
        validate(numbers); // Verifico que no haya nulls
        return Stream.of(numbers)           // Crea un flujo de números
                .mapToInt(Integer::intValue)    // Los convierte a int primitivo
                .sum();                         // Realiza la suma total
    }

    /**
     * Resta los números de izquierda a derecha.
     *
     * @param numbers los números a restar
     * @return el resultado de la resta
     * @throws IllegalArgumentException si alguno es null
     */
    @Override
    public Integer subtract(final Integer... numbers) throws IllegalArgumentException {
        validate(numbers);
        return Arrays.stream(numbers)                      // Crea flujo de números
                .reduce((a, b) -> a - b)    // Resta en orden: ((a - b) - c)...
                .orElse(0);                         // Si está vacío, devuelve 0
    }

    /**
     * Multiplica todos los números recibidos.
     *
     * @param numbers los números a multiplicar
     * @return el producto total
     * @throws IllegalArgumentException si alguno es null
     */
    @Override
    public Integer multiply(final Integer... numbers) throws IllegalArgumentException {
        validate(numbers);
        return Arrays.stream(numbers).reduce(1, (a, b) -> a * b);
    }

    /**
     * Divide un dividendo entre un divisor.
     *
     * @param dividend el número a dividir
     * @param divisor el número por el cual se divide
     * @return el resultado de la división
     * @throws IllegalArgumentException si alguno es null o el divisor es 0
     */
    @Override
    public Integer divide(final Integer dividend, Integer divisor) throws IllegalArgumentException {
        if (dividend == null || divisor == null) {
            throw new IllegalArgumentException("Null values not allowed");
        }
        if (divisor == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return dividend / divisor;
    }

    /**
     * Método auxiliar que valida que no haya valores nulos en los parámetros.
     *
     * @param numbers los números a validar
     * @throws IllegalArgumentException si algún número es null
     */
    private void validate(Integer... numbers) {
        if (numbers == null || Arrays.asList(numbers).contains(null)) {
            throw new IllegalArgumentException("Numbers must not be null");
        }
    }
}
