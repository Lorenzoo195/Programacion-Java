import Exceptions.BateriaBajaException;

public class Androide extends Tripulante implements Recargable {
    private int _nivelBateria;

    public Androide(String _nombre, int _nivelSalud) {
        super(_nombre, _nivelSalud);
        this._nivelBateria = 100;
    }


    @Override
    public int recargarEnergia(int cantidad) {
        this._nivelBateria += cantidad;
        if (this._nivelBateria > 100) this._nivelBateria = 100;
        return _nivelBateria;
    }

    @Override
    public void getNivelBateria(int nivel) {
        if(_nivelBateria < 0 || _nivelBateria >100){
            throw new IllegalArgumentException("La bateria no puede tener esos valores");
        }
    }


    @Override
    void trabajar() throws BateriaBajaException {
        if (_nivelBateria < 10) {
            throw new BateriaBajaException("¡Batería crítica! No puede trabajar.");
        }
        _nivelBateria -= 10;
        System.out.println(getnombre() + " está procesando datos complejos... bip bop");
    }

    @Override
    public String mostrarEstado() {
        String infoPadre = super.mostrarEstado();
        return infoPadre + " | Bateria de " + _nivelBateria + "%";
    }
}
