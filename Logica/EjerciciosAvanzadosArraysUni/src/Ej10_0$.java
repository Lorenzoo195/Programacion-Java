import java.util.Random;

/*
Realizar un programa que llene un vector de 15 posiciones con números generados
aleatoriamente (comprendidos entre el 1 y el 90) y lo presente en pantalla. Los 15 números enteros
representan un hipotético cartón del juego del Bingo. Recuerda que los números no pueden estar
repetidos.
 */
public class  Ej10_0$ {
    public static void main(String[] args) {
        int arrCartonBingo [] = new int[10];
        int iCont = 0;
        while(iCont <10){
            int iValor  = genAleatorio(90,1);
            boolean repetido = false;
            for(int i = 0;i<iCont;i++){
                if(arrCartonBingo[i] == iValor){
                    repetido = true;
                }
            }
            if(!repetido){
                arrCartonBingo[iCont] = iValor;
                iCont++;
            }
        }
        for(int i = 0;i<arrCartonBingo.length;i++){
            System.out.printf("%2d ",arrCartonBingo[i]);
        }
    }
    public static int genAleatorio(int max, int min){
        return new Random().nextInt(max-min+1)+min;
    }
}
