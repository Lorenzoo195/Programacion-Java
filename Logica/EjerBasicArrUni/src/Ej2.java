import java.util.Scanner;
/*
Pedir una nota de 0 a 10 y mostrarla de la forma:
Insuficiente (de 0 a 4), Suficiente (5), Bien (6), Notable (7 y 8) y Sobresaliente (9 y 10).
Emplea una tabla para los textos de las notas.
 */
public class Ej2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iNotas = scanner.nextInt();
        String [] texto = {"Insuficiente","Suficiente","Bien","Notable","Sobresaliente"};
        int indice =0;
            switch (iNotas) {
                case 0, 1, 2, 3, 4:
                    indice = 0;
                    break;
                case 5:
                    indice = 1;
                    break;
                case 6:
                    indice = 2;
                    break;
                case 7, 8:
                    indice = 3;
                    break;
                case 9, 10:
                    indice = 4;
                    break;
                default:
                    System.out.println("Nota no válida");
            }
        System.out.println("Calificacion: " + texto[indice]);
    }
}
