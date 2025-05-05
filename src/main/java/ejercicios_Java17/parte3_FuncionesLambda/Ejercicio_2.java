package ejercicios_Java17.parte3_FuncionesLambda;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Ejercicio_2 {
    /**
     * Filtra una lista de enteros usando un predicado y devuelve solo los que lo cumplen.
     */
    public static List<Integer> filtrar(List<Integer> lista, Predicate<Integer> condicion) {
        return lista.stream()                   // Predicate<Integer> es una función que devuelve true o false
                .filter(condicion)              // Decido qué elementos se quedan
                .collect(Collectors.toList());  // convierto el resultado en una nueva lista
    }

    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Ejemplo: obtener números pares
        List<Integer> pares = filtrar(numeros, n -> n % 2 == 0);

        // Ejemplo: obtener mayores que 5
        List<Integer> mayores = filtrar(numeros, n -> n > 5);

        System.out.println("Pares:   " + pares);     // [2, 4, 6, 8, 10]
        System.out.println("Mayores: " + mayores);   // [6, 7, 8, 9, 10]
    }
}