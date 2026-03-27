import java.util.Scanner;

/*
Hacer un programa que vaya leyendo números por el teclado hasta que lea el cero
que indicará fin de entrada de datos, el programa debe calcular y escribir la suma de
los introducidos en lugar par y los introducidos en lugar impar, es decir los
introducidos primero, tercero, quinto … etc. y la suma de los introducidos el
segundo, cuarto, sexto ... etc.
 */
public class b_ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int sumaPosPar = 0;
        int sumaPosImpar = 0;
        int cont = 0;
        while(n!=0) {
            cont++;
            if (cont % 2 == 0) {
                sumaPosPar = sumaPosPar + n;
            } else {
                sumaPosImpar = sumaPosImpar + n;
            }

            n = sc.nextInt();
        }
        System.out.println(sumaPosPar);
        System.out.println(sumaPosImpar);

    }
}
