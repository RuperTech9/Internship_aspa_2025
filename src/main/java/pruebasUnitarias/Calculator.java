package pruebasUnitarias;

public interface Calculator<T> {

    /**
     * Sums all the numbers passed as a parameter
     *
     * @param number the number to sum
     * @return the sum
     * @throws IllegalArgumentException in case one number is null
     */
    T sum(final T... number) throws IllegalArgumentException;

    /**
     * Subtracts all the numbers passed as a parameter
     *
     * @param number the number to subtract
     * @return the subtraction
     * @throws IllegalArgumentException in case one number is null
     */
    T subtract(final T... number) throws IllegalArgumentException;

    /**
     * Multiplies all the numbers passed as a parameter
     *
     * @param number the number to multiply
     * @return the multiplication
     * @throws IllegalArgumentException in case one number is null
     */
    T multiply(final T... number) throws IllegalArgumentException;

    /**
     * Divides the dividend by the divisor
     *
     * @param dividend the dividend to divide
     * @param divisor the divisor to divide
     * @return the division
     * @throws IllegalArgumentException in case the dividend or divisor are null
     *                                  or the divisor number is 0
     */
    T divide(final T dividend, final T divisor) throws IllegalArgumentException;
}
