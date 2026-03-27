import java.util.Random;

/*
Leer una serie de 6 enteros que se almacenarán en una tabla que hay que ordenar y mostrar.
Leer otra serie de 6 enteros, que también se guardarán en una tabla y se mostrarán ordenados.
A continuación, fusionar las dos tablas en una tercera, de forma que los 12 números sigan
ordenados. Fusionar dos tablas ordenadas significa copiar en el orden correcto para que los
datos resultantes continúen ordenados, sin necesidad de volver a realizar una ordenación.
 */
public class ej6_0$ {
    public static void main(String[] args) {
        int arrA [] = new int [6];
        int arrB [] = new int [6];

        rellenarArray(arrA);
        rellenarArray(arrB);
        mostrarArray(arrA);
        System.out.println();
        mostrarArray(arrB);
        System.out.println("\nOrdenado A");
        ordenarArray(arrA);
        mostrarArray(arrA);
        System.out.println("\nOrdenado B");
        ordenarArray(arrB);
        mostrarArray(arrB);
        int arrOrdenado [] = new int [12];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i< arrA.length && j< arrB.length){
                if(arrA[i]>=arrB[j]){
                    arrOrdenado[k]=arrA[i];
                    i++;
                }else {
                    arrOrdenado[k]=arrB[j];
                    j++;
                }
            k++;
        }
        while(i< arrA.length){
            arrOrdenado[k] = arrA [i];
            k++;
            i++;
        }
        while(j< arrB.length){
            arrOrdenado[k] = arrB [j];
            k++;
            j++;
        }
        System.out.println("\nA + B ordenado");
        mostrarArray(arrOrdenado);
    }
    public static void mostrarArray(int array []){
        for(int i = 0; i<array.length;i++){
            System.out.printf("%2d ",array[i]);
        }
    }
    public static void rellenarArray(int array []){
        for(int i = 0;i<array.length;i++){
            array[i]=genAleatorio(20,1);
        }
    }
    public static int genAleatorio (int max, int min){
        return new Random().nextInt(max-min+1)+min;
    }
    public static void ordenarArray(int array []){
        for (int i = 0; i < array.length; i++) {
            int iMayor = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[iMayor] < array[j]) {
                    iMayor = j;
                }
            }
            int iAux = array[i];
            array[i] = array[iMayor];
            array[iMayor] = iAux;
        }
    }
}
