import java.util.Scanner;

public class Main {

    static String[][] nombresGolosinas = {
            {"KitKat", "Chicles de fresa", "Lacasitos", "Palotes"},
            {"Kinder Bueno", "Bolsa variada Haribo", "Chetoos", "Twix"},
            {"Kinder Bueno", "M&M'S", "Papa Delta", "Chicles de menta"},
            {"Lacasitos", "Crunch", "Milkybar", "KitKat"}
    };

    static double[][] precios = {
            {1.1, 0.8, 1.5, 0.9},
            {1.8, 1.0, 1.2, 1.0},
            {1.8, 1.3, 1.2, 0.8},
            {1.5, 1.1, 1.1, 1.1}
    };

    static int[][] cantidades = new int[4][4];
    static double ventasTotales = 0.0;
    static final String PASSWORD = "MaquinaExpendedora2017";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        inicializarCantidades(5);

        int opcion = 0;
        while (opcion != 4) {
            mostrarMenu();
            opcion = leerEntero(sc, "Elige una opción: ");

            if (opcion == 1) {
                pedirGolosina(sc);
            } else if (opcion == 2) {
                mostrarGolosinas();
            } else if (opcion == 3) {
                rellenarGolosinas(sc);
            } else if (opcion == 4) {
                System.out.printf("Ventas totales: %.2f €%n", ventasTotales);
                System.out.println("Apagando máquina...");
            } else {
                System.out.println("Opción no válida.");
            }
        }

        sc.close();
    }

    // ------------ Funciones de inicialización y menú ------------

    public static void inicializarCantidades(int valorInicial) {
        int i = 0;
        while (i < cantidades.length) {
            int j = 0;
            while (j < cantidades[i].length) {
                cantidades[i][j] = valorInicial;
                j = j + 1;
            }
            i = i + 1;
        }
    }

    public static void mostrarMenu() {
        System.out.println("----- MÁQUINA EXPENDEDORA -----");
        System.out.println("1. Pedir golosina");
        System.out.println("2. Mostrar golosinas");
        System.out.println("3. Rellenar golosinas");
        System.out.println("4. Apagar máquina");
        System.out.println("--------------------------------");
    }

    public static void mostrarGolosinas() {
        System.out.println("Código | Nombre                 | Precio");
        int fila = 0;
        while (fila < nombresGolosinas.length) {
            int col = 0;
            while (col < nombresGolosinas[fila].length) {
                String codigo = "" + fila + col;
                System.out.printf("%-6s | %-20s | %.2f €%n",
                        codigo, nombresGolosinas[fila][col], precios[fila][col]);
                col = col + 1;
            }
            fila = fila + 1;
        }
    }

    // ------------ Pedir golosina ------------

    public static void pedirGolosina(Scanner sc) {
        String codigo = leerCadena(sc,
                "Introduce el código de la golosina (ej. 20 para fila 2, col 0): ");

        boolean valido = codigoValido(codigo);
        if (valido) {
            int fila = Character.getNumericValue(codigo.charAt(0));
            int col = Character.getNumericValue(codigo.charAt(1));

            if (cantidades[fila][col] > 0) {
                cantidades[fila][col] = cantidades[fila][col] - 1;
                double precio = precios[fila][col];
                ventasTotales = ventasTotales + precio;

                System.out.printf("Has pedido: %s (%.2f €). ¡Disfruta!%n",
                        nombresGolosinas[fila][col], precio);
            } else {
                System.out.println("No quedan existencias de esa golosina.");
            }
        } else {
            System.out.println("Código inválido.");
        }
    }

    // ------------ Rellenar golosinas ------------

    public static void rellenarGolosinas(Scanner sc) {
        String pass = leerCadena(sc, "Introduce la contraseña de técnico: ");

        boolean acceso = PASSWORD.equals(pass);
        if (acceso) {
            String codigo = leerCadena(sc,
                    "Introduce el código de la golosina a rellenar (ej. 20): ");

            boolean valido = codigoValido(codigo);
            if (valido) {
                int fila = Character.getNumericValue(codigo.charAt(0));
                int col = Character.getNumericValue(codigo.charAt(1));

                int cantidad = leerEntero(sc, "Introduce la cantidad a añadir: ");
                if (cantidad >= 0) {
                    cantidades[fila][col] = cantidades[fila][col] + cantidad;
                    System.out.printf("Se han añadido %d unidades de %s. Total ahora: %d%n",
                            cantidad, nombresGolosinas[fila][col], cantidades[fila][col]);
                } else {
                    System.out.println("Cantidad inválida.");
                }
            } else {
                System.out.println("Código inválido.");
            }
        } else {
            System.out.println("Contraseña incorrecta. Acceso denegado.");
        }
    }

    // ------------ Validación y lectura genérica ------------

    public static boolean codigoValido(String codigo) {
        boolean esValido = false;

        if (codigo != null) {
            if (codigo.length() == 2) {
                char c0 = codigo.charAt(0);
                char c1 = codigo.charAt(1);

                if (Character.isDigit(c0) && Character.isDigit(c1)) {
                    int fila = Character.getNumericValue(c0);
                    int col = Character.getNumericValue(c1);

                    if (fila >= 0 && fila < nombresGolosinas.length
                            && col >= 0 && col < nombresGolosinas[0].length) {
                        esValido = true;
                    }
                }
            }
        }

        return esValido;
    }

    public static int leerEntero(Scanner sc, String msg) {
        int numero = 0;
        boolean leido = false;

        System.out.print(msg);
        while (!leido) {
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                leido = true;
            } else {
                System.out.print("Valor no válido. Intenta de nuevo: ");
                sc.next();
            }
        }

        return numero;
    }

    public static String leerCadena(Scanner sc, String msg) {
        System.out.print(msg);
        String texto = sc.next();
        return texto;
    }
}