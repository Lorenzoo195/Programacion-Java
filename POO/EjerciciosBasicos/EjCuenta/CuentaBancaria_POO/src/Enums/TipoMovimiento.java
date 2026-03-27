package Enums;

public enum TipoMovimiento {
    INGRESO("Ingreso de efectivo", '+'),
    RETIRADA("Retirada de efectivo", '-');


    private final String etiqueta;
    private final char signo;

    TipoMovimiento(String etiqueta, char signo) {
        this.etiqueta = etiqueta;
        this.signo = signo;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public char getSigno() {
        return signo;
    }
}