package ejercicios_Java17.parte7_EjerciciosExtra;

import java.util.List;
import java.util.Optional;

public class Ejercicio_2 {
    public static Optional<Double> averageOptionals(List<Optional<Integer>> optionals) {
        return optionals.stream()               // Convierto la lista en un Stream así puedo trabajar cada elemento 1 x 1
                .filter(Optional::isPresent)    // Me quedo solo con los Optional que tienen valor
                .map(Optional::get)             // Saco el Integer de cada Optional lo que transforma el Stream<Optional<Integer>> en un Stream<Integer>
                .mapToInt(Integer::intValue)    // Lo convierto a IntStream así puedo usar funciones como .sum(), .average(), etc.
                .average()                      // Calcula la media de los valores del IntStream, devuelve OptionalDouble
                .stream()                       // Convierte el OptionalDouble en un Stream<Double> si hay valor
                .boxed()                        // Asegura que trabajamos con Double en vez de double.
                .findFirst();                   // Capturamos ese único valor en un Optional<Double>.
    }

    public static void main(String[] args) {
        List<Optional<Integer>> optionals = List.of(
                Optional.of(10),
                Optional.empty(),
                Optional.of(50),
                Optional.of(90),
                Optional.empty()
        );

        // Ejecuto la función y guardo el resultado
        Optional<Double> resultado = averageOptionals(optionals);


        // Es una forma moderna de decir:
        //“Si el valor existe, haz esto — si no, haz otra cosa.”
        // No necesitas escribir un if ni tampoco necesitas hacer resultado.get() que puede lanzar error
        resultado.ifPresentOrElse(
                avg -> System.out.println("Promedio: " + avg),
                () -> System.out.println("No hay valores presentes")
        );
    }
}