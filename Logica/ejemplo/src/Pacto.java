import java.util.Scanner;

/*
Ejercicio 1.- Cuadrado latino Java
CREAR UN CUADRADO LATINO EN JAVA
Programa para generar un cuadrado latino de orden N.
Un cuadrado latino de orden N es una matriz cuadrada de N filas y N columnas
en la que su primera fila contiene los N primeros números naturales y cada una de las filas siguientes c
ontiene la rotación de la fila anterior un lugar a la derecha.
Por ejemplo, un cuadrado latino de orden 4 es una matriz cuadrada de tamaño 4 x 4 con el siguiente contenido:
1 2 3 4
4 1 2 3
3 4 1 2
2 3 4 1

*/
public class Pacto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime dimension del cuadrado latino");
        int d = sc.nextInt();
        int array [][] = new int [d][d];


        for(int i = 0;i< d;i++){

            for (int j =0; j<d;j++){

                array[i][j] = (( j - i + d ) % d ) + 1;

                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

    }

}

