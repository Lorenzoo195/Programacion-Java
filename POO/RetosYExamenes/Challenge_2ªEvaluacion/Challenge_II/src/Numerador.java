public class Numerador {
    private int _valor;

    public int getValor() {
        return _valor;
    }

    public void setValor(int _valor) {
        this._valor = _valor;
    }

    public Numerador(int _valor) {
        setValor(_valor);
    }


    public String toString() {
        return "El valor del numerador es: " + _valor;
    }
}
