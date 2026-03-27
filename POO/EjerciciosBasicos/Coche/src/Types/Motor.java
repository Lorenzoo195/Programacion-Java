package Types;

import Constants.Enums.Combustible;

public abstract class Motor {

    private Integer _iCilindrada;
    private Integer _iPar;
    private Integer _iCilindros;
    private Integer _iRPM;
    private Integer _iVelocidad;
    private Integer _iPotencia;
    private Combustible m_eCombustible;


    public Integer getCilindrada() { //get en public
        return _iCilindrada;
    }

    private void setCilindrada(Integer value) { //set en private
        this._iCilindrada = value;
    }

    public Integer getPar() {
        return _iPar;
    }

    private void setPar(Integer value) {
        this._iPar = value;
    }

    public Integer getCilindros() {
        return _iCilindros;
    }

    private void setCilindros(Integer value) {
        this._iCilindros = value;
    }

    public Integer getRPM() {
        return _iRPM;
    }

    private void setRPM(Integer value) {
        this._iRPM = value;
    }

    public Integer getVelocidad() {
        return _iVelocidad;
    }

    private void setVelocidad(Integer value) {
        this._iVelocidad = value;
    }

    public Integer getPotencia() {
        return _iPotencia;
    }

    private void setPotencia(Integer value) {
        this._iPotencia = value;
    }

    public Combustible getCombustible()
    {
        return m_eCombustible;
    }
    private void setCombustible(Combustible value)
    {
        m_eCombustible = value;
    }

    public Motor(Integer p_iCilindrada, Integer p_iPar, Integer p_iCilindros, Integer p_iRPM, Integer p_iVelocidad, Integer p_iPotencia, Combustible p_eCombustible) {
        setCilindrada( p_iCilindrada);
        setPar(p_iPar);
        setCilindros(p_iCilindros);
        setRPM(p_iRPM);
        setVelocidad(p_iVelocidad);
        setPotencia(p_iPotencia);
        setCombustible(p_eCombustible);
    }
    public abstract boolean Arranca();

}