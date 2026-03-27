import java.util.Scanner;

public class AmigoAleman {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas frases vas analizar?");
        int numFrases = sc.nextInt();
        sc.nextLine();
        int contFrases = 0;

        while(contFrases<numFrases){
            System.out.println("Introduce frase");
            String frase = sc.nextLine().toLowerCase();
            // separamos la frase con espacios
            String[] palabras = frase.split(" ");

            for(String palabra:palabras){

                int vocalesSeguidas = 0;
                int consonantesSeguidas=0;
                boolean encontrada = false;
                // recorremos cada letra de la palabra
                for (int i = 0; i < palabra.length(); i++) {
                    char letra = palabra.charAt(i);
                    // si es vocal
                    if("aeiouáéíóú".indexOf(letra)!=-1){
                        vocalesSeguidas++;
                        consonantesSeguidas=0;
                    }else{
                        consonantesSeguidas++;
                        vocalesSeguidas=0;
                    }
                    // si hay 4 o mas vocales o consonantes seguidas
                    if(vocalesSeguidas>=4 || consonantesSeguidas>=4 ){
                        encontrada=true;
                    }

                }
                if(encontrada){
                    System.out.println(palabra);
                }
            }

            contFrases++;
        }

    }
}
