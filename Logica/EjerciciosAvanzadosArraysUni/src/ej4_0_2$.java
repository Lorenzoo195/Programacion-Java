import java.util.Random;
import java.util.Scanner;

/*
Desarrollar el juego la cámara secreta, que consiste en abrir una cámara
su combinación secreta, que está formado por una combinación de dígitos del uno al
cinco. El jugador especificará cuál es la longitud de la combinación, a mayor longitud
mayor será la dificultad del juego. La aplicación genera, de forma aleatoria, una
combinación secreta que el usuario tendrá que acertar. En cada intento se muestra
como pista, para cada dígito de la combinación introducido por el jugador, si es mayor,
menor o igual que el correspondiente de la combinación secreta.
 */
public class ej4_0_2$ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("longitud combinacion");
        int iLongitud = sc.nextInt();
        int arrComb [] = new int[iLongitud];
        Random rd = new Random();
        for(int i = 0; i<arrComb.length;i++){
            arrComb[i] = rd.nextInt(5)+1;
        }
        for(int i = 0; i<arrComb.length;i++) {
            System.out.printf("%2d ", arrComb[i]);
        }
        System.out.println();
        ocultarCombinacion(arrComb, iLongitud);
        int iElementos = iLongitud;
        while(iElementos>0) {
            int iContAciertos = 0;
            int iContNumeros = 0;
            for (int i = 0; i < iLongitud; i++) {
                int valor = sc.nextInt();
                iContNumeros++;
                if (valor > arrComb[i]) {
                    System.out.println("Es mayor al numero");
                } else if (valor < arrComb[i]) {
                    System.out.println("Es menor al numero");
                } else {
                    System.out.println("Posicion acertada");
                    iContAciertos++;
                    if(iContAciertos  == iLongitud){
                        iElementos = 0;
                        System.out.println("Has acertado la combinacion!");
                    }
                }
                if(iContNumeros == iLongitud && iElementos>0){
                    System.out.println("FIn intento, vuelve a empezar");
                }
            }
        }
    }
    public static void ocultarCombinacion (int arrComb [], int iLongitud){
        for (int i = 0;i< arrComb.length;i++){
            System.out.printf("%2c ", '~');
        }
        System.out.println();
    }
}
