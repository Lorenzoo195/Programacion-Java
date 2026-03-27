public class Main {
    public static void main(String[] args) {

        Figura [] arrFiguras = new Figura[5];

        arrFiguras[0] = new Rectangulo(10,5);
        arrFiguras[1] = new Circulo(3);
        arrFiguras[2] = new Triangulo(3,4);
        arrFiguras[3] = new Circulo(5.5);
        arrFiguras[4] = new Rectangulo(4,4);

        System.out.println("Figuras");

        for(int i = 0; i< arrFiguras.length;i++){
            System.out.println("Figura: " + arrFiguras[i].getClass().getSimpleName());

            System.out.printf("Area: %.2f%n", arrFiguras[i].getArea());
            System.out.printf("Perimetro: %.2f%n\n", arrFiguras[i].getPerimetro());
        }
    }
}