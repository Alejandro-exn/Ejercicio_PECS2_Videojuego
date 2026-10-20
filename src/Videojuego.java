public class Videojuego {

    public String nombre;
    public String genero;

    String version;
    boolean activo;

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + " | Genero: " + genero + " | Activo: " + activo);
    }

    public void iniciar() {
        activo = true;
    }

    void cerrar() {
        activo = false;
    }

    void mostrarVersion() {
        System.out.println("Version: " + version);
    }
}