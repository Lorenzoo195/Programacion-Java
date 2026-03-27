import java.io.Serializable;
import java.util.Objects;

public class Ciudadano implements Serializable {
    private static final long serialVersionUID = 1L;
    private String dni;
    private String nombre;

    public Ciudadano(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ciudadano ciudadano = (Ciudadano) o;
        return Objects.equals(dni, ciudadano.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }
}
