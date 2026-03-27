import Constants.Colors;
import Constants.Enums.*;
import Types.Color;
import Types.Rueda;

import java.util.Arrays;


public class Coche {
    //Matricula, Constants.Enums.Marca,  Precio, Puertas, Color, Ruedas, Tipo, Transmision, Motor, Constants.Enums.Combustible

    private String m_strMatricula;
    private Marca m_eMarca;
    private Double m_dblPrecio;
    private Integer m_iPuertas;
    private Types.Color m_strColor;
    private Types.Rueda[] m_iRuedas = new Types.Rueda[4];
    private Chasis m_eTipo;
    private Transmission m_strTransmision;
    private String m_strMotor;

    public String getMatricula() {
        return m_strMatricula;
    }

    private void setMatricula(String value) {
        this.m_strMatricula = value;
    }

    public Marca getMarca() {
        return m_eMarca;
    }

    private void setMarca(Marca value) {
        this.m_eMarca = value;
    }

    public Double getPrecio() {
        return m_dblPrecio;
    }

    private void setPrecio(Double value) {
        this.m_dblPrecio = value;
    }

    public Integer getPuertas() {
        return m_iPuertas;
    }

    private void setPuertas(Integer value) {
        this.m_iPuertas = value;
    }

    public Color getColor() {
        return m_strColor;
    }

    private void setColor(Color value) {
        this.m_strColor = value;
    }

    public Rueda[] getRuedas() {
        return m_iRuedas;
    }

    private void setRuedas(Rueda[] value) {
        if (value == null || value.length != 4)
        {
//            throw new NumeroRuedasNoValidoException
            throw new IllegalArgumentException("El número de ruedas Proporcionado no es válido");
        }
        int sumaPosiciones =  getSumaPosicionesRuedas(value);

        // Si hay un duplicado (ej. dos Delanteras Derechas), la suma nunca será 15
        if (sumaPosiciones != 15) {
            throw new IllegalArgumentException("Las posiciones de las ruedas son incorrectas o están duplicadas.");
        }

        this.m_iRuedas = value;
    }



    public Chasis getTipo() {
        return m_eTipo;
    }

    private void setTipo(Chasis value) {
        this.m_eTipo = value;
    }

    public Transmission getTransmision() {
        return m_strTransmision;
    }

    private void setTransmision(Transmission value) {
        this.m_strTransmision = value;
    }

    public String getMotor() {
        return m_strMotor;
    }

    private void setMotor(String value) {
        this.m_strMotor = value;
    }

    public Coche(String p_strMatricula, Marca p_eMarca, Double p_dblPrecio, Integer p_iPuertas, Chasis p_eTipo, Transmission p_strTransmision, String p_strMotor) {
        setMatricula (p_strMatricula);
        setMarca (p_eMarca);
        setPrecio (p_dblPrecio);
        setPuertas (p_iPuertas);
        setTipo (p_eTipo);
        setTransmision( p_strTransmision);
        setMotor (p_strMotor);
        setColor( new Color());
        setRuedas(  new Rueda[] {new Rueda(225, 17, Construccion.Radial, 45, 91, CodigoVelocidad.Y, MarcasAdicionales.RunFlat, "Bridgestone", "RallyPlus", Posicion.DelanteraDerecha),
                                 new Rueda(225, 17, Construccion.Radial, 45, 91, CodigoVelocidad.Y, MarcasAdicionales.RunFlat, "Bridgestone", "RallyPlus", Posicion.DelanteraIzquierda),
                                 new Rueda(225, 17, Construccion.Radial, 45, 91, CodigoVelocidad.Y, MarcasAdicionales.RunFlat, "Bridgestone", "RallyPlus", Posicion.TraseraDerecha),
                                 new Rueda(225, 17, Construccion.Radial, 45, 91, CodigoVelocidad.Y, MarcasAdicionales.RunFlat, "Bridgestone", "RallyPlus", Posicion.TraseraIzquierda)});
    }

    public Coche(String p_strMatricula, Marca p_eMarca, Double p_dblPrecio, Integer p_iPuertas, Chasis p_eTipo, Transmission p_strTransmision, String p_strMotor, Types.Color p_obColor) {
        setMatricula (p_strMatricula);
        setMarca (p_eMarca);
        setPrecio (p_dblPrecio);
        setPuertas (p_iPuertas);
        setTipo (p_eTipo);
        setTransmision( p_strTransmision);
        setMotor (p_strMotor);
        setColor( p_obColor);
        setRuedas(  new Rueda[] {new Rueda(225, 17, Construccion.Radial, 45, 91, CodigoVelocidad.Y, MarcasAdicionales.RunFlat, "Bridgestone", "RallyPlus", Posicion.DelanteraDerecha),
                    new Rueda(225, 17, Construccion.Radial, 45, 91, CodigoVelocidad.Y, MarcasAdicionales.RunFlat, "Bridgestone", "RallyPlus", Posicion.DelanteraIzquierda),
                    new Rueda(225, 17, Construccion.Radial, 45, 91, CodigoVelocidad.Y, MarcasAdicionales.RunFlat, "Bridgestone", "RallyPlus", Posicion.TraseraDerecha),
                    new Rueda(225, 17, Construccion.Radial, 45, 91, CodigoVelocidad.Y, MarcasAdicionales.RunFlat, "Bridgestone", "RallyPlus", Posicion.TraseraIzquierda)});
    }

    public Coche(String p_strMatricula, Marca p_eMarca, Double p_dblPrecio, Integer p_iPuertas, Chasis p_eTipo, Transmission p_strTransmision, String p_strMotor, Rueda[] p_arrRuedas) {
        setMatricula (p_strMatricula);
        setMarca (p_eMarca);
        setPrecio (p_dblPrecio);
        setPuertas (p_iPuertas);
        setTipo (p_eTipo);
        setTransmision( p_strTransmision);
        setMotor (p_strMotor);
        setColor( new Color());
        setRuedas(  p_arrRuedas);
    }

    public Coche(String p_strMatricula, Marca p_eMarca, Double p_dblPrecio, Integer p_iPuertas, Chasis p_eTipo, Transmission p_strTransmision, String p_strMotor, Types.Color p_obColor, Rueda[] p_arrRuedas) {
        setMatricula (p_strMatricula);
        setMarca (p_eMarca);
        setPrecio (p_dblPrecio);
        setPuertas (p_iPuertas);
        setTipo (p_eTipo);
        setTransmision( p_strTransmision);
        setMotor (p_strMotor);
        setColor( p_obColor);
        setRuedas(  p_arrRuedas);
    }

    public boolean CambiarRuedas(Rueda[] ruedas) throws  IllegalArgumentException{
        boolean bRet = false;
        if (ruedas != null && ruedas.length == 4)
        {
            setRuedas(ruedas);
            bRet = true;
        }
        else if (ruedas != null && ruedas.length == 2)
        {
            int sumaPosiciones = getSumaPosicionesRuedas(ruedas);

            if (sumaPosiciones == 3 || sumaPosiciones == 12)
            {
                Rueda[] ruedaTemp = this.getRuedas();

                for (Rueda nueva : ruedas) {
                    for (int i = 0; i < ruedaTemp.length; i++) {
                        if (ruedaTemp[i].getPosicion() == nueva.getPosicion()) {
                            ruedaTemp[i] = nueva;
                        }
                    }
                }
                setRuedas(ruedaTemp);
            }
            else{
                throw new IllegalArgumentException("Las ruedas deben cambiarse por pares");
            }
        }
        else {
            throw new IllegalArgumentException("Las ruedas proporcionadas no son válidas");
        }
        return  bRet;
    }


    private Integer getSumaPosicionesRuedas(Rueda[] value) {
        Integer sumaPosiciones = 0;
        for (Rueda r : value) {
            if (r == null) throw new IllegalArgumentException("Rueda no valida.");

            // Usamos un switch o una serie de ifs para sumar valores únicos
            switch (r.getPosicion()) {
                case DelanteraDerecha:   sumaPosiciones += 1; break;
                case DelanteraIzquierda: sumaPosiciones += 2; break;
                case TraseraDerecha:     sumaPosiciones += 4; break;
                case TraseraIzquierda:   sumaPosiciones += 8; break;
            }
        }
        return sumaPosiciones;
    }

    @Override
    public String toString() {
        String strRet = super.toString();
        strRet +=
                 "Coche{" +
                "m_strMatricula='" + m_strMatricula + '\'' +
                ", m_eMarca=" + m_eMarca +
                ", m_dblPrecio=" + m_dblPrecio +
                ", m_iPuertas=" + m_iPuertas +
                ", m_strColor=" + m_strColor +
                ", m_iRuedas=" + Arrays.toString(m_iRuedas) +
                ", m_eTipo=" + m_eTipo +
                ", m_strTransmision=" + m_strTransmision +
                ", m_strMotor='" + m_strMotor + '\'' +
                '}';
        return strRet;
    }

}























