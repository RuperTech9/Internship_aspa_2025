package ejercicios_Java17.parte1_Optionals;

import java.util.Optional;

/*
  Crea una función que reciba un String y devuelva un Optional que contenga la conversión a número,
  o un Optional.empty() si no es un número válido.
 */

public class Ejercicio_2 {
    public static Optional<Integer> parseInteger(String input) {
        if (input == null) return Optional.empty(); // Si me pasan null
        try {
            return Optional.of(Integer.parseInt(input)); // Solo acepta strings con números enteros válidos
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }

    public static void main(String[] args) {
        System.out.println(parseInteger("0042"));     // Optional[42]
        System.out.println(parseInteger("pepe"));   // Optional.empty
        System.out.println(parseInteger("3.14"));   // Optional.empty
        System.out.println(parseInteger(null));     // Optional.empty
    }

}