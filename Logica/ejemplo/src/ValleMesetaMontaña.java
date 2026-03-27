//Prueba de escalada
import java.util.Random;
import java.util.Scanner;

public class ValleMesetaMontaña {
    public static void main(String[] args) {
        int matriz[][] = new int [5][5];
        Scanner sc= new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = GenerarAleatorio(0, 9);
            }
        }
        int iIndice=0;
        int jIndice=0;

        for(int i =0; i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                System.out.printf(matriz[i][j]+" ");
            }
        }

    }
    public static  int GenerarAleatorio (int iMinValue, int iMaxValue){
            int iReturn = iMinValue;
            Random aleatorio = new Random();
            iReturn=aleatorio.nextInt((iMaxValue+1) - iMinValue) + iMinValue;
        return iReturn;
    }
}
