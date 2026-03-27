package Types;

import Constants.Enums.Combustible;

public abstract class Combustion extends Motor{

    private double _dblConsumo;

    public double get_dblConsumo() {
        return _dblConsumo;
    }

    public void set_dblConsumo(double _dblConsumo) {
        this._dblConsumo = _dblConsumo;
    }

    public Combustion(double _dblConsumo, Integer p_iCilindrada, Integer p_iPar, Integer p_iCilindros, Integer p_iRPM, Integer p_iVelocidad, Integer p_iPotencia, Combustible p_eCombustible) {
        super(p_iCilindrada, p_iPar, p_iCilindros, p_iRPM, p_iVelocidad, p_iPotencia, p_eCombustible);


    }

    public boolean Arrancar(){
        return false;
        }

    @Override
    public String toString() {
        return "Combustion{" +
                "_dblConsumo=" + _dblConsumo +
                '}';
    }
}
