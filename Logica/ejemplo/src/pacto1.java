import java.util.Scanner;

/*Ejercicio 4.- Calcular 2 elevado a n
Programa Java recursivo para calcular 2 elevado a n siendo n un número entero mayor o igual que 0.
La solución recursiva se basa en lo siguiente:
Si n = 0 entonces 2^0 = 1
Si n > 0. Podemos calcular 2^n  como  2 * 2^n-1
Por ejemplo: 2^5 = 2 * 2^4.
*/
public class pacto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int resultado = NumPotencia(n);
        System.out.println(resultado);
    }
    public static int NumPotencia (int param){
        int valor;
        if(param==0){
            valor = 1;
        }else{
            int potenciaAnterior = NumPotencia(param-1);
            valor= 2*potenciaAnterior;
        }
        return valor;
    }

}
