import Enums.Especialidad;

import java.io.Serializable;

public class Entrenador extends Persona implements Serializable {
    private Especialidad especialidad;
    private int sueldoBase;

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public int getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(int sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public Entrenador(int DNI, String nombre, int edad) {
        super(DNI, nombre, edad);
        setEspecialidad(especialidad);
        setSueldoBase(sueldoBase);
    }

    @Override
    public String toString() {
        return "Entrenador   " +
                " especialidad " + especialidad +
                "  sueldoBase " + sueldoBase ;
    }

    @Override
    public void mostrarRutina() {
        System.out.println(Especialidad.Musculacion);
    }
}
