package Tipos;
import Exception.DatosInvalidos;
public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws DatosInvalidos {
        if(nombre.trim().isEmpty()){
            throw new DatosInvalidos( "Datos invalidos")  ;
        }
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) throws DatosInvalidos {
        if(apellidos.trim().isEmpty()){
            throw new DatosInvalidos("Datos invalidos");
        }
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) throws DatosInvalidos {
        if(edad < 0 ){
            throw new DatosInvalidos("Datos invalidos");
        }
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public Persona(String nombre, String apellidos, int edad) throws DatosInvalidos {

        setNombre(nombre);
        setApellidos(apellidos);
        setEdad(edad);
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " " + apellidos + " | Edad: " + edad + " años";
    }
}
