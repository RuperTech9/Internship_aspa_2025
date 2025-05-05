package ejercicios_Java17.parte8_TestUnitarios;

import java.util.Arrays;

public class IntegerCalculator implements Calculator<Integer> {

    @Override
    public Integer sum(Integer... numbers) {
        checkNull(numbers);
        return Arrays.stream(numbers).mapToInt(Integer::intValue).sum();
    }

    @Override
    public Integer subtract(Integer... numbers) {
        checkNull(numbers);
        return Arrays.stream(numbers).reduce((a, b) -> a - b).orElse(0);
    }

    @Override
    public Integer multiply(Integer... numbers) {
        checkNull(numbers);
        return Arrays.stream(numbers).reduce(1, (a, b) -> a * b);
    }

    @Override
    public Integer divide(Integer dividend, Integer divisor) {
        if (dividend == null || divisor == null) {
            throw new IllegalArgumentException("Neither dividend nor divisor can be null");
        }
        if (divisor == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return dividend / divisor;
    }

    private void checkNull(Integer... numbers) {
        if (numbers == null || Arrays.asList(numbers).contains(null)) {
            throw new IllegalArgumentException("Numbers must not be null");
        }
    }
}