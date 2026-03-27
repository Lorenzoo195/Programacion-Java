package Tipos;

import java.text.SimpleDateFormat;

public class IBAN {
    private String codigoPais;
    private String numeroPais;
    private String codigoEntidad;
    private String codigoOficina;
    private String numeroCuenta;

    private enum eTipoCadena {letra, numero};

    public IBAN(String codigoPais, String numeroPais, String codigoEntidad,
                String codigoOficina, String numeroCuenta) {
        setCodigoPais(codigoPais);
        setNumeroPais(numeroPais);
        setCodigoEntidad(codigoEntidad);
        setCodigoOficina(codigoOficina);
        setNumeroCuenta(numeroCuenta);
    }

    public String getCodigoPais() {
        return codigoPais;
    }

    private void setCodigoPais(String value) {
        try
        {
            validarCadendaCaracteres(value,2, eTipoCadena.letra);
            codigoPais = value;
        } catch (IllegalArgumentException e) {

            throw (e);
        }
        this.codigoPais = value.toUpperCase();

    }

    public String getNumeroPais() {
        return numeroPais;
    }

    private void setNumeroPais(String value) {
        try
        {
            validarCadendaCaracteres(value,2, eTipoCadena.numero);
            numeroPais = value;
        } catch (IllegalArgumentException e) {

            throw (e);
        }
        this.numeroPais = value;
    }

    public String getCodigoEntidad() {
        return codigoEntidad;
    }

    private void validarCadendaCaracteres(String value, int length, eTipoCadena tipo) throws IllegalArgumentException
    {
        if (value == null) {
            throw new IllegalArgumentException("El VAlor  no puede ser nulo.");
        }
        if (value.length() != length) {
            throw new IllegalArgumentException("El valor debe tener exactamente "+ length + " dígitos.");
        }
        for (char c : value.toCharArray()) {
            switch (tipo)
            {
                case letra:  {
                    if (!Character.isLetter(c)) {
                        throw new IllegalArgumentException("El valor solo puede contener letras.");
                    }
                    ;
                    break;
                }
                case numero:
                {
                    if (!Character.isDigit(c)) {
                        throw new IllegalArgumentException("El valor solo puede contener números.");
                    }
                };
                break;
            }

        }

    }


    private void setCodigoEntidad(String value) {
        if (value == null) {
            throw new IllegalArgumentException("El código de entidad no puede ser nulo.");
        }
        if (value.length() != 4) {
            throw new IllegalArgumentException("El código de entidad debe tener exactamente 4 dígitos.");
        }
        for (char c : value.toCharArray()) {
            if (!Character.isDigit(c)) {
                throw new IllegalArgumentException("El código de entidad solo puede contener números.");
            }
        }
        this.codigoEntidad = value;
    }

    public String getCodigoOficina() {
        return codigoOficina;
    }

    private void setCodigoOficina(String value) {
        if (value == null) {
            throw new IllegalArgumentException("El código de oficina no puede ser nulo.");
        }
        if (value.length() != 4) {
            throw new IllegalArgumentException("El código de oficina debe tener exactamente 4 dígitos.");
        }
        for (char c : value.toCharArray()) {
            if (!Character.isDigit(c)) {
                throw new IllegalArgumentException("El código de oficina solo puede contener números.");
            }
        }
        this.codigoOficina = value;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    private void setNumeroCuenta(String value) {
        if (value == null) {
            throw new IllegalArgumentException("El número de cuenta no puede ser nulo.");
        }
        if (value.length() != 10) {
            throw new IllegalArgumentException("El número de cuenta debe tener exactamente 10 dígitos.");
        }
        for (char c : value.toCharArray()) {
            if (!Character.isDigit(c)) {
                throw new IllegalArgumentException("El número de cuenta solo puede contener números.");
            }
        }
        this.numeroCuenta = value;
    }

    @Override
    public String toString() {
        return codigoPais + numeroPais + codigoEntidad + codigoOficina+ numeroCuenta;
    }
}