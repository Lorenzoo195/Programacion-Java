import java.util.Scanner;

/*
Dado un numero n que filtraremos a que sea positivo, escribir un programa que nos
diga cuál es el numero primo más cercano a él por debajo.
 */
public class b_ej10PrimoPorDebajo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int primo = 0;
        boolean esPrimoMasCercanoPorAbajo = false;

        for (int i = n - 1; i >= 2 && !esPrimoMasCercanoPorAbajo; i--) {
            int divisores = 0;
            for (int q = 1; q <= i; q++) {
                if (i % q == 0) {
                    divisores++;
                }

            }
            if (divisores == 2) {
                esPrimoMasCercanoPorAbajo = true;
                System.out.println("el primo por abajo es "+ i );

            }
        }
    }
}
