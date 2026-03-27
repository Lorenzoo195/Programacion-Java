import java.util.Scanner;

public class Ej8_DentroDelLaberinto_$$$$ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f;
        int c;

        char libre = '.';
        char pared = 'X';
        char check = '*';
        do  {

            String dimension = sc.nextLine();
            String partes[] = dimension.trim().split("\\s+");

            String fila = partes[0].trim();
            String colu = partes[1].trim();

            f = Integer.parseInt(fila);
            c = Integer.parseInt(colu);

            char laberinto[][] = new char[f][c];

            if(f >= 2 && c <= 100){
                for (int i = 0; i < laberinto.length; i++) {
                    String linea = sc.nextLine();
                    for (int j = 0; j < laberinto[i].length; j++) {
                        laberinto[i][j] = linea.charAt(j);
                    }
                }
                for (int i = 0; i < laberinto.length; i++) {
                    if(i != 0){
                        for (int j = 0; j < laberinto[i].length; j++) {
                            if(laberinto[i][j] == libre && laberinto[i-1][j] == check){
                                laberinto[i][j] = check;
                                for (int k = j; k < laberinto[i].length - j; k++) {
                                    if(laberinto[i][k] == pared){
                                        break;
                                    }
                                    if(laberinto[i][k] == libre){
                                        laberinto[i][k] = check;
                                    }
                                }
                                for (int k = j; k > 0; k--) {
                                    if(laberinto[i][k] == pared){
                                        break;
                                    }
                                    if(laberinto[i][k] == libre){
                                        laberinto[i][k] = check;
                                    }
                                }
                            }
                        }
                    }else{
                        for (int j = 0; j < laberinto[i].length; j++) {
                            if(laberinto[i][j] == libre){
                                laberinto[i][j] = check;
                            }
                        }
                    }

                }

                boolean isValid = false;

                for (int j = 0; j < laberinto[f-1].length; j++) {
                    if(laberinto[f-1][j] == check){
                        isValid = true;
                    }

                }

                System.out.println(isValid ? "SI":"NO");

                /*
                * for (int i = 0; i < laberinto.length; i++) {
                    for (int j = 0; j < laberinto[i].length; j++) {
                        System.out.print(laberinto[i][j]);

                    }
                    System.out.println();
                }*/
            }else{
                System.out.println("Introduce unos valores dentro del rango");
            }

        }while(f >= 2 && c <= 100);
    }
}