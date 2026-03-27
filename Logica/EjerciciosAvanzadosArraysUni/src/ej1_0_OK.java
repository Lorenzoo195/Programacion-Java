import java.util.Scanner;

/*
Introducir por teclado un número n; a continuación solicitar al usuario que teclee n números.
Realizar la media de los números positivos, la media de los negativos y contar el número de ceros introducidos.
 */
public class ej1_0_OK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuanto numeros vas a poner?");
        int iLong = sc.nextInt();
        int arrNum [] = new int [iLong];
        int iMediaPos = 0;
        int iMediaNeg = 0;
        int iNumPosTotal = 0;
        int iNumNegTotal = 0;
        int iContNumPos = 0;
        int iContNumNeg = 0;
        int iContCeros = 0;
        System.out.println("Dime los numeros");
        for(int i = 0;i <arrNum.length;i++){
            int iNum = sc.nextInt();
            arrNum[i] = iNum;
            if(iNum>0){
                iContNumPos++;
                iNumPosTotal = iNum + iNumPosTotal;
                iMediaPos = iNumPosTotal/iContNumPos;
            } else if (iNum < 0 ){
                iContNumNeg++;
                iNumNegTotal = iNum +iNumNegTotal;
                iMediaNeg = iNumNegTotal/iContNumNeg;
            } else{
                iContCeros++;
            }
        }
        System.out.println("la media de numeros positivos " + iMediaPos);
        System.out.println("la media de numeros negatios " + iMediaNeg);
        System.out.println("la cantidad de ceros introduccidos es: "+ iContCeros);

    }
}