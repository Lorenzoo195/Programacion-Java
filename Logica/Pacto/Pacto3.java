import java.util.Scanner;

/*
Los diseñadores de una aplicación necesitan obtener ordenados los datos de una tabla,
pero por restricciones de la aplicación, la tabla debe permanecer inmutable.
Una posible solución es hacer una copia de la tabla y ordenarla, manteniendo intacta la tabla original,
pero esta alternativa se ha desechado. En su lugar, se ha pensado en crear una segunda tabla donde
se almacenen ordenados los índices de la tabla original. Se pide diseñar un algoritmo en el que, dada una tabla,
 cree otra donde se ordenen mediante los índices de la tabla original. Veamos un ejemplo:
TablaOriginal: [3,5,1,4]
tablaConIndices: [2,0,3,1]
Donde tablaConIndices especifica el lugar que ocupan de forma ordenada los datos de tablaOriginal.
Por ejemplo, el primer elemento de tablaOriginal, que vale 3, en caso de ordenar los datos,
ocupará la posición 2 (que le corresponde con tablaConIndice). En este caso, el i-ésimo elemento
de tablaOriginal ocupará la posición que contiene el i-ésimo elemento de tablaConIndices.
 */
public class Pacto3 {
    public static void main(String[] args) {



        int [] arrNumeros = new int [] {7,9,1,8};
        int []arrPosiciones = new int [arrNumeros.length];








      /*  Scanner sc = new Scanner(System.in);
        int tablaOriginal [] = {3,5,1,4};
        int tablaConIndices[] = new int [tablaOriginal.length];

        for (int i = 0; i<tablaConIndices.length;i++){
            tablaConIndices[i]= i;
        }

        OrdenarIndices(tablaOriginal, tablaConIndices,0);

                for(int i = 0; i<tablaConIndices.length;i++){
                    System.out.print(tablaConIndices[i] + " ");
                }
        }

        public static void OrdenarIndices (int [] tablaOriginal, int [] tablaConIndices , int inicio){

                if(inicio >= tablaConIndices.length-1) {
                    return;
                }
                int posMin = inicio;
                for(int i= inicio +1  ;i<tablaConIndices.length;i++){
                    int idxActual = tablaConIndices[i];
                    int idxMin = tablaConIndices[posMin];

                    if(tablaOriginal[idxActual]<tablaOriginal[idxMin]){
                        posMin=i;
                    }
                }
                int temp = tablaConIndices[inicio];
                tablaConIndices[inicio]= tablaConIndices[posMin];
                tablaConIndices[posMin]= temp;

                OrdenarIndices(tablaOriginal,tablaConIndices,inicio+1);
*/

        }

    }

