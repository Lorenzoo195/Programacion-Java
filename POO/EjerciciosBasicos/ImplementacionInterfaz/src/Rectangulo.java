public class Rectangulo implements Figura {
    private double base;
    private double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Rectangulo(double base, double altura) {
        setBase(base);
        setAltura(altura);
    }

    @Override
    public double getArea() {
        return base*altura;
    }

    @Override
    public double getPerimetro() {
        return (2*base)+ (2*altura);
    }
}
