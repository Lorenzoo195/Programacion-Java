package fsv.dsw.examenjava.estructuras.rubenmorales;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String args[]){
        System.out.println("Introduce los dos arrays a comprobar:");
        Scanner sc = new Scanner(System.in);

        //Obtención y adaptación de datos para tener un array de chars
        System.out.print("Array 1: ");
        char[] array1 = sc.nextLine().toCharArray();
        System.out.print("Array 2: ");
        char[] array2 = sc.nextLine().toCharArray();

        System.out.println("El resultado es "+ esInverso(array1, array2));
    }

    /**
     * Comprueba si ambos arrays introducidos son de la misma longitud y cuentan con el mismo
     * contenido en el mismo orden.
     * @param arr1 Primer array tipo char para comparar
     * @param arr2 Segundo array tipo char para comparar
     * @return Booleano donde es verdadero si tienen la misma longitud y mismo contenido en el mismo orden,
     * en cualquier otro caso se devuelve falso.
     */
    public static boolean esInverso (char [] arr1, char[] arr2){
        if(arr1.length != arr2.length) return false;
        boolean sameContent = true;
        int counter = 0;
        for (int i = arr1.length-1; i > -1; i--){
            if(arr1[counter] != arr2[i]) sameContent = false;
            counter++;
        }
        return sameContent;
    }
}
