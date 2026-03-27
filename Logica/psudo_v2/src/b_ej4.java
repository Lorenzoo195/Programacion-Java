import java.util.Scanner;

/*
Escribir un programa que una vez que lea un número n por teclado calcule y escriba
sus divisores por la pantalla
 */
public class b_ej4 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i <=n ;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }

    }
}
