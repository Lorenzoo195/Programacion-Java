import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[][] nombresGolosinas = {         //4x4

                {"KitKat", "Chicles de fresa", "Lacasitos", "Palotes"},
                {"Kinder Bueno", "Bolsa variada Haribo", "Chetoos", "Twix"},
                {"Kinder Bueno", "M&M'S", "Papa Delta", "Chicles de menta"},
                {"Lacasitos", "Crunch", "Milkybar", "KitKat"}
        };
        double[][] precio = {
                {1.1, 0.8, 1.5, 0.9},
                {1.8, 1, 1.2, 1},
                {1.8, 1.3, 1.2, 0.8},
                {1.5, 1.1, 1.1, 1.1}
        };

        Scanner sc = new Scanner(System.in);
        String bancoNum = "0123456789";

        int opcion = 0;
        boolean NumeroValido = false;

        while (NumeroValido  == false){

            System.out.println("¡Elige una opcion! (numerica)");
            System.out.println("1: Pedir una golosina. " +
                    "2: Mostrar Golosinas. " +
                    "3:Rellenar golosinas. " +
                    "4: Apagar maquina.");

            String textoUsu = sc.nextLine();
            boolean esNum = true;

            if(textoUsu.length() == 0){
                esNum = false;
            }
            for(int i = 0; i<textoUsu.length();i++){
                char letra = textoUsu.charAt(i);
                if(bancoNum.indexOf(letra)==-1){
                    esNum = false;
                }
            }
            if(esNum == true){
                opcion = Integer.parseInt(textoUsu);
                NumeroValido = true;
            }else{
                System.out.println("Error. Has introducido caracteres no validos");
            }
        }

        /*
        switch(opcion){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                break;
            }
*/
    }
}