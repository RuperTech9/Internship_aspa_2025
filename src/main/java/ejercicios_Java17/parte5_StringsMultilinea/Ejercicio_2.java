package ejercicios_Java17.parte5_StringsMultilinea;

public class Ejercicio_2 {

    public static void main(String[] args) {
        String text = """
                Uno
                Dos
                Tres
                Cuatro
                """;

        // Cuento las líneas dividiendo por salto de línea y contando el array
        long cantidadLineas = text.lines().count();

        System.out.println("Cantidad de líneas: " + cantidadLineas); // Resultado: 4
    }
}