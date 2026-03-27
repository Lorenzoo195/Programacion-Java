class Diputado extends Legislador{
    public Diputado(String _nombre, int _edad, String provinciaQueRepresenta) {
        super(_nombre, _edad, provinciaQueRepresenta);
    }
    public String getCamaraEnQueTrabaja(){
        return "Congreso de los Diputados";
    }
}
