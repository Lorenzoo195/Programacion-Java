import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el nombre del fichero de texto (o pulsa Enter para usar 'prueba.txt'): ");
        String nombreFichero = scanner.nextLine();

        if (nombreFichero.trim().isEmpty()) {
            nombreFichero = "prueba.txt";
        }

        try (BufferedReader br = new BufferedReader(new FileReader(nombreFichero))) {

            String linea;
            System.out.println("\n--- Contenido de " + nombreFichero + " ---");

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

            System.out.println("-----------------------------------");

        } catch (IOException e) {
            System.err.println("Error al intentar leer el archivo: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}