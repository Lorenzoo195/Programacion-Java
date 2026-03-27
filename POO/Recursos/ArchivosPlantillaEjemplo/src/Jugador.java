import java.io.Serializable;

public class Jugador implements Serializable {
    private String nombre;
    private int nivel;

    public Jugador(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Jugador: " + nombre + " (Nivel " + nivel + ")";
    }
}