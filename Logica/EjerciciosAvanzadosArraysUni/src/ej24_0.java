import java.util.Random;
import java.util.Scanner;

public class ej24_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dimension tabla");
        int iDimension = sc.nextInt();
        int tablaOriginal [] = new int[iDimension];
        int tablaConIndices [] = new int[iDimension];

        for(int i = 0;i<tablaOriginal.length;i++){
            tablaOriginal [i] = genAle(100,1);
        }
        for(int i = 0;i<tablaOriginal.length;i++){
            System.out.printf("%2d ",tablaOriginal [i]);
        }
        System.out.println();

        for(int i = 0;i<tablaConIndices.length;i++){
         tablaConIndices[i] = i;
        }
        ordenarArray(tablaOriginal,tablaConIndices);

        for(int i = 0;i<tablaConIndices.length;i++){
            System.out.printf("%2d ",tablaConIndices[i]);
        }
    }
     public static void ordenarArray (int [] array, int [] arrayIndice){
        int n = arrayIndice.length;
        for(int i = 0;i<n;i++){
            int iPosicion = i;
            for(int j = i+1;j<n;j++){
                if(array[arrayIndice[j]]>array[arrayIndice[iPosicion]]){
                    iPosicion= j;
                }
            }
            int iAux = arrayIndice[i];
            arrayIndice[i] = arrayIndice[iPosicion];
            arrayIndice[iPosicion] = iAux;
        }

     }
     public static int genAle (int max, int min){
        return new Random().nextInt(max-min+1)+min;
     }
}
