package ejercicios_Java17.parte7_EjerciciosExtra;

import java.util.List;
import java.util.stream.Stream;

public class Ejercicio_4 {

    public static void main(String[] args) {
        List<String> phrases = List.of(
                "Hola mundo",
                "Aprendiendo Java",
                "Streams son poderosos",
                "Lambdas y Optionals"
        );

        // Stream de todas las palabras, en minúsculas (como una sola lista)
        List<String> allWords = phrases.stream()
                // Aplano todos los streams de palabras en un solo stream.
                .flatMap(frase -> Stream.of(frase.toLowerCase().split(" ")))
                // Convierto el Stream<String> final en una lista de palabras:
                .toList();

        long totalPalabras = allWords.size();                       // todas
        long palabrasUnicas = allWords.stream().distinct().count(); // únicas

        System.out.println("Total de palabras: " + totalPalabras);
        System.out.println("Palabras únicas: " + palabrasUnicas);
    }
}