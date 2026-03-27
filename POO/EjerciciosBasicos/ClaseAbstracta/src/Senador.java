class Senador extends Legislador{
    public Senador(String _nombre, int _edad, String provinciaQueRepresenta) {
        super(_nombre, _edad, provinciaQueRepresenta);
    }

    @Override
    public String getCamaraEnQueTrabaja() {
        return "Senado";
    }
}
