import java.io.Serializable;

public abstract class Entidad implements Serializable {

    private static final long serialVersionUID = 1L;

    private String _nombre;
    private int _puntosDeVida;

    public String getnombre() {
        return _nombre;
    }

    public void setnombre(String _nombre) {
        this._nombre = _nombre;
    }

    public int getPuntosDeVida() {
        return _puntosDeVida;
    }

    public void setPuntosDeVida(int puntosDeVida) {
        this._puntosDeVida = puntosDeVida;
    }

    public abstract void atacar(Entidad objeto);

    public Entidad(String _nombre, int _puntosDeVida) {
        setnombre(_nombre);
        setPuntosDeVida(_puntosDeVida);
    }
}
