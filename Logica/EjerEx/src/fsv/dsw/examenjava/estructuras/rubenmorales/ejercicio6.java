package fsv.dsw.examenjava.estructuras.rubenmorales;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String args[]){
        System.out.println("Introduce los dos arrays a comprobar:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Array 1: ");
        String[] lineData = sc.nextLine().split("");
        System.out.print("Array 2: ");
        String[] lineData2 = sc.nextLine().split("");

        //Convierte ambos input tipo String a tipo Int y en un array
        int[] arrayToReverse = new int[lineData.length];
        int[] arrayToReverse2 = new int[lineData2.length];
        for (int i = 0; i < lineData.length; i++){
            arrayToReverse[i] = Integer.valueOf(lineData[i]);
        }
        for (int i = 0; i < lineData2.length; i++){
            arrayToReverse2[i] = Integer.valueOf(lineData2[i]);
        }

        //Ejecución y muestra del resultado
        System.out.println("El resultado es "+ iguales(arrayToReverse, arrayToReverse2));
    }

    public static boolean iguales (int [] arr1, int[] arr2){
        if(arr1.length != arr2.length) return false;
        boolean sameContent = true;
        for (int i = 0; i < arr1.length; i++){
            if(arr1[i] != arr2[i]) sameContent = false;
        }
        return sameContent;
    }
}
