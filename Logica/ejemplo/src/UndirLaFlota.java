import java.util.Scanner;
/*
tablero 10x10, barcos puestos manualmente
'~' para agua

'B' para barco ( hay 7 Bs que son los barcos)

'X' para barco tocado

'O' para disparo fallido
cuando hundes todos los barcos se termina partida
 */
public class UndirLaFlota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dimension = 10;
        char[][] tablero = new char[dimension][dimension];


        colocarAguaEnTablero(tablero);
        colocarBarcos(tablero);
        monstrarTablero(tablero);
        System.out.println();
        int fila = -1;
        int col = -1;
        int contCasillasBarcas = 7;
        boolean coordenadaValida = false;


        while (contCasillasBarcas > 0) {
            coordenadaValida = false;
            while (!coordenadaValida) {
                System.out.println("Dime una coordenada");
                fila = sc.nextInt();
                System.out.println("Dime una coordenada");
                col = sc.nextInt();
                if (fila >= 0 && fila < dimension && col >= 0 && col < dimension) {
                    coordenadaValida = true;
                } else {
                    System.out.println("Coordenada Invalida");
                }
            }

            if (tablero[fila][col] == 'B') {
                tablero[fila][col] = 'X';
                contCasillasBarcas--;
                boolean quedaBarco = false;
                for (int i = fila - 1; i <= fila + 1; i++) {
                    for (int j = col - 1; j <= col + 1; j++) {
                        if (i >= 0 && j >= 0 && i < dimension && j < dimension) {
                            if (tablero[i][j] == 'B') {
                                quedaBarco = true;
                            }
                        }
                    }

                }
                if (quedaBarco == true) {
                    System.out.println("Barco tocado");
                } else {
                    System.out.println("Barco hundido");

                }

            } else {
                System.out.println("Barco no tocado");
                tablero[fila][col] = 'O';
            }
            monstrarTablero(tablero);
            if (contCasillasBarcas == 0) {
                System.out.println("Flota hundida");
            }
        }

    }
    public static void colocarAguaEnTablero (char[][] tablero){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = '~';
            }
        }
    }
    public static void colocarBarcos (char[][] tablero){
        tablero[0][0] = 'B';
        tablero[0][1] = 'B';
        tablero[0][2] = 'B';
        tablero[4][5] = 'B';
        tablero[5][5] = 'B';
        tablero[7][2] = 'B';
        tablero[7][3] = 'B';
    }
    public static void monstrarTablero (char[][] tablero){
        for(int i = 0; i < 10; i++){
            System.out.println();
            for(int j = 0; j < 10; j++){
                System.out.print(" " + tablero[i][j]);
            }
        }
        System.out.println();
    }

}
