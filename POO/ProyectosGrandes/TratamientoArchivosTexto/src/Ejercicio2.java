import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2 {

    public static void main(String[] args) {
        String nombreFichero = "carta.txt";

        int totalLineas = 0;
        int totalPalabras = 0;
        int totalCaracteres = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(nombreFichero))) {

            String linea;

            while ((linea = br.readLine()) != null) {
                totalLineas++;

                totalCaracteres += linea.length();


                if (!linea.isEmpty()) {
                    String[] palabras = linea.split(" ");
                    totalPalabras += palabras.length;
                }
            }

            System.out.println("--- Estadísticas de " + nombreFichero + " ---");
            System.out.println("Total de líneas: " + totalLineas);
            System.out.println("Total de palabras: " + totalPalabras);
            System.out.println("Total de caracteres: " + totalCaracteres);

        } catch (IOException e) {
            System.err.println("Error al intentar leer el archivo: " + e.getMessage());
            System.out.println("¡Recuerda crear el archivo 'carta.txt' en la raíz del proyecto!");
        }
    }
}
