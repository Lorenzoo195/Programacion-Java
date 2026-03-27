public class MaleteroDelFary <T>{

    private T alijoSecreto;
    private boolean hueleACerrado;

    public MaleteroDelFary() {
        this.alijoSecreto = null;
        this.hueleACerrado = true;
    }

    public void esconder(T item) {
        if (this.alijoSecreto == null) {
            this.alijoSecreto = item;
            System.out.println("Has escondido el alijo en el maletero del Fary.");
        } else {
            System.out.println("¡El maletero ya está lleno! Tienes que vaciarlo primero.");
        }
    }

    public T sacarDelMaletero() {
        T botinExtraido = null;

        if (this.alijoSecreto != null) {
            botinExtraido = this.alijoSecreto;
            this.alijoSecreto = null;
            this.hueleACerrado = false;
            System.out.println("Has sacado el alijo.");
        } else {
            System.out.println("El maletero está vacío.");
        }

        return botinExtraido;
    }

}
