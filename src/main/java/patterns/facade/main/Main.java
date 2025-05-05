package patterns.facade.main;

import patterns.facade.CinemaFacade;
import patterns.facade.Pantalla;
import patterns.facade.Proyector;
import patterns.facade.SistemaSonido;

public class Main {
    public static void main(String[] args) {
        Proyector proyector = new Proyector();
        Pantalla pantalla = new Pantalla();
        SistemaSonido sonido = new SistemaSonido();

        CinemaFacade cine = new CinemaFacade(proyector, pantalla, sonido);

        cine.watchMovie();
        System.out.println();
        cine.endMovie();
    }
}
