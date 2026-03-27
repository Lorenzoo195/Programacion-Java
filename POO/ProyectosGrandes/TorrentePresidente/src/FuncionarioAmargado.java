public class FuncionarioAmargado extends CargoPublico {

    public FuncionarioAmargado(String nombre, int nivelDeCaspa) {
        super(nombre, nivelDeCaspa);
    }

    @Override
    public void trabajar() {
        System.out.println(getNombre() + " suspira: ¡" + getNombre() + " se va a tomar el sexto café de la mañana!");
    }
}