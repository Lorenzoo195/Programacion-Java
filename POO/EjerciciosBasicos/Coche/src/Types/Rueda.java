package Types;

import Constants.Enums.*;

public class Rueda {
    private  Integer _iAnchura; // Ancho del neumático en milímetros.
    private  Integer _iPerfil; ///Relación de Aspecto (Ej: 55): Altura del flanco como un porcentaje de la anchura (55% de 205 mm).
    private  Construccion _eConstruccion; // (Ej: R): 'R' para Radial, la más común. 'B' para Diagonal.
    private  Integer _iDiametro;//  de Llanta (Ej: 16): Tamaño de la llanta en pulgadas.
    private  Integer _iIndiceCarga; // (Ej: 91): Código numérico que indica la carga máxima que puede soportar por neumático (91 = 615 kg).
    private  CodigoVelocidad _eCodigoVelocidad; // (Ej: V): Letra que indica la velocidad máxima segura (V = 240 km/h).
    private  MarcasAdicionales _eMarcasAdicionales; // M+S (barro y nieve), 3PMSF (nieve), Runflat (permite rodar sin aire).
    private  String  _strMarca;
    private  String  _strModelo;
    private  Posicion _ePosicion;

    public Integer getAnchura() {
        return _iAnchura;
    }

    private void setAnchura(Integer value) {
        this._iAnchura = value;
    }

    public Integer getPerfil() {
        return _iPerfil;
    }

    private void setPerfil(Integer value) {
        this._iPerfil = value;
    }

    public Construccion getConstruccion() {
        return _eConstruccion;
    }

    private void setConstruccion(Construccion value) {
        this._eConstruccion = value;
    }

    public Integer getDiametro() {
        return _iDiametro;
    }

    private void setDiametro(Integer value) {
        this._iDiametro = value;
    }

    public Integer getIndiceCarga() {
        return _iIndiceCarga;
    }

    private void setIndiceCarga(Integer value) {
        this._iIndiceCarga = value;
    }

    public CodigoVelocidad getCodigoVelocidad() {
        return _eCodigoVelocidad;
    }

    private void setCodigoVelocidad(CodigoVelocidad value) {
        this._eCodigoVelocidad = value;
    }

    public MarcasAdicionales getMarcasAdicionales() {
        return _eMarcasAdicionales;
    }

    private void setMarcasAdicionales(MarcasAdicionales value) {
        this._eMarcasAdicionales = value;
    }

    public String getMarca() {
        return _strMarca;
    }

    private void setMarca(String value) {
        this._strMarca = value;
    }

    public String getModelo() {
        return _strModelo;
    }

    private void setModelo(String value) {
        this._strModelo = value;
    }

    public Posicion getPosicion() {
        return _ePosicion;
    }

    private void setPosicion(Posicion value) {
        this._ePosicion = value;
    }
    public Rueda(Integer p_iAnchura, Integer p_iPerfil, Construccion p_eConstruccion, Integer p_iDiametro, Integer p_iIndiceCarga,
                 CodigoVelocidad p_eCodigoVelocidad, MarcasAdicionales p_eMarcasAdicionales, String p_strMarca, String p_strModelo, Posicion p_ePosicion) {
        setAnchura(p_iAnchura);
        setPerfil(p_iPerfil);
        setConstruccion(p_eConstruccion);
        setDiametro(p_iDiametro);
        setIndiceCarga(p_iIndiceCarga);
        setCodigoVelocidad(p_eCodigoVelocidad);
        setMarcasAdicionales(p_eMarcasAdicionales);
        setMarca(p_strMarca);
        setModelo(p_strModelo);
        setPosicion(p_ePosicion);
    }
}
