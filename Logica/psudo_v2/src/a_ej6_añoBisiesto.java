import java.util.Scanner;

/*
Realiza un programa para determinar si un año introducido por el usuario es bisiesto.
 */
public class a_ej6_añoBisiesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anio = sc.nextInt();
        if(anio %4==0){
            if(anio %100==0){       //if(año%400==0 || (año%4==0 && año%100 !=0){ sout(esbisiesto)}
                if(anio %400==0){
                    System.out.println("Es año bisiesto");
                }else {
                    System.out.println("no es bisiesto");
                }
            } else {
                System.out.println("es bisiesto");
            }
        } else {
            System.out.println("no es bisiesto");
        }
    }
}
