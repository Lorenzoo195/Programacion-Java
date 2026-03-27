package fsv.dsw.examenjava.estructuras.rubenmorales;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String args[]){
        System.out.println("Introduce los números del array para darle la vuelta:");
        Scanner sc = new Scanner(System.in);
        String[] lineData = sc.nextLine().split("");

        //Convierte el input tipo String a tipo Int y en un array
        int[] arrayToReverse = new int[lineData.length];
        for (int i = 0; i < lineData.length; i++){
            arrayToReverse[i] = Integer.valueOf(lineData[i]);
        }

        //Ejecución de la función y muestra del resultado
        int[] result = reverse(arrayToReverse);
        printResult(result);
    }

    /**
     * Devuelve un array de Int con el contenido en orden inverso.
     * @param v Array tipo Int.
     * @return Un Array con los mismos valores que el input pero en orden invertido.
     */
    public static int [] reverse(int [] v){
        int[] toReturn = new int[v.length];
        for (int i = v.length-1; i > -1; i--){
            toReturn[3-i] = v[i];

        };
        return toReturn;
    }

    /**
     * Función simple para imprimir el resultado por pantalla
     * @param v Array tipo Int
     */
    public static void printResult(int[] v){
        for (int i = 0; i < v.length; i++){
            System.out.print(v[i]);
        };
    }
}
