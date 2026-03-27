import java.util.Scanner;

/*
Escribir un programa que lea una secuencia de datos numéricos de longitud
indefinida de manera que cuando el número sea el cero cesará la entrada de dicha
secuencia. El programa debe imprimirnos la media de todos, el mayor y el menor.
 */
public class b_ej9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int suma = 0;
        int media = 0;
        int cont = 0 ;
        int mayor = n;
        int menor = n;
        while (n>0){
            cont++;
            suma = suma + n;
            media = suma/cont;
            if(n>mayor){
                mayor = n;
            }
            if(n<menor){
                menor = n;
            }
            n = sc.nextInt();
        }
        System.out.println("mayor: "+mayor);
        System.out.println("menor: "+menor);
        System.out.println("media: "+media);
    }
}
