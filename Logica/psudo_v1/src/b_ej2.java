import java.util.Scanner;

/*
Calcular la suma de los cuadrados de los números pares comprendidos entre 1 y n
donde n es una variable que se leerá del exterior por el teclado.
 */
public class b_ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int suma = 0;
        for(int i = 1;i <= n;i++){
            if(i%2==0){
                suma = suma +(i*i);

            }
        }
        System.out.println(suma);
    }
}
