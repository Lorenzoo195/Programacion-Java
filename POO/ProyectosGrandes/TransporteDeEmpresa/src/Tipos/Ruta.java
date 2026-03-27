package Tipos;

import Exception.DatosInvalidos;
import java.util.ArrayList;

public class Ruta {
    private ArrayList<String> paradas;
    private ArrayList<Empleado> pasajeros;

    private String horaInicio;
    private String horaLlegada;
    private String paradaActual;

    public Ruta(String horaInicio, String horaLlegada) {
        this.horaInicio = horaInicio;
        this.horaLlegada = horaLlegada;
        this.paradas = new ArrayList<>();
        this.pasajeros = new ArrayList<>();
        this.paradaActual = "En base";
    }

    public void agregarParada(String nombreParada) {
        paradas.add(nombreParada);
    }
    public void subirEmpleado(Empleado empleado) {
        pasajeros.add(empleado);

    }
    public void bajarEmpleado (Empleado empleado) throws DatosInvalidos {
        if(pasajeros.contains(empleado)){
            pasajeros.remove(empleado);
        }else {
            throw new DatosInvalidos("El empleado no esta en el autobus");
        }
    }

    public String getParadaActual() {
        return paradaActual;
    }
    public void setParadaActual(String paradaActual) {
        this.paradaActual = paradaActual;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }
    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public String getHoraInicio() {
        return horaInicio;
    }
    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    @Override
    public String toString() {
        return "Ruta actual: " + paradaActual + " | Pasajeros: " + pasajeros.size();
    }
}
