import java.io.*;

public class GestorArchivos {

    // 2. MÉTODO PARA GUARDAR (ESCRITURA)
    public static void guardarDatos(Object datosGuardar, String nombreArchivo) {
        ObjectOutputStream salida = null;
        try {
            salida = new ObjectOutputStream(new FileOutputStream(nombreArchivo));
            salida.writeObject(datosGuardar);
        } catch (IOException e) {
            System.out.println("Error de E/S: " + e.getMessage());
        } finally {
            try {
                if (salida != null) {
                    salida.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar: " + e.getMessage());
            }
        }
    }

    // 3. MÉTODO PARA LEER (LECTURA)
    public static Object leerDatos(String nombreArchivo) {
        ObjectInputStream entrada = null;
        Object datosLeidos = null;
        try {
            entrada = new ObjectInputStream(new FileInputStream(nombreArchivo));
            datosLeidos = entrada.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
        } catch (ClassNotFoundException e) {
            System.out.println("No se encuentra la clase.");
        } catch (IOException e) {
            System.out.println("Error de E/S: " + e.getMessage());
        } finally {
            try {
                if (entrada != null) {
                    entrada.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar: " + e.getMessage());
            }
        }
        return datosLeidos; // Retorna un Object genérico (hay que hacer casting luego)
    }
}
/*
import java.io.*;

public class GestorArchivos {

    // 1. ESCRITURA: Solo lanza IOException. Nos cargamos todos los catch.
    public static void guardarDatos(Object datosGuardar, String nombreArchivo) throws IOException {
        ObjectOutputStream salida = null;
        try {
            salida = new ObjectOutputStream(new FileOutputStream(nombreArchivo));
            salida.writeObject(datosGuardar);
        } finally {
            // El finally es sagrado para cerrar, pero ya no necesita su propio try-catch
            if (salida != null) salida.close();
        }
    }

    // 2. LECTURA: Lanza IOException y ClassNotFoundException (esta última es obligatoria para readObject)
    public static Object leerDatos(String nombreArchivo) throws IOException, ClassNotFoundException {
        ObjectInputStream entrada = null;
        Object datosLeidos = null;
        try {
            entrada = new ObjectInputStream(new FileInputStream(nombreArchivo));
            datosLeidos = entrada.readObject();
        } finally {
            if (entrada != null) entrada.close();
        }
        return datosLeidos;
    }
}
 */