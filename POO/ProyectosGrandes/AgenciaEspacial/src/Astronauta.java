public class Astronauta extends Tripulante{
    private String _especialidad;

    public String getEspecialidad() {
        return _especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this._especialidad = especialidad;
    }

    public Astronauta(String _nombre, int _nivelSalud, String _especialidad) {
        super(_nombre, _nivelSalud);
        setEspecialidad(_especialidad);
    }


    @Override
    public void trabajar() {
        System.out.println("La especialidad es " + getEspecialidad());

        int saludActual = getnivelSalud();
        setnivelSalud(saludActual - 5);
    }

    @Override
    public String mostrarEstado() {
        String infoPadre = super.mostrarEstado();

        return infoPadre + " |  especialidad: "+ _especialidad;
    }
}
