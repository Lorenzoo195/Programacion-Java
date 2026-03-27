import java.util.Objects;

public class Monstruo extends Entidad{
    private int nivelMaldad;
    private int id;

    public Monstruo(String _nombre, int _puntosDeVida, int nivelMaldad, int id) {
        super(_nombre, _puntosDeVida);
        setNivelMaldad(nivelMaldad);
        setId(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNivelMaldad() {
        return nivelMaldad;
    }

    public void setNivelMaldad(int nivelMaldad) {
        this.nivelMaldad = nivelMaldad;
    }

    @Override
    public void atacar(Entidad objeto) {
        System.out.println("!"+ getnombre() + " muerde!");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Monstruo monstruo = (Monstruo) o;
        return id == monstruo.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
