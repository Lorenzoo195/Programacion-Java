import Enums.Colores;
import Enums.LetraConsumoEnergetico;

public class Electrodomestico {
    //atributos default
    protected static final double PRECIO_DEF = 100.00;
    protected static final Colores COLOR_DEF = Colores.BLANCO;
    protected static final LetraConsumoEnergetico CONSUMO_DEF = LetraConsumoEnergetico.F;
    protected static final double PESO_DEF = 5.00;

    //atributos
    protected double _precioBase;
    protected Colores _color;
    protected LetraConsumoEnergetico _consumoEnergetico;
    protected double _peso;


    //geters y seters

    public double getprecioBase() {
        return _precioBase;
    }

    public void setprecioBase(double _precioBase) {
        this._precioBase = _precioBase;
    }

    public Colores getcolor() {
        return _color;
    }

    public void setcolor(Colores _color) {
        this._color = _color;
    }

    public LetraConsumoEnergetico getconsumoEnergetico() {
        return _consumoEnergetico;
    }

    public void setconsumoEnergetico(LetraConsumoEnergetico _consumoEnergetico) {
        this._consumoEnergetico = _consumoEnergetico;
    }

    public double getpeso() {
        return _peso;
    }

    public void setpeso(double _peso) {
        this._peso = _peso;
    }

    private void comprobarColor(String color) {

        this._color = Colores.BLANCO;
        for (Colores c : Colores.values()) {

            if (c.name().equalsIgnoreCase(color)) {
                this._color = c;
            }
        }
    }
    private void comprobarConsumoEnergetico(char letra) {

        if (letra >= 'A' && letra <= 'F') {
            this._consumoEnergetico = LetraConsumoEnergetico.valueOf(String.valueOf(letra));
        } else {
            this._consumoEnergetico = LetraConsumoEnergetico.F;
        }
    }

    public double precioFinal(){
        double sumaPrecio= 0;
        switch (this._consumoEnergetico){
            case A:
                sumaPrecio+= 100;
                break;
            case B:
                sumaPrecio+= 80;
                break;
            case C:
                sumaPrecio+= 60;
                break;
            case D:
                sumaPrecio+= 50;
                break;
            case E:
                sumaPrecio+= 30;
                break;
            case F:
                sumaPrecio+= 10;
                break;
        }
        if (this._peso >= 0 && this._peso <= 19) {
            sumaPrecio += 30;
        }
        else if (this._peso >= 20 && this._peso <= 49) {
            sumaPrecio += 50;
        }
        else if (this._peso >= 50 && this._peso <= 79) {
            sumaPrecio += 80;
        }
        else if (this._peso >= 80) {
            sumaPrecio += 100;
        }
        return this._precioBase +sumaPrecio;
    }

    public Electrodomestico(double _precioBase, String _color,
                            char _consumoEnergetico, double _peso) {
        setprecioBase(_precioBase);
        comprobarColor(_color);
        comprobarConsumoEnergetico(_consumoEnergetico);
        setpeso(_peso);
    }

    public Electrodomestico() {
        setprecioBase(PRECIO_DEF);
        setcolor(COLOR_DEF);
        setconsumoEnergetico(CONSUMO_DEF);
        setpeso(PESO_DEF);

    }
    public Electrodomestico(double _precioBase,  double _peso) {
        setprecioBase(_precioBase);
        setpeso(_peso);
        setconsumoEnergetico(CONSUMO_DEF);
        setcolor(COLOR_DEF);
    }

    @Override
    public String toString() {
        return "Electrodomestico: " +
                " precio base " + _precioBase + "€" +
                ", color " + _color + '\'' +
                ", consumo energetico" + _consumoEnergetico +
                ", peso " + _peso + "kg." ;
    }
}
