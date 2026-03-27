import java.util.Scanner;

/*
Un número se dice que es perfecto cuando la suma de sus divisores excluido él es
igual a dicho número. Hacer un programa que lea un número y nos diga si es ó no
perfecto
 */
public class b_ej12numPerfecto {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumaDiv = 0;
        for(int i=1;i< n;i++){
            if(n%i==0){
                sumaDiv = sumaDiv + i;
            }
        }
        if(n==sumaDiv){
            System.out.println("El numero es perfecto");
        } else {
            System.out.println("No es perfecto");
        }
    }
}
