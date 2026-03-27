import java.util.Random;
import java.util.Scanner;

/*
Realizar un programa que llene un vector de 15 posiciones con números generados
aleatoriamente (comprendidos entre el 1 y el 90) y lo presente en pantalla. Los 15 números enteros
representan un hipotético cartón del juego del Bingo. Recuerda que los números no pueden estar
repetidos.
 */
public class ej10_1_OK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrCarton [] = new int[15];
        int iCont = 0;

        while(iCont<15){
            int iValor = genAleatorio(90,1);
            boolean repetido = false;
            for(int i = 0;i<iCont;i++){
                if(arrCarton[i]== iValor){
                    repetido = true;
                }
            }
                if(!repetido){
                    arrCarton[iCont]= iValor;
                    iCont++;
                }
        }
        for(int i = 0;i<arrCarton.length;i++){
            System.out.printf("%2d ",arrCarton[i]);
        }
    }
    public static int genAleatorio(int max, int min){
        return new Random().nextInt(max-min+1)+min;
    }
}
