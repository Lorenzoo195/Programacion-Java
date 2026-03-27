/*
Crea dos arrays multidimensionales de 2×3
y rellénalos como quieras (números aleatorios, por teclado o definido al crear el array).
 */
public class d_ej6 {
    public static void main(String [] args){
        int array [][] = new int[2][3];
        for(int i = 0;i< array.length;i++){
            for(int j = 0;j< array[i].length;j++){
                array[i][j] = 0;
            }
        }
        for(int i = 0;i< array.length;i++){
            System.out.println();
            for(int j = 0;j< array[i].length;j++){
                System.out.printf("%2d ",array[i][j]);
            }
        }
    }
}
