public class Guerrero extends Entidad{
    private int fuerza;

    public Guerrero(String _nombre, int _puntosDeVida, int fuerza) {
        super(_nombre, _puntosDeVida);
        setFuerza(fuerza);
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    @Override
    public void atacar(Entidad objeto) {
        System.out.println("¡"+getnombre() + " asesta un tajo brutal por " + getFuerza() + " de daño!");
    }
}
