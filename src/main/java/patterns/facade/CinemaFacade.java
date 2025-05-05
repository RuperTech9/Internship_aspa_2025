package patterns.facade;

public class CinemaFacade {
    private Proyector proyector;
    private Pantalla pantalla;
    private SistemaSonido sonido;

    public CinemaFacade(Proyector proyector, Pantalla pantalla, SistemaSonido sonido) {
        this.proyector = proyector;
        this.pantalla = pantalla;
        this.sonido = sonido;
    }

    public void watchMovie() {
        System.out.println("Preparing movie");
        pantalla.bajar();
        sonido.encender();
        sonido.modoCine();
        proyector.encender();
        System.out.println("Watch movie");
    }

    public void endMovie() {
        System.out.println("Ending the session");
        proyector.apagar();
        sonido.apagar();
        pantalla.subir();
        System.out.println("End movie");
    }
}