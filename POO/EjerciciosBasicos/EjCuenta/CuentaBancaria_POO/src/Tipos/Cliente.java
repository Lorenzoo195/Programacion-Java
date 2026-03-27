package Tipos;
import Exception.DatosInvalidos;
public class Cliente {
    private String nombre;
    private String apellidos;
    private String dni;

    public String getDni() {
        return dni;
    }
    private void setDni(String value) {
        this.dni = value;
    }
    public String getNombre() {
        return nombre;
    }

    private void setNombre(String value) {
        if(value.trim().isEmpty()){
            throw new IllegalArgumentException("EL nombre no puede estar vacio");
        }
        this.nombre = value;
    }

    public String getApellidos() {
        return apellidos;
    }

    private void setApellidos(String value) {
        if(value.trim().isEmpty()){
            throw new IllegalArgumentException("EL apellido no puede estar vacio");
        }
        this.apellidos = value;
    }

    public Cliente(String nombre, String apellidos, String dni) throws DatosInvalidos {
        if(nombre == null || nombre.trim().isEmpty()){
            throw new DatosInvalidos("El nombre no puede estar vacio. ");
        }
        if(apellidos == null || apellidos.trim().isEmpty()){
            throw new DatosInvalidos("Los apellidos no pueden estar vacios");
        }
        setNombre(nombre);
        setApellidos(apellidos);
        setDni(dni);
    }
}