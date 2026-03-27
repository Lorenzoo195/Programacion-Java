import Exception.SinEnergiaMagica;
public class Magos extends UnidadCombate implements Magia{
    private int _energiaMagica;

    public int getEnergiaMagica() {
        return _energiaMagica;
    }

    public void setEnergiaMagica(int energiaMagica) {
        this._energiaMagica = energiaMagica;
    }

    public Magos(String _nombre, int _maxVidas) {
        super(_nombre, _maxVidas);
        setEnergiaMagica(100);
    }

    @Override
    public void atacar() {
        System.out.println(getnombre() + " golpea con su bastón causando 5 puntos de daño.");
    }

    @Override
    public void lanzarHechizo() throws SinEnergiaMagica {
        if (_energiaMagica < 10) {
            throw new SinEnergiaMagica("¡No hay maná suficiente para lanzar el hechizo!");
        } else {
        _energiaMagica = _energiaMagica - 10;
        System.out.println(getnombre() + " lanza una bola de fuego (Energia magica restante: " + _energiaMagica + ")");
    }}

    @Override
    public void meditar() {
        _energiaMagica += 20;
        if(_energiaMagica > 100){
            _energiaMagica = 100;
        }
        System.out.println(getnombre()+ " media y recupera energia. (Energia magica actual: " + _energiaMagica);
    }

    @Override
    public String mostrarEstado() {
        String infoPadre = super.mostrarEstado();
        return "Mago: "+infoPadre + " | Energia Magica: " + _energiaMagica ;
    }
}
