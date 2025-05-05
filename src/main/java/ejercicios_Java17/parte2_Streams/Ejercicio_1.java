package ejercicios_Java17.parte2_Streams;

import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio_1 {

    public static void main(String[] args) {
        // Nunca uses List.of(...) con posibles valores nulos. Usa Arrays.asList(...) o new ArrayList<>() cuando no estés 100% seguro.
        List<String> names = List.of("Ana", "Luis", "Pedro", "María", "Lucía");

        List<String> resultado = names.stream()                  // paso 1: convierte la lista a stream
                .filter(nombre -> nombre.length() > 4)     // paso 2: deja solo los que tienen > 4 letras
                .map(String::toUpperCase)                        // paso 3: pasa a mayúsculas
                .collect(Collectors.toList());                   // paso 4: vuelve a convertir en lista

        System.out.println(resultado);
    }
}