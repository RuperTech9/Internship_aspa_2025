package ejercicios_Java17.parte3_FuncionesLambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ejercicio_1 {

    public static void main(String[] args) {
        List<String> palabras = Arrays.asList("sol", "estrella", "luz", "universo", "luna");

        // Comparator con lambda: ordeno por longitud (menor a mayor)
        palabras.sort((a, b) -> Integer.compare(a.length(), b.length()));

        // Versión más compacta con Comparator.comparing, también usa lambdas por debajo
        palabras.sort(Comparator.comparing(String::length));

        System.out.println(palabras);
    }
}