public abstract class UnidadCombate {
    private String _nombre;
    private int _vidas;
    private int _maxVidas;

    public String getnombre() {
        return _nombre;
    }

    public void setnombre(String _nombre) {
        this._nombre = _nombre;
    }

    public int getvidas() {
        return _vidas;
    }

    public void setvidas(int _vidas) {
        this._vidas = _vidas;
    }

    public int getmaxVidas() {
        return _maxVidas;
    }

    public void setmaxVidas(int _maxVidas) {
        this._maxVidas = _maxVidas;
    }

    public UnidadCombate(String _nombre, int _maxVidas) {
        if(_maxVidas <= 0){
            throw new IllegalArgumentException("Las vidas no pueden tener esos valores");
        }
        setnombre(_nombre);
        setvidas(_maxVidas);
        setmaxVidas(_maxVidas);
    }
    public abstract void atacar();


    public String mostrarEstado() {

        return getnombre() + " | vidas: "+ getvidas() ;
    }
}
