abstract class Legislador extends Persona{
    private String provinciaQueRepresenta;

    public Legislador (String _nombre, int _edad, String provinciaQueRepresenta){
        super(_edad, _nombre);
        this.provinciaQueRepresenta = provinciaQueRepresenta;
    }

    public String getProvinciaQueRepresenta() {
        return provinciaQueRepresenta;
    }

    public void setProvinciaQueRepresenta(String provinciaQueRepresenta) {
        this.provinciaQueRepresenta = provinciaQueRepresenta;
    }
    public abstract String getCamaraEnQueTrabaja();
}
