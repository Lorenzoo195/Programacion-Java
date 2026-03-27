import java.util.Scanner;
/*
 Crea un programa en el que se pida por consola el nombre de 2 alumnos y la nota de cada uno de ellos como valor numérico.
 El resultado que debe mostrarse es el nombre de cada alumno, su nota y su calificación como texto (Sobresaliente, Notable, Bien o Suspenso).
Para ello crea un array numérico y otro de String (ambos unidimensionales).
En el array numérico se insertarán las calificaciones facilitadas por el usuario entre 0 y 10
(debemos controlar que inserte una nota valida), pudiendo ser decimal.
En el array de Strings se insertarán los nombres de los alumnos.
Crea también un array de String donde insertaremos el resultado de la nota con palabras admitiéndose estos valores:
Sobresaliente, Notable, Bien o Suspenso. El programa debe comprobar la nota de cada alumno teniendo en cuenta esta equivalencia:
Si la nota está entre 0 y 4,99 será un Suspenso.
Si la nota está entre 5 y 6,99 será un Bien.
Si la nota está entre 7 y 8,99 será un Notable.
Si la nota está entre 9 y 10 será un Sobresaliente.
Muestra por pantalla, el alumno su nota y su resultado en palabras utilizando bucles.
Crea los métodos que creas convenientes.
 */
public class ej3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String arrAlumnos [] = new String[2];
        double arrNotas [] = new double[2];
        String arrTexto [] = {"Suspenso","Bien","Notable","Sobresaliente"};

        for(int i = 0;i<arrAlumnos.length;i++){
            System.out.println("Nombre del alumano " + (i+1) + ": ");
            arrAlumnos[i]= scanner.nextLine();
            System.out.println("Nota de " + arrAlumnos[i] + " (0-10): ");
            double dnota = scanner.nextDouble();
            scanner.nextLine();
            arrNotas[i]= dnota;
        }
        System.out.println("\nResultados");
        for (int i = 0; i< arrAlumnos.length;i++) {
            double dnota = arrNotas[i];
            String textoNota;
            if (dnota < 5) {
                textoNota =arrTexto[0];
            } else if (dnota < 7) {
                textoNota =arrTexto[1];
            } else if (dnota < 9) {
                textoNota =arrTexto[2];
            } else {
                textoNota =arrTexto[3];
            }
            System.out.print(arrAlumnos[i] + " " + arrNotas[i] + " " + arrTexto [i] + " ");

        }
    }
}
