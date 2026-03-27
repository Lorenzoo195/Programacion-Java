package fsv.dsw.examenjava.estructuras.rubenmorales;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String args[]){
        System.out.println("Introduce una matrícula para comprobar:");
        Scanner sc = new Scanner(System.in);
        String lineData = sc.nextLine();
        char[] matricula = lineData.toCharArray();

        System.out.println("La matrícula da resultado: "+numeroMatricula(matricula));
    }

    public static int numeroMatricula(char[] matricula){
        int number = 0;
        for(int i = 0; i < 4; i++){
            number = Integer.parseInt(number + String.valueOf(matricula[i]));
        }
        return number;
    }
}
