/*
Se desea un programa que pida por pantalla un tamaño de matriz (cuadrada) y rellene valores del 0 al 9 aleatorios. Además se deben solicitar unas coordenadas X e Y para localizar en dicho punto un pico, un valle o una meseta:
Pico: la coordenada es el valor más alto de los que lo rodean
Valle: la coordenada es el valor más bajo de los que lo rodean
Meseta: la coordenada es el valor medio redondeado o al menos hay 3 números adyacentes iguales al dado.
 */
import java.util.Random;
import java.util.Scanner;

public class PruebaEscalada {
    public static void main(String[] args) {
        System.out.println("Dame tamaño matriz cuadrada");
        Scanner sc = new Scanner(System.in);
        int indice = sc.nextInt();

        sc.nextLine();
        int aMatriz[][] = new int[indice][indice];
        Random rdm = new Random();

        for (int i = 0; i < indice; i++) {
            for (int j = 0; j < indice; j++) {
                aMatriz[i][j] = rdm.nextInt(10);
            }
        }
        for (int i = 0; i < indice; i++) {
            for (int j = 0; j < indice; j++) {
                System.out.print(aMatriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Dame una posicion de la matriz");
        int iX = sc.nextInt();
        int iY = sc.nextInt();
        int iValorPosicion = aMatriz[iX][iY];                //valor posicion a comparar

        System.out.println("El valor de la posicion es " + iValorPosicion);

        boolean esPico = false;
        boolean esValle = false;
        boolean esMeseta = false;
        double sumaTotal = 0;
        double cont = 0;
        for (int i = (iX-1); i < (iX+1); i++) {                      //caso centrico
            for (int j = (iY - 1); j < (iY + 1); j++) {


                  //  if (aMatriz[i][j] != aMatriz[iX][iY]) {   //con el debuj cuando se ve que cuando llega aqui hace la comparacion con el valor elegido y sale del FOR

                    if (aMatriz[i][j] < aMatriz[iX][iY]) {
                        esPico = true;
                    }
                    if (aMatriz[i][j] > aMatriz[iX][iY]) {
                        esValle = true;

                    }
               // }


            }
        }
        if (esPico == true){
            System.out.println("es pico");
        }
        if (esValle == true){
            System.out.println("es valle");
        }
        if (esMeseta == true){
            System.out.println("es meseta");
        }

    }
}




/*int valorCentral = matriz[x][y];
            System.out.println("\nValor en (" + x + ", " + y + "): " + valorCentral);

// Variables para el análisis
int minVecino = 10; // Inicializar con un valor mayor que 9
int maxVecino = -1;  // Inicializar con un valor menor que 0
int contadorVecinos = 0;

// Iterar sobre los vecinos (3x3 alrededor del punto central (x, y))
            for (int i = x - 1; i <= x + 1; i = i + 1) {
        for (int j = y - 1; j <= y + 1; j = j + 1) {

        // Asegurarse de que el vecino está dentro de los límites y no sea el centro
        if (i >= 0 && i < n && j >= 0 && j < n) {
        if (!(i == x && j == y)) {
int valorVecino = matriz[i][j];

// Encontrar min y max
                            if (valorVecino < minVecino) {
minVecino = valorVecino;
                            }
                                    if (valorVecino > maxVecino) {
maxVecino = valorVecino;
                            }

contadorVecinos = contadorVecinos + 1;
        }
        }
        }
        }
*/
/*
import java.util.Random;
import java.util.Scanner;

public class AnalizadorMatrizSinContadores
{
    public static void main(String[] args)
    {
        // 1. Configuración de entrada y aleatoriedad
        Scanner lector = new Scanner(System.in);
        Random generadorAleatorio = new Random();

        // 2. Solicitar el tamaño de la matriz
        System.out.println("Por favor, ingrese el tamaño N para la matriz cuadrada (N x N):");
        int tamano = lector.nextInt();

        // 3. Declaración e inicialización de la matriz
        int[][] matriz = new int[tamano][tamano];

        // 4. Llenar la matriz con valores aleatorios (0-9)
        System.out.println("\nMatriz generada:");
        int filaIndice = 0;
        while (filaIndice < tamano) {
            int columnaIndice = 0;
            while (columnaIndice < tamano) {
                matriz[filaIndice][columnaIndice] = generadorAleatorio.nextInt(10);
                System.out.print(matriz[filaIndice][columnaIndice] + " ");
                columnaIndice = columnaIndice + 1;
            }
            System.out.println();
            filaIndice = filaIndice + 1;
        }

        // 5. Solicitar coordenadas
        System.out.println("\nIngrese la coordenada X (fila) para analizar (0 a " + (tamano - 1) + "):");
        int coordenadaX = lector.nextInt();
        System.out.println("Ingrese la coordenada Y (columna) para analizar (0 a " + (tamano - 1) + "):");
        int coordenadaY = lector.nextInt();

        // --- Preparación para el Análisis ---

        // **Truco:** Usar un arreglo de tamaño máximo 8 (máx. vecinos) para almacenar los valores.
        int[] valoresVecinos = new int[8];
        int indiceVecino = 0; // Este es un índice de array, NO un contador del problema.

        int valorCentral = matriz[coordenadaX][coordenadaY];
        int maximoVecino = -1;
        int minimoVecino = 10;

        // Bucle para iterar sobre los vecinos (3x3)
        int i = coordenadaX - 1;
        while (i <= coordenadaX + 1) {
            int j = coordenadaY - 1;
            while (j <= coordenadaY + 1) {

                // 6. Comprobar si la coordenada (i, j) es válida y no es la central
                if (i >= 0 && i < tamano && j >= 0 && j < tamano) {
                    if (i != coordenadaX || j != coordenadaY) {

                        int valorVecino = matriz[i][j];

                        // a. Almacenar vecino para la suma/media posterior
                        valoresVecinos[indiceVecino] = valorVecino;
                        indiceVecino = indiceVecino + 1; // Avanza el índice del array

                        // b. Determinar Máximo y Mínimo
                        if (valorVecino > maximoVecino) {
                            maximoVecino = valorVecino;
                        }
                        if (valorVecino < minimoVecino) {
                            minimoVecino = valorVecino;
                        }
                    }
                }
                j = j + 1;
            }
            i = i + 1;
        }

        // --- Cálculo de la media y chequeo de iguales (sin contadores) ---

        int sumaTemporal = 0; // Variable temporal de acumulación para el cálculo
        int limiteVecinos = indiceVecino; // Cantidad REAL de vecinos encontrados (sin usar 'contadorVecinos')

        // 7. Calcular la suma y buscar 3 valores iguales (en el array temporal)
        indiceVecino = 0;
        int igualesEncontrados = 0; // Variable temporal para la comprobación

        while (indiceVecino < limiteVecinos) {

            // Acumular la suma (Reemplaza a 'sumaVecinos')
            sumaTemporal = sumaTemporal + valoresVecinos[indiceVecino];

            // Comprobar si es igual al central (Reemplaza a 'contadorIguales')
            if (valoresVecinos[indiceVecino] == valorCentral) {
                igualesEncontrados = igualesEncontrados + 1;
            }

            indiceVecino = indiceVecino + 1;
        }

        // 8. Determinar el tipo de coordenada
        String resultado = "Indefinido";

        // Condición 1: Pico
        if (valorCentral > maximoVecino) {
            resultado = "Pico ⛰️";
        }

        // Condición 2: Valle
        else if (valorCentral < minimoVecino) {
            resultado = "Valle ⬇️";
        }

        // Condición 3: Meseta (si no es Pico ni Valle)
        else {
            // Criterio a: Valor medio redondeado
            // limiteVecinos (la cantidad de vecinos) reemplaza a 'contadorVecinos'
            double mediaVecinos = (double) sumaTemporal / limiteVecinos;
            int mediaRedondeada = (int) (mediaVecinos + 0.5); // Redondeo sin Math.round

            // Criterio b: Al menos 3 números adyacentes iguales
            // igualesEncontrados reemplaza a 'contadorIguales'

            if (valorCentral == mediaRedondeada || igualesEncontrados >= 3) {
                 resultado = "Meseta 🔲";
            } else {
                resultado = "Punto Regular (no cumple criterios de Pico, Valle o Meseta)";
            }
        }

        // 9. Mostrar el resultado
        System.out.println("\n--- Análisis de Coordenada ---");
        System.out.println("Valor en (" + coordenadaX + ", " + coordenadaY + "): " + valorCentral);
        System.out.println("Máximo vecino: " + maximoVecino);
        System.out.println("Mínimo vecino: " + minimoVecino);
        System.out.println("Vecinos iguales al valor central: " + igualesEncontrados);
        System.out.println("\nEl punto es un/una: **" + resultado + "**");

        lector.close();
    }
}
 */