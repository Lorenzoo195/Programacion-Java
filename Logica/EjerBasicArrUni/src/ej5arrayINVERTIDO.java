import java.util.Random;
import java.util.Scanner;

/*
Dado un array de números de 5 posiciones con los siguiente valores {1,2,3,4,5},
guardar los valores de este array en otro array distinto pero con los valores invertidos, es decir,
que el segundo array debera tener los valores {5,4,3,2,1}.
 */
public class ej5arrayINVERTIDO {
    public static void main(String[] args){
       /* int arrPos [] = {1,2,3,4,5};
        int arrInv [] = new int[5];
        int indice = 0;*/
        /*for(int i = arrPos.length-1; i >=0 ; i--){
            arrInv[indice]=arrPos[i];
            indice++;
        }*/
        Scanner sc = new Scanner(System.in);
        int iDim = sc.nextInt();
        int array1 [] = new int[iDim];
        for(int i = 0;i < array1.length;i++){
            array1[i]= genAletorio(50,1);
        }

        int arrayInvertido [] = invertido(array1,iDim); //funcion invertir array

        for(int i = 0;i<arrayInvertido.length;i++){
            System.out.printf("%2d ", arrayInvertido[i]);
        }
    }
    public static int [] invertido (int [] array, int n){
        int arrI [] = new int[n];
        int indice = 0;
        for(int i = array.length-1;i>=0; i--){
            arrI[indice] = array [i];
            indice++;
        }
        return arrI;
    }
    public static int genAletorio(int max, int min){
        return new Random().nextInt(max-min+1)+min;
    }
}
