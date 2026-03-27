import java.util.Scanner;

/*
Leer un número n que debe filtrarse entre 1 y 100 y a continuación calcular y
escribir la tabla de multiplicar de ese número con el siguiente formato:
 */
public class b_ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int resultado =0;
        if(n>=1 && n<=100){

            for(int i=1;i<=10;i++){
                resultado = n*i;
                System.out.println(n + " * " + i + " = " + resultado);
            }



        } else {
            System.out.println("numero invalido");
        }


    }
}
