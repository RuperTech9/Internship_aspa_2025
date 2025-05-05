package patterns.singleton.main;

import patterns.singleton.ConfigManager;

public class Main {
    public static void main(String [] args) {
        ConfigManager conf1 = ConfigManager.getInstance();
        ConfigManager conf2 = ConfigManager.getInstance();

        System.out.println("Idioma: " + conf1.getConfig2()); //es_ES
        conf2.setConfig2("en_US");

        // conf1 y con2 son la misma instancia
        System.out.println("Idioma actualizado: " + conf1.getConfig2()); // en_US
        System.out.println("Son la misma instancia: " + (conf1 == conf2)); // true
    }
}
