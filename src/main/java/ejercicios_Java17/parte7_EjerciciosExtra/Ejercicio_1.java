package ejercicios_Java17.parte7_EjerciciosExtra;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercicio_1 {

    public record Person(String name, int age) {}

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Ana", 23),
                new Person("Luis", 31),
                new Person("Pedro", 23),
                new Person("Lucía", 28),
                new Person("Marta", 31)
        );

        // Agrupo por edad clave/valor: Map<edad, lista de personas con esa edad>
        Map<Integer, List<Person>> agrupado = people.stream()
                .collect(Collectors.groupingBy(Person::age)); // Le digo: “Agrupa los elementos del stream por una clave”

        // Imprimimos cada grupo
        agrupado.forEach((edad, personas) -> { // Recorro el mapa
            String nombres = personas.stream() // Convierto esa lista en un Stream
                    .map(Person::name) // Transformo cada Person → a su name
                    .collect(Collectors.joining(", ")); // Uno todos los nombres en un solo string, separados por comas
            System.out.println("Edad: " + edad + " -> " + nombres);
        });
    }
}