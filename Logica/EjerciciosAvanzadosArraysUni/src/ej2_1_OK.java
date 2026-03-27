import java.util.Scanner;

/*
Implementar un programa que inicialice una tabla de nuestros números favoritos. A continuación,
pedir al usuario el índice de un elemento que será eliminado de la tabla.
Continuaremos eliminando elementos hasta que el índice introducido sea negativo o hasta que no existan más elementos que borrar.
Es imprescindible controlar que el índice leído corresponde a un dato válido.
 */
public class ej2_1_OK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime inidice");
        int iIndice = sc.nextInt();

        int arrNum[] = new int[iIndice];
        System.out.println("Dime numeros");
        for(int i = 0; i< arrNum.length;i++){
            arrNum[i] = sc.nextInt();
        }
        System.out.println("Posicion para eliminar");
        int iElementos = iIndice;

        boolean seguir = true ;

        while (iElementos != 0 && seguir) {
            int iPosDelete = sc.nextInt();
                if (iPosDelete < arrNum.length) {
                    if (iPosDelete > -1) {
                        seguir = true;
                    arrNum[iPosDelete] = 0;
                    iElementos--;
                } else {
                        seguir = false;
                    }
            }else {
                    System.out.println("Fuera de rangos");
                }
        }
        for(int i = 0; i< arrNum.length;i++){
            System.out.printf("%2d ", arrNum[i]);
        }
    }
}
