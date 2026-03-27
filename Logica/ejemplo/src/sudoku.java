import java.util.Random;
import java.util.Scanner;

/*
sudoku
valor 0 es casilla vacia
 */
public class sudoku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] board = {
                {0, 0, 3, 0, 0, 8, 0, 6, 0},
                {6, 0, 0, 0, 3, 0, 4, 0, 0},
                {0, 2, 0, 0, 0, 0, 0, 0, 1},

                {0, 0, 0, 6, 1, 0, 0, 9, 0},
                {4, 0, 0, 0, 0, 0, 0, 0, 6},
                {0, 6, 0, 0, 2, 3, 0, 0, 0},

                {1, 0, 0, 0, 0, 0, 0, 2, 0},
                {0, 0, 7, 0, 6, 0, 0, 0, 4},
                {0, 5, 0, 2, 0, 0, 8, 0, 0}
        };

        int arrSudoku[][] = new int[9][9];
        int subcuadricula[][] = new int[3][3];
        int valorVacio = 0;
    }
    public static boolean esValido(int[][] tablero, int fila, int col, int num) {
        return !estaEnFila(tablero[fila], num)
                && !estaEnCol(tablero, col, num)
                && !estaEnCaja3x3(tablero, fila, col, num);
    }

    public static boolean estaEnCaja3x3 (int [][]tablero, int fila, int col, int num){
        int filaInicio = (fila / 3) * 3;
        int colInicio  = (col / 3) * 3;

        for (int f = filaInicio; f < filaInicio + 3; f++) {
            for (int c = colInicio; c < colInicio + 3; c++) {
                if (tablero[f][c] == num) {
                    return true;
                }
            }
        }
        return false;
    }







    public static boolean validarPosicion (int fila, int [] tablero,int col,int num){
        int valorEscogido = 0;
        for(int i = 0; i<tablero.length;i++){
            if(num==valorEscogido){
                return false;
            }else{

            }
        }
            return true;
    }
    public static  int GenerarAleatorio (int iMinValue, int iMaxValue){
        int iReturn = iMinValue;
        Random aleatorio = new Random();
        iReturn=aleatorio.nextInt((iMaxValue+1) - iMinValue) + iMinValue;
        return iReturn;
    }
    public static boolean estaEnFila(int[] fila, int num){
        for (int i = 0; i < fila.length; i++) {
            if (fila[i] == num) {
                return true;   // num está en la fila
            }
        }
        return false;          // num no aparece en la fila
    }
    public static boolean estaEnCol(int[] col, int num){
        for (int i = 0; i < col.length; i++) {
            if (col[i] == num) {
                return true;   // num está en la col
            }
        }
        return false;          // num no aparece en la col
    }
    public static boolean estaEnCol(int[][] tablero, int col, int num){
        for (int i = 0; i < tablero.length; i++) {
            if (tablero[i][col] == num) {
                return true;   // num está en la columna
            }
        }
        return false;          // num no aparece en la columna
    }



}
