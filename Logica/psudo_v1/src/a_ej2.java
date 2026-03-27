import java.util.Scanner;

/*
Realiza un programa para determinar la velocidad de un objeto dependiendo de la distancia y el
tiempo dados respetando la fórmula V=d/t.
En este caso el resultado debe ser un mensaje con el resultado o un mensaje de error caso de
que se haya introducido un 0 o un número
negativo como valor para el tiempo.
 */
public class a_ej2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int V = 0;
        int d = sc.nextInt();
        int t = sc.nextInt();
        if( d>0 && t>0){
            V = d/t;
            System.out.println("La velociad es: "+ V);
        } else {
            System.out.println("error");
            }
    }
}
