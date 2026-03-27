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
public class ej3$ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iIndice = 10;
        int arrNum[] = new int[iIndice];
        Random rd = new Random();
        arrNum[0] = rd.nextInt(100) + 1;
        for (int i = 1; i < arrNum.length; i++) {
            int num = 0;
            do {
                num = genAleatorio(num-1,(num+5));
            } while (num <= arrNum[i - 1]);
            arrNum[i] = num;
        }
        int iNum = sc.nextInt();
        boolean seguir = true;
        int iContIndice = 0;
        for(int i = 0;i< arrNum.length;i++){
            int valor = 0;
            if(iNum>arrNum[i]){
                seguir = true;
                iContIndice++;
            } else {
                seguir = false;

                arrNum[iContIndice-1] = iNum;
            }

        }



        for(int i = 0; i <arrNum.length;i++){
            System.out.printf("%3d ",arrNum[i]);
        }
    }

    public static int genAleatorio(int min,int max){
        return new Random().nextInt(max-min +1) + min;
    }
}

