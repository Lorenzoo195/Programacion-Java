import java.util.Scanner;

/*
Realiza un programa para decidir si un número solicitado al usuario tiene 2 cifras o no.
En este caso el resultado debe ser un solo mensaje diciendo si las tiene o no.
 */
public class a_ej4 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            if(a>=100 || a<=-100){
                System.out.println("el valor tiene mas de dos cifras");
            } else System.out.println("el valor no tiene mas de dos cifras");
    }
}
