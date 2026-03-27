package fsv.dsw.examenjava.estructuras.rubenmorales;

import java.util.Scanner;

public class ejercicio3 {
    public static char[] LETRAS_MATRICULA = {'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q','R','S','T','V','W','X','Y','Z' };
    public static final int MATRICULA_NUMEROS = 4;
    public static final int MATRICULA_LETRAS = 3;

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una matrícula para comprobar si tiene un formato correcto:");
        String lineData = sc.nextLine();
        char[] matricula = lineData.toCharArray();

        System.out.println("La matrícula da resultado: "+esMatriculaCorrecta(matricula));
    }

    public static int numeroMatricula(char[] matricula){
        int number = 0;
        for(int i = 0; i < 4; i++){
            number = Integer.parseInt(number + String.valueOf(matricula[i]));
        }
        return number;
    }

    /**
     * Comprueba si la matrícula introducida cuenta con un formato correcto.
     * @param matricula Array con cada uno de los carácteres de la matrícula.
     * @return Devuelve True en caso de cumplir con el formato y false en caso de que no.
     */
    public static boolean esMatriculaCorrecta(char[] matricula){
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
            //Comprobar primera letra
            if(matricula[4] != letraMatricula(numeroMatricula(matricula)%21)) isValid = false;
        };
        return isValid;
    }

    public static char letraMatricula(int num){
        return LETRAS_MATRICULA[num];
    }
}
