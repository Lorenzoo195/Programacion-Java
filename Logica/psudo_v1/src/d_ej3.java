import java.util.Scanner;

/*
Crear dos matrices de nxn y sumar sus valores, los resultados se deben almacenar en otra matriz. Los valores y la longitud, seran insertados por el usuario. Mostrar las matrices originales y el resultado.
 */
public class d_ej3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nFilas = sc.nextInt();
        int nColumnas = sc.nextInt();
        int array1 [][] = new int[nFilas][nColumnas];
        int array2 [][] = new int[nFilas][nColumnas];
        int suma [][]   = new int[nFilas][nColumnas];
        for(int i = 0;i <array1.length;i++){
            for( int j= 0;j< array1.length;j++){
                array1[i][j]= sc.nextInt();
            }
        }
        for(int i = 0;i <array2.length;i++){
            for( int j= 0;j< array2.length;j++){
                array2[i][j]= sc.nextInt();
            }
        }
        for(int i = 0;i <suma.length;i++){
            for( int j= 0;j< suma.length;j++){
                suma[i][j]= array1[i][j] + array2[i][j];
            }
        }
        for(int i = 0;i <suma.length;i++){
            System.out.println();
            for( int j= 0;j< suma.length;j++){
                System.out.printf("%2d ",suma[i][j]);
            }
        }

    }
}
