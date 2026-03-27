public class Guerrero extends UnidadCombate{
    private int _fuerza;

    public int getfuerza() {
        return _fuerza;
    }

    public void setfuerza(int _fuerza) {
        this._fuerza = _fuerza;
    }

    public Guerrero(String _nombre, int _maxVidas, int _fuerza) {
        super(_nombre, _maxVidas);
        setfuerza(_fuerza);
    }

    @Override
    public void atacar() {
        int espadazo = 2*getfuerza();
        System.out.println(getnombre() + " ataca con espada y causa "
                            + espadazo + " de daño.");
    }

    @Override
    public String mostrarEstado() {
        String infoPadre = super.mostrarEstado();
        return "Guerro: "+ infoPadre + " | Fuerza " + _fuerza ;
    }

}
