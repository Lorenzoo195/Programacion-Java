import java.io.Serializable;

public class Persona implements Serializable {
    double altura;
    String nombre;
    int edad;
    String direccionCompleta;

    public String getDireccionCompleta() {
        return direccionCompleta;
    }

    public void setDireccionCompleta(String direccionCompleta) {
        this.direccionCompleta = direccionCompleta;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
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



    @Override
    public String toString() {
        return "Persona " +
                " altura " + altura +
                ", nombre " + nombre + '\'' +
                ", edad " + edad;
    }

    public Persona(double altura, String nombre, int edad, String direccionCompleta) {
        setAltura(altura);
        setNombre(nombre);
        setEdad(edad);
        setDireccionCompleta(direccionCompleta);
    }
}
