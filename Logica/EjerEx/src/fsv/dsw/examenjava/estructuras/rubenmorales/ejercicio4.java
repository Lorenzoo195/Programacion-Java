package fsv.dsw.examenjava.estructuras.rubenmorales;

import java.util.Scanner;

public class ejercicio4 {
    public static char[] LETRAS_MATRICULA = {'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q','R','S','T','V','W','X','Y','Z' };
    public static final char[] DIGITOS = {'0','1','2','3','4','5','6','7','8','9'};
    public static final int MATRICULA_NUMEROS = 4;
    public static final int MATRICULA_LETRAS = 3;

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce a partir de que número, las letras y  la cantidad de matrículas a generar");
        System.out.println("Introduce el número inicial de la matrícula (Por ejemplo: 9998): ");
        int matNum = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce las 3 letras iniciales de la matrícula: ");
        char[] letters = sc.nextLine().toCharArray();
        System.out.println("Número de matrículas a generar: ");
        int quantity = sc.nextInt();
        char[][] matriculas = generarSerieMatriculas(matNum, letters, quantity);
        printResults(matriculas);
    }

    /**
     * Genera una serie de matriculas en un array de chars
     * @param num Número inicial de la matrícula
     * @param letters Tres letras mayúsculas iniciales
     * @param quantity Cantidad de matrículas a generar
     * @return Array de matrículas generado
     */
    public static char[][] generarSerieMatriculas(int num, char[] letters, int quantity) {

        char[][] resultado = new char[quantity][7];



        int indexL1 = buscarIndice(LETRAS_MATRICULA, letters[0]);
        int indexL2 = buscarIndice(LETRAS_MATRICULA, letters[1]);
        int indexL3 = buscarIndice(LETRAS_MATRICULA, letters[2]);

        for (int i = 0; i < quantity; i++) {

            char[] matricula = new char[7];

            //Dígitos
            matricula[0] = DIGITOS[(num / 1000) % 10];
            matricula[1] = DIGITOS[(num / 100) % 10];
            matricula[2] = DIGITOS[(num / 10) % 10];
            matricula[3] = DIGITOS[num % 10];

            // Letras
            matricula[4] = LETRAS_MATRICULA[indexL1];
            matricula[5] = LETRAS_MATRICULA[indexL2];
            matricula[6] = LETRAS_MATRICULA[indexL3];

            resultado[i] = matricula;

            // Incrementar número y letras
            num++;
            if (num > 9999) {
                num = 0;
                if (++indexL3 >= LETRAS_MATRICULA.length) {
                    indexL3 = 0;
                    if (++indexL2 >= LETRAS_MATRICULA.length) {
                        indexL2 = 0;
                        if (++indexL1 >= LETRAS_MATRICULA.length) {
                            indexL1 = 0;
                        }
                    }
                }
            }
        }

        return resultado;
    }

    public static int buscarIndice(char[] array, char c) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == c) return i;
        }
        return -1;
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

    public static void printResults(char[][] results){
        for(int i = 0; i < results.length; i++){
            for(int j = 0; j < results[i].length; j++){
                System.out.print(results[i][j]);
            }
            System.out.println();
        }
    }
}
