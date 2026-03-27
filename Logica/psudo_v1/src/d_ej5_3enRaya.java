import java.util.Scanner;

public class d_ej5_3enRaya {
    public static void main(String [] args) {
        char tablero[][] = new char[3][3];
        int jugador_1 = 1;
        int jugador_2 = 2;
        boolean turno = false; //false jugador 1 X, true jugador 2 O
        Scanner sc = new Scanner(System.in);
        rellenarTablero(tablero);
        while (!hayGanador(tablero) && !tableroLleno(tablero)) {
            montrarTablero(tablero);
            System.out.println("\nDime posicion a ocupar");
            int fila = sc.nextInt();
            int col = sc.nextInt();
            if(!validarPos(fila,col,tablero)) {
                if (!turno) {
                    ocuparPosicionJugador_1(fila, col, tablero, 1);
                    turno = true;
                } else {

                    ocuparPosicionJugador_2(fila, col, tablero, 2);
                    turno = false;
                }
            } else {
                System.out.println();
                System.out.println("\nPosicion ocupada");
            }
        }
        montrarTablero(tablero);
        if (hayGanador(tablero)) {
            System.out.println("\nHay ganador");
        } else {
            System.out.println("\nEmpate, tablero lleno");
        }
    }
    public static void ocuparPosicionJugador_1 (int fila, int col,char tablero [][],int jugador){
                tablero [fila][col] = 'X';
    }
    public static void ocuparPosicionJugador_2 (int fila, int col,char tablero [][],int jugador){
                tablero [fila][col] = 'O';
    }
    public static boolean validarPos   (int fila, int col, char tablero [][]){
        boolean ocupada = false;
                if(tablero[fila][col]=='X'|| tablero[fila][col] == 'O'){
                    ocupada =true;
                }
        return ocupada;

    }
    public static void montrarTablero  (char tablero [][]){

        for(int i =0; i< tablero.length;i++){
            System.out.println();
            for(int j=0;j<tablero.length;j++){
                System.out.printf("%2c ",tablero[i][j]);
            }
        }
    }
    public static void rellenarTablero (char tablero [][]){
        for (int i = 0;i<tablero.length;i++){
            for(int j=0;j< tablero.length;j++){
                tablero [i][j] = '~';
            }
        }
    }
    public static boolean hayGanador   (char[][] tablero){
        boolean ganador = false;

        for (int i = 0; i < tablero.length; i++){
            if (tablero[i][0] != '~' && tablero[i][0] == tablero[i][1] && tablero[i][1] == tablero[i][2]) {
                ganador = true;
            }
        }
        for (int j = 0; j < tablero.length; j++){
            if (tablero[0][j] != '~' && tablero[0][j] == tablero[1][j] && tablero[1][j] == tablero[2][j]) {
                ganador = true;
            }
        }
        if (tablero[0][0] != '~' &&
                tablero[0][0] == tablero[1][1] &&
                tablero[1][1] == tablero[2][2]) {
            ganador = true;
        }


        if (tablero[0][2] != '~' &&
                tablero[0][2] == tablero[1][1] &&
                tablero[1][1] == tablero[2][0]) {
            ganador = true;
        }


        return ganador;
    }
    public static boolean tableroLleno (char tablero [][]){
        boolean lleno = true;
        for (int i = 0;i<tablero.length;i++){
            for(int j=0;j< tablero.length;j++){
                if(tablero [i][j] == '~'){
                    lleno = false;
                }
            }
        }
        return lleno;
    }

}
