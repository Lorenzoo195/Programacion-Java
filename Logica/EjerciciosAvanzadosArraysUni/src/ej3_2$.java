import java.util.Random;
import java.util.Scanner;

/*
Escribe un programa que defina un array de 10 enteros y lo rellene con números crecientes al azar entre 1 y 100.
Es decir, los números elegidos aleatoriamente pero siempre tienen que ser mayores que los anteriores:
el número que ocupe la posición 1 debe ser mayor que el de la posición 0, el de la posición 2 mayor que el de la posición 1, y así sucesivamente.
Después de eso, se pedirá al usuario un número entre 1 y el número mayor que exista en el array.
El número introducido por el usuario se insertará en la posición del array adecuada para conservar el orden,
desplazando los demás elementos hacia la derecha, de manera que se pierde el último elemento.
Después de insertar el número introducido por el usuario, el contenido del array debe mostrarse por pantalla.
El proceso se repetirá hasta que el usuario introduzca un número negativo.
 */
public class ej3_2$ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrNum [] = new int [10];
        for(int i = 0;i < arrNum.length;i++){
            arrNum[i] = genAleatorio(15,1);
        }
        for(int i =0; i<arrNum.length;i++){
            int iIndicemayor = i;
            for(int j = i+1;j<arrNum.length;j++){
                if(arrNum[j]<arrNum[iIndicemayor]){
                    iIndicemayor = j;
                }
            }
            int iAux = arrNum[i];
            arrNum[i] = arrNum[iIndicemayor];
            arrNum[iIndicemayor] = iAux;
        }
        for (int i = 0;i <arrNum.length;i++){
            System.out.printf("%2d ",arrNum[i]);
        }
    }
    public static int genAleatorio (int max, int min){
        return new Random().nextInt(max-min+1)+min;
    }
}
