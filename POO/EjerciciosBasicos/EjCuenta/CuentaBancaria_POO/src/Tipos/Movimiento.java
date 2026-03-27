package Tipos;
import Enums.TipoMovimiento;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Movimiento {
    private Date fecha;
    private Double cantidadMovimiento;
    private Double saldoActual;
    private TipoMovimiento tipo;

    public TipoMovimiento getTipo() {
        return tipo;
    }

    private void setTipo(TipoMovimiento value) {
        this.tipo = value;
    }

    public Date getFecha() {
        return fecha;
    }

    private void setFecha(Date value) {
        this.fecha = value;
    }

    public Double getCantidadMovimiento() {
        return cantidadMovimiento;
    }

    private void setCantidadMovimiento(Double value) {
        this.cantidadMovimiento = value;
    }

    public Double getSaldoActual() {
        return saldoActual;
    }

    private void setSaldoActual(Double value) {
        this.saldoActual = value;
    }




    public Movimiento(Double cantidadMovimiento, TipoMovimiento tipo,
                      Double saldoActual ) {
        setFecha(new Date());
        setTipo(tipo);
        setCantidadMovimiento(cantidadMovimiento);
        setSaldoActual(saldoActual);

    }
    public String toString(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String formattedDate = sdf.format(this.fecha);

        return formattedDate + " | " + this.tipo.getEtiqueta() + " | " + this.tipo.getSigno() + this.cantidadMovimiento
                + "€ | " + this.saldoActual + "€ | ";
    }
}
