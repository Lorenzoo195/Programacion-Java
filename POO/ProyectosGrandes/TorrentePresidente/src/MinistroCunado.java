public class MinistroCunado extends CargoPublico{
    private double presupuestoDespilfarrado;

    public MinistroCunado(String nombre, int nivelDeCaspa,
                          double presupuestoDespilfarrado) {
        super(nombre, nivelDeCaspa);
        this.presupuestoDespilfarrado = presupuestoDespilfarrado;
    }

    @Override
    public void trabajar() {
        System.out.println("¡" + getNombre() + " se gasta " + presupuestoDespilfarrado +
                            " euros en gambas y le echa la culpa a la oposición!");
    }
}
