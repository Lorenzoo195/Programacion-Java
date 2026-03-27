import java.util.Scanner;

/*
Dados dos números p y q que leeremos por teclado y que deben ser positivos, hacer
un programa que nos diga cual de los dos tiene más divisores, con un mensaje que
diga “p tiene mas divisores que q” ó viceversa.
*/
public class b_ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        int contp =0;
        int contq = 0;

        if (p > 0 && q > 0) {
            for (int i = 1; i < p; i++) {
                if (p % i == 0) {
                    contp++;
                }
            }
            for (int i = 1; i < q; i++) {
                if (q % i == 0) {
                    contq++;
                }
            }
            if (contp > contq) {
                System.out.println("p tiene mas divisores que q");
            } else {
                System.out.println("q tiene mas divisores que p");
            }
        } else{
            System.out.println("vuelve a empezar");
        }
    }
}


