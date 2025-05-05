package ejercicios_Java17.parte2_Streams;

import java.util.List;

public class Ejercicio_2 {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int suma = numbers.stream()
                .filter(n -> n % 2 == 0)        // Filtro pares
                .map(n -> n * n)                // Elevo al cuadrado
                .mapToInt(Integer::intValue)    // Convierto a IntStream
                .sum();                         // Sumo todo

        System.out.println("Suma de cuadrados de pares: " + suma); // 220
    }
}