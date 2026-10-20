public class MainVideojuego {

    public static void main(String[] args) {

        Videojuego j1 = new Videojuego();
        j1.nombre = "Minecraft";
        j1.genero = "Aventura";
        j1.version = "1.21";
        j1.iniciar();

        Videojuego j2 = new Videojuego();
        j2.nombre = "FIFA 24";
        j2.genero = "Deportes";
        j2.version = "2.0";
        j2.cerrar();

        Videojuego j3 = new Videojuego();
        j3.nombre = "Fortnite";
        j3.genero = "Battle Royale";
        j3.version = "30.10";
        j3.iniciar();

        j1.mostrarInformacion();
        j1.mostrarVersion();

        j2.mostrarInformacion();
        j2.mostrarVersion();

        j3.mostrarInformacion();
        j3.mostrarVersion();
    }
}
 