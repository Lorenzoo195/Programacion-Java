import Exception.Denominador0Exception;
public class Castillos {
    public static void main(String[] args) {
        try {

            Racional r1 = new Racional(2, 6);
            Racional r2 = new Racional(1, 3);
            Racional r3 = new Racional(6, 4);

            Racional sumaTriple = r1.sum(r2, r3);
            System.out.println("Suma de 3 racionales (2/6 + 1/3 + 6/4): " + sumaTriple);

            Racional r4 = new Racional(1, 3);
            Racional sumaConEntero = r4.sum(5);
            System.out.println("Suma de entero y racional (5 + 1/3): " + sumaConEntero);

            Racional multiConEntero = r4.mul(2);
            System.out.println("Multiplicación por entero (1/3 * 2): " + multiConEntero);

           /* Racional castillo;
            castillo = new Racional(3,5);
            castillo = castillo.res(new Racional(1,4));
            castillo = castillo.sum(new Racional(1,10));
            castillo = castillo.mul(new Racional(3,2));
            castillo = castillo.res(new Racional(1,5));
            Racional divisor;
            divisor = new Racional(2,6);
            divisor = divisor.sum( new Racional(1,3));
            divisor = divisor.res((new Racional(6,4)));
            divisor = divisor.div(new Racional(2,3));
            divisor = divisor.sum(new Racional(1,6));
            castillo = castillo.div(divisor);
            System.out.println(castillo);

            Racional r1 = new Racional(42);
            System.out.println(r1);*/


            /*Racional r1 = new Racional(4,2);
            Racional r2 = new Racional(4,5);
            Racional r3 = r1.sum(r2);
            Racional r4 = r1.res(r2);
            Racional r5 = r1.mul(r2);
            Racional r6 = r1.div(r2);

            System.out.println(r1);
            System.out.println(r2);
            System.out.println("La suma es: "+r3.toString());
            System.out.println("La resta es: "+r4.toString());
            System.out.println("La multiplicacion es: "+ r5.toString());
            System.out.println("La division es: "+ r6.toString());*/
        } catch (Denominador0Exception e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e){
            System.out.println("Error" + e.getMessage());
        }

    }
}