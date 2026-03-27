import java.util.Scanner;

/*
un numero es primo o no
 */
public class a_ej7PrimoOno {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int divisores = 0;

        for(int i =1; i<n; i++) {
            if (n % i == 0) {
                divisores++;

            }

        }
            if (divisores > 2) {
                System.out.println("Primo");
            } else {
                System.out.println("No Primo");
            }

    }
}
