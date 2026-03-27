public class Mago extends Entidad{
    private int mana;

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
    public Mago(String _nombre, int _puntosDeVida, int mana) {
        super(_nombre, _puntosDeVida);
        setMana(mana);
    }


    @Override
    public void atacar(Entidad objeto) {
        System.out.println("¡"+ getnombre() + " lanza una bola de fuego calcinante!");
    }
}
