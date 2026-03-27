import Exception.Denominador0Exception;

public class Denominador {
    private int _valor;
    private int _valor_DEF = 1;

    public int get_valor() {
        return _valor;
    }

    public void setvalor(int _valor) throws Denominador0Exception{
        if(_valor == 0){
            throw new Denominador0Exception("El denominador no puede ser 0");
        }
        this._valor = _valor;
    }

    public Denominador(int _valor) throws Denominador0Exception {
        if(_valor == 0){
            throw new Denominador0Exception("El denominador no puede ser 0");
        }
        setvalor(_valor);
    }


    public String toString() {
        return "El valor del denominador es: " + _valor ;
    }
}
