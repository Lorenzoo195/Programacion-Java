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
public class ej3_1_2$_OK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iIndice = sc.nextInt();
        int arrNum[] = new int[iIndice];

        int num;
        arrNum[0]= genAleatorio(55,1);
        num = arrNum[0];

        for(int i = 1;i<iIndice;i++){
            boolean mayor = true;
            while(mayor){
                if(arrNum[i]>arrNum[i-1]){
                    mayor = false;
                }else{
                    arrNum[i] = genAleatorio(num+5,num);
                    num = arrNum[i];
                }
            }
        }
        for (int i = 0;i<arrNum.length;i++){
            System.out.printf("%2d ",arrNum[i]);
        }
        int iNumSus = sc.nextInt();
        int iMax = valorMaxArray(arrNum,iIndice);

        while (iNumSus>=0){
            if(iNumSus>=1 && iNumSus <= iMax){
                insertarOrdenado(arrNum,iIndice,iNumSus);
                iMax = valorMaxArray(arrNum,iIndice);
                for (int i = 0;i<arrNum.length;i++){
                    System.out.printf("%2d ",arrNum[i]);
                }
                System.out.println();
            } else {
                System.out.println("Numero entre 1 y " + iMax);
            }
            System.out.println("Numero negativo para salir");
            iNumSus = sc.nextInt();
        }
        for (int i = 0;i<arrNum.length;i++){
            System.out.printf("%2d ",arrNum[i]);
        }
 }              // funcion sigo sin entender bien como va
    public static void insertarOrdenado(int []arrNum, int iIndice, int iNumSus){
        int iContSus = 0;
        while(iContSus < iIndice && arrNum[iContSus]<iNumSus){
            iContSus++;
        }
        int i = iIndice-1;
        while(i>iContSus){
            arrNum[i] = arrNum[i-1];
            i--;
        }
        arrNum[iContSus] = iNumSus;
    }
    public static int valorMaxArray(int arr [], int longitud){
        int max = arr[0];
        for (int i = 0; i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int genAleatorio (int max, int min){
        return new Random().nextInt(max-min+1)+min;
    }
}
