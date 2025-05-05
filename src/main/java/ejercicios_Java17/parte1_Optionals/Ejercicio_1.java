package ejercicios_Java17.parte1_Optionals;

import java.util.Optional;

/*
  Crea una función que reciba un Optional y devuelva la longitud del string si está presente,
  o 0 si está vacío.
 */

public class Ejercicio_1 {

    public static int getStringLength(Optional<String> input) {
        return input.map(String::length).orElse(0); // Si hay un valor, aplica length() al string, si el Optional está vacío, devuelve 0

        /*
         * Solo si alguien te puede pasar null como parámetro (¡lo cual es un mal uso de Optional
             return Optional.ofNullable(input)       // si input es null, usamos empty()
                    .flatMap(o -> o)         // destapamos el Optional interno
                    .map(String::length)
                    .orElse(0);
         */

    }

    public static void main(String[] args) {
        System.out.println(getStringLength(Optional.of("Hola")));     // 4
        System.out.println(getStringLength(Optional.of("ASPA")));     // 4
        System.out.println(getStringLength(Optional.empty()));        // 0
    }
}