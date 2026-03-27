import java.util.Scanner;

public class Ej2_OrdenandoApuntes_$ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Primer tema
        String primero = sc.nextLine();

        // Número de fragmentos
        int n = sc.nextInt();
        sc.nextLine(); // limpiar salto de línea

        // Arrays para las parejas A-B
        String[] izq = new String[n];
        String[] der = new String[n];

        for (int i = 0; i < n; i++) {
            String linea = sc.nextLine();
            String[] partes = linea.trim().split("-");
            izq[i] = partes[0];
            der[i] = partes[1];
        }

        int totalMax = n + 1;                 // máximo de temas
        String[] ordenFinal = new String[totalMax];

        ordenFinal[0] = primero;              // primer tema fijo
        int usados = 1;
        String actual = primero;

        // como mucho hay totalMax temas en la cadena
        while (usados < totalMax) {
            boolean encontrado = false;

            // buscar si hay una pareja cuyo izq sea el tema actual
            for (int i = 0; i < n; i++) {
                if (!encontrado && izq[i].equals(actual)) {
                    String siguiente = der[i];
                    ordenFinal[usados] = siguiente;
                    usados++;
                    actual = siguiente;
                    encontrado = true;
                }
            }

            // si no hemos encontrado siguiente, salir del while
            if (!encontrado) {
                usados = totalMax;            // fuerza fin de bucle
            }
        }

        // imprimir en una línea, separados por comas
        for (int i = 0; i < usados; i++) {
            if (i > 0) {
                System.out.print(",");
            }
            System.out.print(ordenFinal[i]);
        }
        System.out.println();

        sc.close();
    }
}
