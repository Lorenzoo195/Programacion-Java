public class Persona  {
    private String nombre;
    private String apellido;
    private String DNI;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Persona(String nombre, String apellido, String DNI) {
        setNombre(nombre);
        setApellido(apellido);
        setDNI(DNI);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", DNI='" + DNI + '\'' +
                '}';
    }
}
/* private Estado tipo;
//
//    enum Estado {normal, abuelo, embaraza};
//
//    public Estado getTipo() {
//        return tipo;
//    }
//
//    public void setTipo(Estado tipo) {
//        this.tipo = tipo;
//    }
//
//    public String getNombre() {
//        return nombre;
//    }
//
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }
//
//    public Persona(String nombre, Estado tipo) {
//        setNombre(nombre);
//        setTipo(tipo);
//    }
//
//    @Override
//    public int compareTo(Persona o) {
//        if(this.getTipo().ordinal() < o.getTipo().ordinal()){
//            return 1;
//        } else if (this.getTipo().ordinal() > o.getTipo().ordinal()) {
//            return -1;
//        } else {
//            return 0;
//        }
//    }
//
//    @Override
//    public String toString() {
//        return "Persona " +
//                " nombre " + nombre +
//                ", tipo " + tipo;
//    }*/