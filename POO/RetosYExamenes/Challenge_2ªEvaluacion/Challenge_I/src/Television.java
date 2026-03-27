public class Television extends Electrodomestico{
    //atributos + atributos por default
    private static final int RESOLUCION_DEF = 20;
    private static final boolean SINTONIZADOR_DEF = false;

    int _resolucion;
    boolean _sintonizador;

    public int getresolucion() {
        return _resolucion;
    }

    public void setresolucion(int _resolucion) {
        this._resolucion = _resolucion;
    }

    public boolean issintonizador() {
        return _sintonizador;
    }

    public void setsintonizador(boolean _sintonizador) {
        this._sintonizador = _sintonizador;
    }

    public double precioFinal(){
        double precioPadre = super.precioFinal();
        if(this._resolucion > 40){
            precioPadre = precioPadre*1.30;
        }
        if(this._sintonizador){
            precioPadre += 50;
        }
        return precioPadre;
    }

    public Television() {
        super();
        setresolucion(RESOLUCION_DEF);
        setsintonizador(SINTONIZADOR_DEF);
    }

    public Television(double _precioBase, double _peso) {
        super(_precioBase, _peso);
        setresolucion(RESOLUCION_DEF);
        setsintonizador(SINTONIZADOR_DEF);
    }

    public Television(double _precioBase, String _color,
                      char _consumoEnergetico, double _peso, int _resolucion, boolean _sintonizador) {
        super(_precioBase, _color, _consumoEnergetico, _peso);
        setresolucion(_resolucion);
        setsintonizador(_sintonizador);
    }
}
