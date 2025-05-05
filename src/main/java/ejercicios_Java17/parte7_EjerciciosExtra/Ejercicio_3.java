package ejercicios_Java17.parte7_EjerciciosExtra;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio_3 {

    public static void main(String[] args) {
        List<Object> lista = List.of(
                "¿Que hay de nuevo amigos?",
                9,
                LocalDate.now()
        );

        // Comienza un Stream<Object> para procesar cada elemento de forma funcional
        String resumen = lista.stream()
                // Mapeo cada objeto a una línea de texto
                .map(obj -> {
                    if (obj instanceof String s) { // Verifio si el objeto es un String. Si lo es, lo guarda automáticamente en la variable s
                        return "Found a String: \"" + s + "\"";
                    } else if (obj instanceof Integer i) { // Igual que antes, pero para enteros
                        return "Found an Integer: " + i;
                    } else { // Para cualquier otro tipo
                        return "Unknown type: " + obj.getClass();
                    }
                })
                // Uno todas las líneas en un único String multilínea
                .collect(Collectors.joining("\n","" ,""));

        System.out.println("\n" + resumen);
    }
}