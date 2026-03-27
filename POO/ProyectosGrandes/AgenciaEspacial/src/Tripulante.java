import Exceptions.BateriaBajaException;

public abstract class Tripulante {
    private String _nombre;
    private int _nivelSalud;

    public String getnombre() {
        return _nombre;
    }

    public void setnombre(String _nombre) {
        this._nombre = _nombre;
    }

    public int getnivelSalud() {
        return _nivelSalud;
    }

    public void setnivelSalud(int _nivelSalud) {
        if (_nivelSalud < 0 || _nivelSalud > 100) {
            throw new IllegalArgumentException("La salud no puede tener esos valores");
        }
        this._nivelSalud = _nivelSalud;
    }


    public String mostrarEstado() {
        return "Tripulante: " + _nombre + " | Salud: " + _nivelSalud;
    }

    abstract void trabajar() throws BateriaBajaException;

    public Tripulante(String _nombre, int _nivelSalud) {
        setnombre(_nombre);
        setnivelSalud(_nivelSalud);
    }
}
