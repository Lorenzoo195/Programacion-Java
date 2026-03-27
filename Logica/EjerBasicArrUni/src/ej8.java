import java.util.Scanner;

/*
Crear una tabla que debe rellenar de la siguiente forma: se leerá por teclado una serie de números,
guardando en la tabla los pares hasta que esté llena, e ignorando los impares.
Debes mostrar por pantalla la cantidad de impares desechados.
 */
public class ej8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int longitud = sc.nextInt();
        int arrNum [] = new int[longitud];
        int iContImpares = 0;
        for (int i = 0; i<arrNum.length;i++){
            int iNumero = sc.nextInt();
            if(iNumero%2==0){
                arrNum[i] = iNumero;
            } else {
                iContImpares++;
                i--;
            }
        }
        System.out.println(iContImpares);
    }
}
