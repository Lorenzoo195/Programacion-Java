package Tipos;
import Exception.DatosInvalidos;

public class Empleado extends Persona{
    private Double sueldo;


    public Empleado(String nombre, String apellidos,
                    int edad, Double sueldo) throws DatosInvalidos {
        super(nombre, apellidos, edad);
        this.sueldo = sueldo;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }


   public void imprimirSueldo() {
        System.out.println("El sueldo es " + this.sueldo);
    }
    @Override
    public String toString() {
        return super.toString() + " | Sueldo: " + sueldo + "€";
    }

}
