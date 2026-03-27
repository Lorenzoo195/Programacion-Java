package fsv.dsw.examenjava.estructuras.rubenmorales;

import java.util.Scanner;

public class ejercicio1 {
    public static Scanner sc = new Scanner(System.in);
    public static final int MATRICULA_NUMEROS = 4;
    public static final int MATRICULA_LETRAS = 3;

    public static void main(String args[]){
        System.out.println("Introduce una matrícula para comprobar si tiene un formato correcto:");
        String lineData = sc.nextLine();
        char[] matricula = lineData.toCharArray();

        System.out.println("La matrícula da resultado: "+tieneFormatoMatricula(matricula));
    }

    /**
     * Comprueba si la matrícula introducida cuenta con un formato correcto.
     * @param matricula Array con cada uno de los carácteres de la matrícula.
     * @return Devuelve True en caso de cumplir con el formato y false en caso de que no.
     */
    public static boolean tieneFormatoMatricula(char[] matricula){
        if(matricula.length != MATRICULA_LETRAS + MATRICULA_NUMEROS) return false;
        boolean isValid = true;
        for (int i = 0 ; i < matricula.length ; i++){
            //Dígitos
            if(!Character.isDigit(matricula[i]) && i < MATRICULA_NUMEROS ){
                isValid = false;
            }
            //Letras
            if(!Character.isUpperCase(matricula[i]) && i > MATRICULA_NUMEROS){
                isValid = false;
            }
        };
        return isValid;
    }
}
