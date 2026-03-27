import java.util.Random;
import java.util.Scanner;
/*
Leer y almacenar n números enteros en una tabla, a partir de la que se construirán otras dos
tablas con los elementos con valores pares e impares.
 */
public class ej8_0_OK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos numeros vas a introducir");
        int iCantiad = sc.nextInt();
        int arrNum [] = new int[iCantiad];
        int arrPar [] = new int[iCantiad];
        int arrImpar [] = new int[iCantiad];
        System.out.println("Empieza a darme numeros");
        int iContador = 0;
        int iContPares = 0;
        int iContImpar = 0;
        while(iContador<=iCantiad-1){
            for(int i = 0; i<arrNum.length;i++){
                int iNum = genRandom(100,1);
                arrNum[i] = iNum;
                if(iNum%2 == 0){
                    arrPar[iContPares] += iNum;
                    iContPares++;
                } else {
                    arrImpar[iContImpar]  = iNum;
                    iContImpar++;
                }
                iContador++;
            }
        }
        mostrarArrParOImpar(arrPar);
        System.out.println();
        mostrarArrParOImpar(arrImpar);
    }
    public static int genRandom(int max, int min){
        return new Random().nextInt(max-min+1)+min;
    }
    public static void mostrarArrParOImpar(int array []){
        for(int i =0;i<array.length;i++){
            if (array[i]>0){
                System.out.printf("%2d ", array[i]);
            }
        }
    }
}
