/*
Crear una matriz de 3×3 con los números del 1 al 9. Mostrar por pantalla, tal como aparece en la matriz.
 */
public class d_ej1RepMatrices {
    public static void main(String [] args){
        int matriz [][] = new int [3][3];
        int cont = 1;

        for(int i =0; i <matriz.length;i++){
            for(int q=0;q< matriz.length;q++){
                matriz [i][q] = cont;
                cont++;
            }
        }
        for(int i =0;i< matriz.length;i++){
            System.out.println();
            for(int q = 0; q<matriz.length;q++){
                System.out.printf("%2d " ,matriz[i][q]);
            }
        }

    }
}
