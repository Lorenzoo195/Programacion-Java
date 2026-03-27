import java.util.Random;
import java.util.Scanner;

/*
Diseña un programa que lea desde teclado la dimensión de un vector, lo llene e introduzca un
valor a buscar. El algoritmo debe devolver la primera posición y la última en la que aparece el valor
en el vector, en el caso de que esté más de una vez. Si sólo aparece una vez debe devolver la
posición dos veces. Y si no está debe aparece un 0 dos veces también.
 */
public class ej9_0_OK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Dime dimension");
        int iDimension = sc.nextInt();
        int arrNum [] = new int[iDimension];
        int iValor = rd.nextInt(10);
        int iContValor = 0;

        for(int i = 0;i<arrNum.length;i++){
            arrNum[i] = rd.nextInt(10);
        }
        for(int i = 0; i<arrNum.length;i++){
            if(iValor == arrNum[i]){
                iContValor++;
            }
        }
        if(iContValor>=1){
            boolean bEncontrado = false;
            for(int i = 0;i<arrNum.length && !bEncontrado;i++) {
                if(iValor== arrNum[i]){
                    System.out.println(i);
                    bEncontrado = true;
                }

            }
            bEncontrado = false;
            for(int i = arrNum.length-1;i>=0 && !bEncontrado;i--){
                if(iValor == arrNum[i]) {
                    System.out.println(i);
                    bEncontrado = true;
                }
            }
        } else {
            System.out.println(iContValor + "0");
        }

    }
}
