package ejercicios_Java17.parte4_MetodosReferenciados;

import java.util.List;

public class Ejercicio_1 {

    public static void main(String[] args) {
        List<String> list = List.of("Java", "SAP", "ABAP", "RAP");

        // Lambda original:
        // list.forEach(s -> System.out.println(s));

        // Método referenciado:
        list.forEach(System.out::println); // referencia al método println del objeto System.out.
    }
}