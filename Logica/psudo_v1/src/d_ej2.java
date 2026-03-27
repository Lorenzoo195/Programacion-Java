import java.util.Random;
import java.util.Scanner;

/*
Crear una matriz de 5 filas y n columnas (se pide al usuario). Rellenarlo con números aleatorios entre 0 y 10.
 */
public class d_ej2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int array [][]= new int[5][sc.nextInt()];
        Random rd = new Random();

        for(int i = 0; i< array.length;i++){

            for(int j=0;j< array.length;j++){
                array[i][j] =rd.nextInt(11);
            }
        }
        for(int i = 0; i< array.length;i++){
            System.out.println();
            for(int j=0;j< array.length;j++){
                System.out.printf("%2d ",array[i][j]);
            }
        }
    }
}
