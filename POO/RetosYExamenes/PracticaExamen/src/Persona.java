import java.io.Serializable;

public abstract class Persona implements Serializable {
    private int DNI;
    private String nombre;
    private int edad;

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Persona(int DNI, String nombre, int edad) {
        setDNI(DNI);
        setNombre(nombre);
        setEdad(edad);
    }
    public boolean equals(Object o){
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return DNI == persona.DNI;
    }

    public int hashCode(){
        return Integer.hashCode(DNI);
    }

    public abstract void  mostrarRutina();
}
