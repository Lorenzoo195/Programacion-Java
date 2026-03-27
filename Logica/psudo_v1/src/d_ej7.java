/*
-  Haz un mét0do que sume los arrays multidimensionales, es decir,
   la posición 0, 0 del array1 con la posición del array2 y así sucesivamente,
   este mét0do no debe devolver nada, haciendo que deba pasarse el array multidimensional
    de suma como parámetro. Muestra el contenido de cada array multidimensional.
 */
public class d_ej7 {
    public static void main(String [] args){
        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];
        int[][] suma = new int[3][3];
        for (int i = 0; i < m2.length;i++){
            for(int j = 0; j< m2.length;j++){
                m2[i][j]=4;
            }
        }
        for (int i = 0; i < m1.length;i++){
            for(int j = 0; j< m1.length;j++){
                m1[i][j] = 1;
            }
        }
        sumaMatrices(m1,m2,suma);
        for (int i = 0; i < suma.length;i++){
            System.out.println();
            for(int j = 0; j< suma.length;j++){
                System.out.printf("%2d ", suma [i][j]);
            }
        }
    }
    public static void sumaMatrices(int a[][],int b[][], int sumaMatrices[][]){
        for (int i = 0; i < sumaMatrices.length;i++){
            for(int j = 0; j< sumaMatrices.length;j++){
                sumaMatrices [i][j] = sumaMatrices [i][j]+ a[i][j] + b[i][j];
            }
        }
    }

}
