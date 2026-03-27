import java.util.Scanner;
import java.util.Scanner;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca una dimensión para la matriz: ");
        int iDimension = sc.nextInt();

        comprobarDimension(iDimension);

        int[][] arrMatriz = new int[iDimension][iDimension];

        rellenarMatriz(arrMatriz, iDimension);

        mostrarMatiz(arrMatriz, iDimension);

        System.out.println("-----------------------------------------");
        System.out.println("Introduzca unas coordenadas");
        System.out.print("Coordenadas en la posición X: ");
        int iX = sc.nextInt();
        comprobarCoordenadas(iX, iDimension);
        System.out.print("Coordenadas en la posición Y: ");
        int iY = sc.nextInt();
        comprobarCoordenadas(iY, iDimension);

        System.out.println("La coordenada elegida es... ");
        boolean bEsPico = esPico(arrMatriz, iDimension, iX, iY);
        boolean bEsValle = esValle(arrMatriz, iDimension, iX, iY);

        if (bEsPico) {
            System.out.println("La coordenada elegida es un pico!");
        } else if (bEsValle) {
            System.out.println("La coordenada elegida es un valle!");
        } else {
            System.out.println("La coordenada elegida es una meseta.");
        }


    }

    public static void comprobarDimension (int dimension) {
        if (dimension <= 0) {
            System.out.println("Error, la matriz no puede tener valor negativo o cero.");
        }
    }

    public static void rellenarMatriz (int[][] matriz, int dimension) {
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public static void mostrarMatiz (int[][] matriz, int dimension) {
        System.out.println("-----------------------------------------");
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void comprobarCoordenadas (int coordenada, int dimension) {
        if (coordenada < 0 || coordenada > dimension - 1) {
            System.out.println("Error: coordenada incorrecta");
        }
    }

    public static boolean esPico (int[][] matriz, int dimension, int X, int Y) {
        for (int i = X - 1; i < X + 2; i++) {
            for (int j = Y - 1; j < Y + 2; j++ ) {
                if (i >= 0 && i < dimension && j >= 0 && j < dimension && !(i == X && j == Y)) {
                    if (matriz[i][j] > matriz[X][Y]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean esValle (int[][] matriz, int dimension, int X, int Y) {
        for (int i = X - 1; i < X + 2; i++) {
            for (int j = Y - 1; j < Y + 2; j++ ) {
                if (i >= 0 && i < dimension && j >= 0 && j < dimension && !(i == X && j == Y)) {
                    if (matriz[i][j] < matriz[X][Y]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

}
/*
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una palabra o frase: ");
        String strCadena = sc.nextLine();

        String strCadenaLimpia = strCadena.toLowerCase().replace(",", "")
                .replace(".", "")
                .replace("¿", "")
                .replace("?", "")
                .replace(" ", "")
                .replace("á", "a")
                .replace("é", "e")
                .replace("í", "i")
                .replace("ó", "o")
                .replace("ú", "u");

        boolean bResultado = esPalindromo(strCadenaLimpia, 0, strCadenaLimpia.length() -1);

        if (bResultado) {
            System.out.println("¡Es un palíndromo!");
        } else {
            System.out.println("No es un palíndromo.");
        }

    }

    public static boolean esPalindromo(String strCadena, int iInicio, int iFin) {

        if (iInicio >= iFin) {
            return true;
        }
        if (strCadena.charAt(iInicio) != strCadena.charAt(iFin)) {
            return false;
        }
        return esPalindromo(strCadena, iInicio + 1, iFin - 1);
    }
}

*/










/*public class Main {
    public static void main(String[] args) {

    }
}
*/





/*
                Scanner sc = new Scanner(System.in);
                String text = "A ti no, bonita";
                text = text.replace(" ", "").replace(",","");
                String textmin = text.toLowerCase();

                text.length();
                text.toCharArray();
                String stCadenaInv = "";
                for(int i=0;i<text.length();i++) {
                    Character car = text.charAt(1);
                    stCadenaInv.concat(car.toString());
                */






       /*
        String nombre=sc.nextLine();
        System.out.println("Nombre: " + nombre);
        int edad = sc.nextInt();
        System.out.println("La edad es " + edad);
        double altura = sc.nextDouble();
        System.out.println("La altura es " + altura);
        int peso = sc.nextInt();
        double iMC = peso/(altura*altura);
        //System.out.println("El IMC es: " + String.format("%.2f", iMC));
        System.out.printf("El IMC es : %.2f", iMC);
        */
   /*
   }
    public static int factorial (int n){
        int  resultado=1;
        if(n==0){
            resultado=1;
        }
        else{
            n=resultado*factorial(n-1);
        }
        return resultado;
        */

