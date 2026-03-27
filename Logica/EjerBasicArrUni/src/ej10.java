import java.util.Scanner;

/*
Escribir una aplicación que solicite al usuario cuántos números desea introducir. A continuación,
 se introducirá por teclado esa cantidad de números enteros y,
  por último, los mostrará en el orden inverso al introducido.
 */
public class ej10 {
    public static void main(String[] args){
        System.out.println("Cuantos numeros?");
        Scanner sc = new Scanner (System.in);
        int iCantNum = sc.nextInt();
        System.out.println("Dime numeros");
        int arrOg [] = new int[iCantNum];
        int arrInv [] = new int[iCantNum];
        int iCont = 0;
        for(int i = 0;i<arrOg.length;i++){
            int iNum = sc.nextInt();
            arrOg[i] = iNum;
        }
        for (int i = arrOg.length-1; i>= 0;i-- ){
            arrInv[iCont] = arrOg[i];
            iCont++;
        }
        for(int i = 0; i<arrInv.length;i++){
            System.out.println(arrInv[i]);
        }
    }
}
