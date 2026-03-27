package Type;

import Constantes.Enum.Combustible;

public class Motor {
    public Integer potencia;
    public Integer cilindrada;
    public Integer par;
    public Integer numCilindros;
    public Integer _iVelociad;

    public Integer getCilindrada() {
        return cilindrada;
    }

    private void setCilindrada(Integer value) {
        this.cilindrada = value;
    }

    public Integer getPar() {
        return par;
    }

    private void setPar(Integer value) {
        this.par = value;
    }

    public Integer getNumCilindros() {
        return numCilindros;
    }

    private void setNumCilindros(Integer value) {
        this.numCilindros = value;
    }

    public Integer get_iVelociad() {
        return _iVelociad;
    }

    private void set_iVelociad(Integer value) {
        this._iVelociad = value;
    }

    public Integer getPotencia() {
        return potencia;
    }

    private void setPotencia(Integer value) {
        this.potencia = value;
    }

    private Combustible _strCombustible;

    public Combustible get_strCombustible(){
        return _strCombustible;
    }
    private void getCombustible(Combustible value){
        _strCombustible = value;
    }

    public Motor() {
        setPotencia(500);
        setCilindrada(2500);
        setPar(100);
        setNumCilindros(6);
        set_iVelociad(300);

    }

    public Motor(Integer potencia, Integer cilindrada, Integer par, Integer numCilindros,
                 Integer _iVelociad, Combustible _strCombustible) {
        setPotencia(potencia);
        setCilindrada(cilindrada);
        setPar(par);
        setNumCilindros(numCilindros);
        set_iVelociad(_iVelociad);

    }
}
