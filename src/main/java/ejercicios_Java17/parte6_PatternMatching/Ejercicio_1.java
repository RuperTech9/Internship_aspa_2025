package ejercicios_Java17.parte6_PatternMatching;

public class Ejercicio_1 {

    public static void printStringLength(Object obj) {
        // Compruebo si obj es instancia de String
        // Si lo es, automáticamente hace el cast y lo guarda en una nueva variable s
        if (obj instanceof String s) {
            System.out.println("Longitud: " + s.length()); // Ya puedo usar s directamente, sin hacer (String) obj
        } else {
            System.out.println("No es un String.");
        }
    }

    public static void main(String[] args) {
        printStringLength("Hola mundo");    // Longitud: 10
        printStringLength(123);             // No es un String.
        printStringLength(null);            // No es un String.
    }
}