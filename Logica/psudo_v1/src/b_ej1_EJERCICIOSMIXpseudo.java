import java.util.Scanner;

/*
Escribir un programa que calcule e imprima la SUMA de los números impares
comprendidos entre a y b que deben leerse por teclado y filtrarse para que a&lt;=b
 */
public class b_ej1_EJERCICIOSMIXpseudo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        int suma=0;
        int cont;
        cont = a;
        while(cont <= b) {

            for (int i = a; i <= b ; i++) {
                cont++;
                if (i % 2 == 0) {
                    suma = suma + i;
                }
            }
            System.out.println(suma);
        }
    }
}
