import java.util.Scanner;
public class ej5_$_ordenar {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int numFijos = 5;
            int[] puntuacionesFijas = new int[numFijos];

            System.out.println("Introduce las puntuaciones de los 5 programadores:");
            for (int i = 0; i < numFijos; i++) {
                System.out.print("Programador " + (i + 1) + ": ");
                puntuacionesFijas[i] = sc.nextInt();
            }

            int maxExhibicion = 3;
            int[] puntuacionesExhibicion = new int[maxExhibicion];
            int numExhibicionLeidos = 0;
            boolean hayMasExhibicion = true;

            System.out.println("\nIntroduce las puntuaciones de hasta 3 programadores de exhibición.");
            System.out.println("Introduce -1 para indicar que no hay más:");

            while (numExhibicionLeidos < maxExhibicion && hayMasExhibicion) {
                System.out.print("Exhibición " + (numExhibicionLeidos + 1) + ": ");
                int puntos = sc.nextInt();

                if (puntos == -1) {
                    hayMasExhibicion = false;
                } else {
                    puntuacionesExhibicion[numExhibicionLeidos] = puntos;
                    numExhibicionLeidos++;
                }
            }

            int totalParticipantes = numFijos + numExhibicionLeidos;
            int[] puntuacionesTotales = new int[totalParticipantes];

            int indice = 0;
            for (int i = 0; i < numFijos; i++) {
                puntuacionesTotales[indice] = puntuacionesFijas[i];
                indice++;
            }
            for (int i = 0; i < numExhibicionLeidos; i++) {
                puntuacionesTotales[indice] = puntuacionesExhibicion[i];
                indice++;
            }

            // 4) Ordenar de mayor a menor (selection sort)
            for (int i = 0; i < puntuacionesTotales.length - 1; i++) {
                int indiceMayor = i;
                for (int j = i + 1; j < puntuacionesTotales.length; j++) {
                    if (puntuacionesTotales[j] > puntuacionesTotales[indiceMayor]) {
                        indiceMayor = j;
                    }
                }
                int aux = puntuacionesTotales[i];
                puntuacionesTotales[i] = puntuacionesTotales[indiceMayor];
                puntuacionesTotales[indiceMayor] = aux;
            }

            System.out.println("\nPuntuaciones ordenadas (todos los participantes):");
            for (int i = 0; i < puntuacionesTotales.length; i++) {
                System.out.println(puntuacionesTotales[i]);
            }

            sc.close();
        }
    }

