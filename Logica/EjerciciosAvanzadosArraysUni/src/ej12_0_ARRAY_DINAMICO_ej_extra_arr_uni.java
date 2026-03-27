import java.util.Scanner;

/*
El ayuntamiento de nuestra localidad nos ha encargado una aplicación que ayude a
realizar encuestas estadísticas para conocer el nivel adquisitivo de los habitantes del
municipio. Para ello, tendremos que preguntar el sueldo de cada persona encuestada.
A priori no conocemos el número de encuestados. Para finalizar la entrada de datos,
introduciremos un sueldo con valor -1.
Una vez terminada la entrada de datos, hemos de mostrar la siguiente información:
Todos los sueldos introducidos ordenados de forma decreciente.
El sueldo máximo y mínimo.
La media de los sueldos.
Nota: como a priori se desconoce el número de sueldos, la tabla donde se almacenan los
datos tendrá que incrementar su tamaño conforme necesitemos más espacio.
 */
public class ej12_0_ARRAY_DINAMICO_ej_extra_arr_uni {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arrSueldos[] = new int[2];
        int iDimension  = 0;

        System.out.println("Dime un salario, -1 para terminar");
        int iSueldo = sc.nextInt();

        int iSumaSu = 0;
        int iMedia = 0;
        while(iSueldo!=-1){

            arrSueldos = anadir(arrSueldos,iDimension,iSueldo);
            iDimension++;

            iSumaSu += iSueldo;

            iSueldo = sc.nextInt();
        }
        if(iDimension>0){
            double media = (double) iSumaSu/iDimension;
            System.out.println("la media es: " + iMedia);

            ordenarArray(arrSueldos,iDimension);

            int iMaximo = valorMaxArray(arrSueldos,iDimension);
            int iMinimo = valorMinArray(arrSueldos,iDimension);

            System.out.println("Sueldos ordenados (decreciente):");
            mostraArray(arrSueldos,iDimension);

            System.out.println();
            System.out.println("Valor máximo es: " + iMaximo);
            System.out.println("El valor mínimo es: " + iMinimo);
        } else {
            System.out.println("No se ha introducido ningún sueldo.");
        }
    }/**
     * Añade un nuevo elemento al final de un array, redimensionándolo si no hay espacio.
     *
     * @param arr     Array actual con los elementos ya almacenados.
     * @param iIndice Número de elementos válidos que hay actualmente en el array.
     * @param nuevo   Valor que se quiere añadir al final del array.
     * @return        El array (puede ser el mismo o uno nuevo si se ha redimensionado).
     */
    public static int[] anadir(int[] arr, int iIndice, int nuevo) {
        if (iIndice == arr.length) {
            int[] arrNew = new int[arr.length + 1];  // o *2+1 si quieres
            for (int i = 0; i < arr.length; i++) {
                arrNew[i] = arr[i];
            }
            arr = arrNew;
        }
        arr[iIndice] = nuevo;
        return arr;
    }

    /**
     * Ordena los 'n' primeros elementos del array en orden decreciente.
     *
     * @param array Array que contiene los sueldos.
     * @param n     Número de elementos válidos que se deben ordenar.
     */
    public static void ordenarArray(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            int iMayor = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] > array[iMayor]) {
                    iMayor = j;
                }
            }
            int iAux = array[i];
            array[i] = array[iMayor];
            array[iMayor] = iAux;
        }
    }

    /**
     * Calcula el valor máximo dentro de los 'n' primeros elementos del array.
     *
     * @param array Array que contiene los sueldos.
     * @param n     Número de elementos válidos que se deben tener en cuenta.
     * @return      El valor máximo encontrado en las primeras 'n' posiciones.
     */
    public static int valorMaxArray(int[] array, int n) {
        int max = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    /**
     * Calcula el valor mínimo dentro de los 'n' primeros elementos del array.
     *
     * @param array Array que contiene los sueldos.
     * @param n     Número de elementos válidos que se deben tener en cuenta.
     * @return      El valor mínimo encontrado en las primeras 'n' posiciones.
     */
    public static int valorMinArray(int[] array, int n) {
        int min = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    /**
     * Muestra por pantalla los 'n' primeros elementos del array separados por espacios.
     *
     * @param array Array que contiene los sueldos.
     * @param n     Número de elementos válidos que se deben mostrar.
     */
    public static void mostraArray(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("%2d ", array[i]);
        }
    }

}
