import java.util.Scanner;

/*
Hacer un programa que lea un número n y nos escriba en la pantalla mediante un
mensaje si es ó no primo (NOTA: Número primo es aquél que es divisible solo por
si mismo y por, la unidad)
 */
public class b_ej5 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int divisores = 0;

        for(int i =0; i<n; i++){
            if(n%i==0){
                divisores++;
            }
        }
        if(divisores==2 ){
            System.out.println("Primo");
        } else {
            System.out.println("No Primo");
        }
    }
}
