package ejercicios_Java17.parte4_MetodosReferenciados;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio_2 {

    public static void main(String[] args) {
        // List.of es inmutable → lo copio en un ArrayList para poder ordenar
        List<String> words = new ArrayList<>(List.of("Apple", "banana", "apricot", "Blueberry"));

        // Usamos método referenciado para ordenar ignorando mayúsculas/minúsculas
        words.sort(String::compareToIgnoreCase);

        System.out.println(words);
    }
}