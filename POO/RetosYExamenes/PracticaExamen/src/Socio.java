import Enums.Membresia;

import java.io.Serializable;

public class Socio extends Persona implements Serializable {
    private int pesoActual;
    private Membresia membresia;

    public int getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(int pesoActual) {
        this.pesoActual = pesoActual;
    }

    public Membresia getMembresia() {
        return membresia;
    }

    public void setMembresia(Membresia membresia) {
        this.membresia = membresia;
    }

    public Socio(int DNI, String nombre, int edad) {
        super(DNI, nombre, edad);
        setMembresia(membresia);
        setPesoActual(pesoActual);
    }

    @Override
    public String toString() {
        return "Socio " +
                " pesoActual " + pesoActual +
                " membresia " + membresia;
    }

    @Override
    public void mostrarRutina() {
        System.out.println("HOY BICEPS MAQUINA");
    }
}
