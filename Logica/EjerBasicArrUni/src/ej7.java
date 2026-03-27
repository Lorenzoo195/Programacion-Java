import java.util.Scanner;

/*
Crea un programa para leer la altura de N personas y calcular la altura media.
Calcular cuántas personas tienen una altura superior a la media y cuántas tienen una altura inferior a la media.
El valor de N se pide por teclado y debe ser entero positivo.
 */
public class ej7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int iPersonas =  sc.nextInt();
        double daltura [] = new double[iPersonas];
        double imedia = 0;
        double iAlturaTotal =0;
        int iContDebajoMedia = 0;
        int iContEncimaMedia = 0;

        for(int i=0; i< daltura.length;i++){
            double altura = sc.nextDouble();
            daltura[i] = altura;
            iAlturaTotal += altura;
            imedia = iAlturaTotal/iPersonas;
        }
        for(int i = 0;i<daltura.length;i++){
            if(daltura[i] <= imedia){
                iContEncimaMedia++;
            } else {
                iContDebajoMedia++;
            }
        }
        System.out.println(imedia);
        System.out.println(iContDebajoMedia);
        System.out.println(iContDebajoMedia);
    }
}
