
import java.util.Random;
import java.util.Scanner;

/*
a)Generar una matriz de 3×3 con números aleatorios sin repetirse.
b) Dada la matriz anterior, realizar la suma de una columna o fila aleatoria
(tanto la elección de la fila o columna, como de elegir si elegir una columna o fila)
 */
public class d_ej4AleatorioSinRep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[][] = new int[3][3];
        int sumaFilaOCol [] =new int [3];
        for (int i = 0;i< array.length;i++){
            for(int j = 0; j< array.length;j++){
                boolean repetido = true;
                do{
                    int valor = genAleatorio(2,20);
                    if(!existeNum(valor,array)){
                        repetido=false;
                        array[i][j]=valor;
                    }
                }while(repetido);

            }
        }
        int suma = 0;
        int azarFilaCol = genAleatorio(0, 1);

        if (azarFilaCol == 0) {
            int fila = genAleatorio(0, 2);
            System.out.println("He sumado la fila " + fila);
            for (int j = 0; j < array[fila].length; j++) {
                suma += array[fila][j];
            }
        } else {
            int col = genAleatorio(0, 2);
            System.out.println("He sumado la columna " + col);
            for (int i = 0; i < array.length; i++) {
                suma += array[i][col];
            }
        }
        for (int i = 0;i< array.length;i++){
            System.out.println();
            for(int j = 0; j< array.length;j++){
                System.out.printf("%2d ",array[i][j]);
            }
        }
    }
        public static int genAleatorio ( int min, int max){
            int iret = min;
            Random rd = new Random();
            iret = rd.nextInt((max +1) -min) +min;

            return iret;
        }
        public static boolean existeNum (int num, int [][]arrayFunc ) {
            boolean haynum = false;
            for (int i = 0; i < arrayFunc.length; i++) {
                for (int j = 0; j < arrayFunc.length; j++) {
                    if (arrayFunc[i][j] == num) {
                        haynum = true;
                    }
                }
            }
            return haynum;
        }

}
