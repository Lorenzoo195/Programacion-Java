import java.util.Scanner;

/*
Dado un numero n leído por teclado encontrar el numero p primo mas cercano a él
por exceso.
 */
public class b_ej13PrimoPorArriba {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int valorMax = Integer.MAX_VALUE;
        boolean primoPorArriba = false;
        for(int i = n+1; i<valorMax && !primoPorArriba;i++){
            int divisores = 0;
            for(int q = 1; q<=i  ; q++ ){
                if(i%q==0){
                    divisores++;
                }
            }
            if(divisores == 2){
                primoPorArriba = true;
                System.out.println(i);
            }

        }


    }
}
