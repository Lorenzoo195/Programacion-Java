public class Persona {
    private String _nombre;
    private int _edad;

    public String getnombre() {
        return _nombre;
    }
    public void setnombre(String _nombre) {
        this._nombre = _nombre;
    }

    public int getedad() {
        return _edad;
    }

    public void setedad(int _edad) {
        this._edad = _edad;
    }

    public Persona(int _edad, String _nombre) {
        setedad(_edad);
        setnombre(_nombre);
    }

}
