import Constantes.Enum.*;
import Type.Color;
import Type.Motor;
import Type.Rueda;

public class Coche {

    private String n_strMatricula;
    private Marca n_strMarca;
    private Double n_dblPrecio;
    private Type.Color n_strColor;
    private Integer n_iPuerta;
    private Type.Rueda [] n_iRuedas = new Type.Rueda[4];
    private Chasis n_strTipo;
    private Transmision n_strTransmision;
    private Type.Motor n_strMotor;



    public String getMatricula() {
        return n_strMatricula;
    }

    private void setMatricula(String value) {
        this.n_strMatricula = value;
    }

    public Marca getMarca() {
        return n_strMarca;
    }

    private void setMarca(Marca value) {
        this.n_strMarca = value;
    }

    public Double getPrecio() {
        return n_dblPrecio;
    }

    private void setPrecio(Double value) {
        this.n_dblPrecio = value;
    }

    public Color getColor() {
        return n_strColor;
    }

    private void setColor(Color value) {
        this.n_strColor = value;
    }

    public Integer getPuerta() {
        return n_iPuerta;
    }

    private void setPuerta(Integer value) {
        this.n_iPuerta = value;
    }

    public Rueda[] getRuedas() {
        return n_iRuedas;
    }

    private void setRuedas(Rueda[] value) {
        if( value == null || value.length != 4){
           // throw new NumeroRuedasNoValidoException;
            throw  new IllegalArgumentException("El numero de ruedas proporcionado no es valido");
        }
        int sumaPosiciones = 0;

        for(Rueda r: value){
            if(r == null) throw new IllegalArgumentException("Rueda no valida");
            // usamos switch o una serie de ifs para sumar valores unicos
            switch (r.getPosicion()){
                case DelanteraDerecha: sumaPosiciones += 1; break;
                case DelanteraIzquierda: sumaPosiciones += 2; break;
                case TraseraDerecha: sumaPosiciones += 3; break;
                case TraseraIzquierda: sumaPosiciones +=4; break;
            }
        }

        // Si hay un duplicado(ej. dos Delanteras derechas), la suma nunca sera 15
        if(sumaPosiciones !=15){
            throw new IllegalArgumentException("La posicion de las ruedas es incorrecta o estan duplicados");
        }

        this.n_iRuedas = value;
    }

    public Chasis getTipo() {
        return n_strTipo;
    }

    private void setTipo(Chasis value) {
        this.n_strTipo = value;
    }

    public Transmision getTransmision() {
        return n_strTransmision;
    }

    private void setTransmision(Transmision value) {
        this.n_strTransmision = value;
    }

    public Motor getMotor() {
        return n_strMotor;
    }

    private void setMotor(Motor value) {
        this.n_strMotor = value;
    }

    public Coche(String n_strMatricula, Marca n_strMarca, Double n_dblPrecio, Color n_strColor,
                 Integer n_iPuerta, Rueda[] n_iRuedas, Chasis n_strTipo,
                 Transmision n_strTransmision, Motor n_strMotor) {
        setMatricula(n_strMatricula);
        setMarca(n_strMarca);
        setPrecio(n_dblPrecio);
        setColor(new Color());
        setPuerta(n_iPuerta);
        setRuedas(  new Rueda[] {new Rueda(30, 50,Construccion.R,10,700,CodigoVelocidad.W,MarcasAdicional.BarroNievo,Marca.Ford,"Michelin",Posicion.DelanteraDerecha),
                                 new Rueda(30, 50,Construccion.R,10,700,CodigoVelocidad.W,MarcasAdicional.BarroNievo,Marca.Ford,"Michelin",Posicion.DelanteraIzquierda),
                                 new Rueda(30, 50,Construccion.R,10,700,CodigoVelocidad.W,MarcasAdicional.BarroNievo,Marca.Ford,"Michelin",Posicion.TraseraDerecha),
                                 new Rueda(30, 50,Construccion.R,10,700,CodigoVelocidad.W,MarcasAdicional.BarroNievo,Marca.Ford,"Michelin",Posicion.TraseraIzquierda)});
        setTipo(n_strTipo);
        setTransmision(n_strTransmision);
        setMotor(n_strMotor);
    }

    public void CambioRuedas(Rueda []  rueda) throws IllegalArgumentException
    {
        boolean bRet = false;
        if(ruedas !=null && rueda.length){
            setRuedas(ruedas);
            bRet = true;
        }
        return bRet;
    }

}
