import java.util.Random;
import java.util.Scanner;

/*
Diseñar una aplicación para gestionar un campeonato de programación, donde se
introducen la puntuación (enteros) obtenidos por 5 programadores, conforme van
terminando su prueba. La aplicación debe mostrar las puntuaciones ordenadas de los 5
participantes. En ocasiones, cuando finalizan los 5 participantes anteriores, se suman
al campeonato un máximo de 3 programadores de exhibición, cuyos puntos se incluyen
con el resto. La forma de especificar que no intervienen más programadores de
exhibición es introducir como puntuación un -1. La aplicación debe mostrar, finalmente,
los puntos ordenados de todos los participantes.
 */
public class ej5_0_ordenar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iProgramadores = 5;
        int puntuaciones [] = new int[iProgramadores];
        Random rd = new Random();
        for(int i = 0; i<puntuaciones.length;i++){
            puntuaciones[i] = rd.nextInt(9)+1;
        }
        for (int i = 0; i < puntuaciones.length - 1; i++) {

            int indiceMayor = i;

            for (int j = i + 1; j < puntuaciones.length; j++) {
                if (puntuaciones[j] > puntuaciones[indiceMayor]) {
                    indiceMayor = j;
                }
            }
            int aux = puntuaciones[i];
            puntuaciones[i] = puntuaciones[indiceMayor];
            puntuaciones[indiceMayor] = aux;
        }
        for (int i = 0; i < puntuaciones.length; i++) {
            System.out.println(puntuaciones[i]);
        }
        System.out.println("Hay programadores de exhibicion?");
        int iExhibicion = sc.nextInt();
        if(iExhibicion>= 1 && iExhibicion<= 3 ){
            int arrPuntiacionesExhibicion [] = new int[iExhibicion];

            for(int i = 0; i < arrPuntiacionesExhibicion.length; i++) {
                arrPuntiacionesExhibicion[i] = rd.nextInt(9) + 1;
            }
        }
    }
}




