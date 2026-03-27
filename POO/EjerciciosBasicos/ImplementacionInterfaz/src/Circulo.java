public class Circulo implements Figura{
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Circulo(double radio) {
        setRadio(radio);
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}
