import java.util.Scanner;

/*
Hacer un programa que lea una serie de números por teclado de manera que cuando
el número leído sea el cero ya no se introduzcan más, el programa debe calcular y
escribir la suma de los números de la serie que son múltiplos de 5 y cuántos se han
introducido en total
 */
public class b_ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int suma =0;
        int cont =0;
        while(n!=0){
            cont++;
            if (n % 5 == 0) {
                suma = suma+n;
            }
            n =sc.nextInt();
        }
        System.out.println(suma);
        System.out.println(cont);

    }
}
