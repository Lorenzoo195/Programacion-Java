import java.util.Scanner;

/*
Idear un programa que solicite al usuario un número comprendido entre 1 y 7, correspondiente a un día de la semana.
Se debe mostrar el nombre del día de la semana al que corresponde.
Por ejemplo, el número 1 corresponde a “Lunes” y el 6 a “Sábado”. Emplea una tabla para los textos de los días de la semana.
 */
public class ej4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String strDias [] = {"Lunes","Martes","Miercoles"};
        int iDias = sc.nextInt();
        if(iDias < 1 || iDias > strDias.length){
            System.out.println("no valido");
        } else {
            System.out.println(strDias[iDias - 1]);
        }
    }
}
