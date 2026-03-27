import java.util.Scanner;

/*
Implementar un programa que inicialice una tabla de nuestros números favoritos. A continuación,
pedir al usuario el índice de un elemento que será eliminado de la tabla.
Continuaremos eliminando elementos hasta que el índice introducido sea negativo o hasta que no existan más elementos que borrar.
Es imprescindible controlar que el índice leído corresponde a un dato válido.
 */
public class ej2_0$ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime cuantos numeros favoritos vas a poner");
        int iIndice = sc.nextInt();
        int arrNumFav[] = new int[iIndice];
        for (int i = 0; i < arrNumFav.length; i++) {
            arrNumFav[i] = sc.nextInt();
        }

        int iNumRestantes = iIndice;
        boolean seguir = true;

        while (iNumRestantes > 0 && seguir) {
            System.out.println("Dime posicicion para eliminar de tu lista o negativa para terminar");
            int iPosIndice = sc.nextInt();
            if (iPosIndice < 0) {
                seguir = false;
            } else {
                if(iPosIndice>=0 && iPosIndice<arrNumFav.length){
                    if(arrNumFav[iPosIndice]!=0){
                        arrNumFav[iPosIndice] = 0;
                        iNumRestantes--;
                    } else {
                        System.out.println("ese elemento ya estaba eliminado");
                    }
                }else {
                    System.out.println("Fuera de rango");
                }
            }
        }
        System.out.println("Tabla final:");
        for (int i = 0; i < arrNumFav.length; i++) {
            System.out.println("[" + i + "] = " + arrNumFav[i]);
        }

    }
}
