public class AsesorPelota extends CargoPublico {
    private int nivelAdulacion;

    public AsesorPelota(String nombre, int nivelDeCaspa, int nivelAdulacion) {
        super(nombre, nivelDeCaspa);
        this.nivelAdulacion = nivelAdulacion;
    }

    @Override
    public void trabajar() {
        System.out.println("¡" + getNombre() + " le dice a Torrente que está muy guapo hoy y no hace nada más!");
    }
}