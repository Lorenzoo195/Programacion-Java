import java.util.Random;
import java.util.Scanner;

/*
Crear dos tablas, la primera con los 6 números de una apuesta de la primitiva,
 y la segunda con los 6 números de la combinación ganadora. Mostrar por pantalla el número de aciertos.
 */
public class ej11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int longitud = sc.nextInt();
        int arrApuesta [] = new int[longitud];
        int arrGanadora [] = new int[longitud];

        for(int i =0; i< arrApuesta.length;i++){
            boolean repetido = true;
            int n = 0;
            while(repetido){
                n = genAleatorio(1,49);
                repetido = false;

                for(int j =0;j<i;j++) {
                    if (arrApuesta[j] == n) {
                        repetido = true;
                    }
                }
            }
            arrApuesta[i]= n;
        }
        for(int i =0; i< arrGanadora.length;i++){
            boolean repetido = true;
            int n = 0;
            while(repetido){
                n = genAleatorio(1,49);
                repetido = false;

                for(int j =0;j<i;j++) {
                    if (arrGanadora[j] == n) {
                        repetido = true;
                    }
                }
            }
            arrGanadora[i]= n;
        }
        int iAciertos = 0;
        for(int i = 0;i< arrGanadora.length;i++){
            boolean encontrado = false;
            for(int j = 0;j<arrApuesta.length;j++) {
                if (arrGanadora[i] == arrApuesta[j]) {
                    encontrado = true;

                }
            }
            if(encontrado){
                iAciertos++;
            }
        }
        System.out.println("\nApuesta");
        for (int i = 0; i<arrApuesta.length;i++){
            System.out.printf("%2d ",arrApuesta[i]);
        }
        System.out.println("\nGanadora");
        for (int i = 0; i<arrGanadora.length;i++){
            System.out.printf("%2d ",arrGanadora[i]);
        }
        System.out.println("\nAciertos " + iAciertos);


    }
    public static int genAleatorio (int min, int max){
        return new Random().nextInt(max-min+1)+min;
    }
}
