import java.util.Scanner;

/*
Diseña un algoritmo que convierta metros a otras
unidades de longitud. Primero el usuario debe introducir el número en metros. Después el
usuario introducirá los números 1, 2 o 3  para hacer la conversión de la siguiente manera: 
Si el usuario introduce el número 1: convierte el valor introducido a cm
Si el usuario introduce el número 2: convierte el valor introducido a km
Si el usuario introduce el número 3: convierte el valor introducido a mm
 */
public class c_ej6 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int metros = sc.nextInt();
        int conversion = sc.nextInt();
        if(conversion == 1){
            int cm = metros*100;
            System.out.println(cm);
        } else if (conversion == 2){
            int km = metros/1000;
            System.out.println(km);
        } else if(conversion == 3){
            int mm =metros*1000;
            System.out.println(mm);
        } else {
            System.out.println("nada");
        }
    }
}
