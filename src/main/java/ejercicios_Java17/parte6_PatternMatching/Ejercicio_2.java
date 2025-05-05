package ejercicios_Java17.parte6_PatternMatching;

public class Ejercicio_2 {

    public static void addIfIntegers(Object a, Object b) {
        if (a instanceof Integer x && b instanceof Integer y) {
            System.out.println("Suma: " + (x + y));
        } else {
            System.out.println("Error: ambos objetos deben ser Integer.");
        }
    }

    public static void main(String[] args) {
        addIfIntegers(5, 7);           // Suma: 12
        addIfIntegers(5, "siete");     // Error...
        addIfIntegers("cinco", 7);     // Error...
        addIfIntegers(null, 3);        // Error...
    }
}