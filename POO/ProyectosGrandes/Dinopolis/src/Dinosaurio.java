public abstract class Dinosaurio {
    private String _nombre;
    private double _tamanhoEnMetro;
    private String _periodo;

    public String getnombre() {
        return _nombre;
    }

    public void setnombre(String _nombre) {
        this._nombre = _nombre;
    }

    public double getTamanhoEnMetro() {
        return _tamanhoEnMetro;
    }

    public void setTamanhoEnMetro(double tamanhoEnMetro) {
        this._tamanhoEnMetro = tamanhoEnMetro;
    }

    public String getPeriodo() {
        return _periodo;
    }

    public void setPeriodo(String periodo) {
        this._periodo = periodo;
    }

    public Dinosaurio(String _nombre, double _tamanhoEnMetro, String _periodo) {
        setnombre(_nombre);
        setTamanhoEnMetro(_tamanhoEnMetro);
        setPeriodo(_periodo);
    }

    abstract void rugir();
}
