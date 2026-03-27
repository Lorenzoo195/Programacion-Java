import java.util.Scanner;

public class Ej11_NumerosHarshad_$$$$$ {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int iN = sc.nextInt();
        int iM = sc.nextInt();


        while(iN!=0 && iM!=0){
            int mejorInicio = 0;
            int mejorLongitud = 0;

            int actualInicio = 0;
            int actualLongitud = 0;

            for(int i = iN;i<= iM;i++){
                if(esHarshad(i)){
                    if (actualLongitud == 0) {
                        actualInicio = i;
                    }
                    actualLongitud++;

                    if (actualLongitud > mejorLongitud) {
                        mejorLongitud = actualLongitud;
                        mejorInicio = actualInicio;
                    }
                } else {
                    actualLongitud = 0;
                }
            }

            if (mejorLongitud == 0) {
                System.out.println("NO HAY NINGUNO");
            } else {
                int fin = mejorInicio + mejorLongitud - 1;
                for (int j = mejorInicio; j <= fin; j++) {
                    if (j > mejorInicio) {
                        System.out.print(" ");
                    }
                    System.out.print(j);
                }
                System.out.println();
            }
            iN = sc.nextInt();
            iM = sc.nextInt();
        }
    }
    private static boolean esHarshad(int n){
        String s = String.valueOf(n);
        String [] partes = s.split("");
        int suma = 0;
        for(int i = 0 ;i< partes.length;i++){
            suma += Integer.parseInt(partes[i]);
        }
        return n % suma == 0;
    }

}
