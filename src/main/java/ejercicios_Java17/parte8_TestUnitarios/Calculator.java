package ejercicios_Java17.parte8_TestUnitarios;

public interface Calculator<T> {

    T sum(final T... number) throws IllegalArgumentException;

    T subtract(final T... number) throws IllegalArgumentException;

    T multiply(final T... number) throws IllegalArgumentException;

    T divide(final T dividend, final T divisor) throws IllegalArgumentException;
}