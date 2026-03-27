import java.util.Scanner;

/*
Teniendo un vector con los valores que queramos, meter en otro de la misma longitud,
aquellos valores que sean pares y mayores que 25. Después, mostrar el vector de origen
y el de destino, solo los numero introducidos.
 */
public class Ej6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nDime longitud");
        int longitud = sc.nextInt();
        int arrOrigen [] = new int[longitud];
        int arrDestino [] = new int[longitud];
        System.out.println("\nDime array origen");
        for (int i = 0; i < arrOrigen.length; i++) {
            arrOrigen[i] = sc.nextInt();
        }
        for(int i =0; i<arrOrigen.length;i++){
            int valor = arrOrigen[i];
            if (valor %2==0 && valor >25){
                arrDestino[i]= valor;
            }
        }

        for(int i = 0; i<arrOrigen.length;i++){
            System.out.println(arrOrigen[i]);
        }
        for(int i = 0; i<arrDestino.length;i++){
            if(arrDestino[i]!=0) {
                System.out.println(arrDestino[i]);
            }
        }

    }
}
