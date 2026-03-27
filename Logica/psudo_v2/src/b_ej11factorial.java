import java.util.Scanner;

/*
Se define el factorial de un número n como:
n*(n-1)*(n-2)*.......*3*2*1. Hacer un programa que lea un número n
filtrando que sea mayor que cero y calcule su factorial
 */
public class b_ej11factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int factorial = 1;
        for (int i= 0; i<n;i++){
            factorial = factorial*(n-i);
        }
        System.out.println(factorial);

    }
}
