package Type;

import Constantes.Enum.*;

public class Rueda {

    private Integer _iAnchura; // Ancho del neumático en milímetros.
    private Integer _iPerfil; //Relación de Aspecto (Ej: 55): Altura del flanco como un porcentaje de la anchura (55% de 205 mm).
    private Construccion _strConstruccion; // (Ej: R): 'R' para Radial, la más común. 'B' para Diagonal.
    private Integer _iDiametro;//  de Llanta (Ej: 16): Tamaño de la llanta en pulgadas.
    private Integer _iIndiceCarga; // (Ej: 91): Código numérico que indica la carga máxima que puede soportar por neumático (91 = 615 kg).
    private CodigoVelocidad _eCodigoVelocidad; // (Ej: V): Letra que indica la velocidad máxima segura (V = 240 km/h).
    private MarcasAdicional _strMarcasAdicionales;
    private Marca _strMarca;
    private String _strModelo;
    private Posicion _strPosicion;

    public Posicion getPosicion() {
        return _strPosicion;
    }

    public void setPosicion(Posicion value){
        this._strPosicion = value;
    }

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
        return _strConstruccion;
    }

    private void setConstruccion(Construccion value) {
        this._strConstruccion = value;
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

    public MarcasAdicional getMarcasAdicionales() {
        return _strMarcasAdicionales;
    }

    private void setMarcasAdicionales(MarcasAdicional value) {
        this._strMarcasAdicionales = value;
    }

    public Marca getMarca() {
        return _strMarca;
    }

    private void setMarca(Marca value) {
        this._strMarca = value;
    }

    public String getModelo() {
        return _strModelo;
    }

    private void setModelo(String value) {
        this._strModelo = value;
    }

    public Rueda (){
        setAnchura(30);
        setPerfil(50);
        setConstruccion(Construccion.R);
        setDiametro(10);
        setIndiceCarga(700);
        setCodigoVelocidad(CodigoVelocidad.W);
        setMarcasAdicionales(MarcasAdicional.BarroNievo);
        setMarca(Marca.Ford);
        setModelo("Michelin");
        setPosicion(Posicion.DelanteraDerecha);

    }

    public Rueda(Integer _iAnchura, Integer _iPerfil, Construccion _strConstruccion, Integer _iDiametro,
                 Integer _iIndiceCarga, CodigoVelocidad _eCodigoVelocidad, MarcasAdicional _strMarcasAdicionales,
                 Marca _strMarca, String _strModelo, Posicion _strPosicion) {
        setAnchura(_iAnchura);
        setPerfil(_iPerfil);
        setConstruccion(_strConstruccion);
        setDiametro(_iDiametro);
        setIndiceCarga(_iIndiceCarga);
        setCodigoVelocidad(_eCodigoVelocidad);
        setMarcasAdicionales(_strMarcasAdicionales);
        setMarca(_strMarca);
        setModelo(_strModelo);
        setPosicion(_strPosicion);
    }
}
