import java.util.Scanner;

/*
Diseñar un programa que solicite al usuario que introduzca por teclado 5 números decimales,
 a continuación, debe mostrar los números en el mismo orden que se han introducido.
 */
public class ej9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //double dNum = sc.nextDouble();
        double arrNum [] = new double[3];
        for(int i = 0; i<arrNum.length;i++){
            arrNum[i] = sc.nextDouble();
        }
        for(int i = 0; i<arrNum.length;i++){
            System.out.printf("%f ", arrNum[i]);
        }
    }
}
