import java.io.Serializable;

public abstract class CargoPublico implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nombre;
    private int nivelDeCaspa;

    public CargoPublico(String nombre, int nivelDeCaspa) {
        this.nombre = nombre;
        this.nivelDeCaspa = nivelDeCaspa;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivelDeCaspa() {
        return nivelDeCaspa;
    }

    public void setNivelDeCaspa(int nivelDeCaspa) {
        this.nivelDeCaspa = nivelDeCaspa;
    }

    public abstract void trabajar();
}