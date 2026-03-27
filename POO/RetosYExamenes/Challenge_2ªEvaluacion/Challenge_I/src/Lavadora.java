public class Lavadora extends Electrodomestico {
    // atributo + atributo default
    private static final double CARGA_DEF = 5.00;
    double _carga;

    public double getCarga() {
        return _carga;
    }

    public void setCarga(double carga) {
        this._carga = carga;
    }

    public double precioFinal(){
        double precioPadre = super.precioFinal();
        if(this._carga > 30.00){
            precioPadre += 50;
        }
        return precioPadre;
    }

    public Lavadora() {
        super();
        setCarga(CARGA_DEF);
    }

    public Lavadora(double _precioBase, double _peso) {
        super(_precioBase, _peso);
        setCarga(CARGA_DEF);
    }

    public Lavadora(double _precioBase, String _color,
                    char _consumoEnergetico, double _peso, double _carga) {
        super(_precioBase, _color, _consumoEnergetico, _peso);
        setCarga(_carga);
    }

}
