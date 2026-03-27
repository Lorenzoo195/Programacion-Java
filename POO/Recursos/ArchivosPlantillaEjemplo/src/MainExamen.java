import java.io.*;
import java.util.ArrayList;

public class MainExamen {
    public static void main(String[] args) {

        String rutaArchivo = "equipo.dat";

        // --- PARTE 1: CREAR Y GUARDAR ---
        ArrayList<Jugador> equipo = new ArrayList<>();
        equipo.add(new Jugador("Alex", 10));
        equipo.add(new Jugador("Sara", 15));

        ObjectOutputStream sal = null;
        try {
            sal = new ObjectOutputStream(new FileOutputStream(rutaArchivo));
            sal.writeObject(equipo); // Guardamos TODO el ArrayList de golpe
            System.out.println("Equipo guardado correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (sal != null) sal.close();
            } catch (IOException e) { e.printStackTrace(); }
        }

        // --- PARTE 2: LEER Y MOSTRAR ---
        ArrayList<Jugador> equipoRecuperado = null;
        ObjectInputStream ent = null;
        try {
            ent = new ObjectInputStream(new FileInputStream(rutaArchivo));
            // Hacemos CASTING al tipo exacto que guardamos
            equipoRecuperado = (ArrayList<Jugador>) ent.readObject();

            System.out.println("\nDatos recuperados del archivo:");
            for (Jugador j : equipoRecuperado) {
                System.out.println(j.toString());
            }

        } catch (ClassNotFoundException ex) {
            System.out.println("No se ha encontrado la clase ArrayList/Jugador");
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (ent != null) ent.close();
            } catch (IOException ex) { ex.printStackTrace(); }
        }
    }
}
/*
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    // El main asume cualquier error que venga del GestorArchivos
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // 1. Preparamos los datos
        ArrayList<Jugador> equipo = new ArrayList<>();
        equipo.add(new Jugador("Alex", 10));

        // 2. Guardamos usando nuestro gestor limpio
        GestorArchivos.guardarDatos(equipo, "equipo.dat");
        System.out.println("Guardado OK.");

        // 3. Leemos usando nuestro gestor limpio (recuerda el casting)
        ArrayList<Jugador> recuperados = (ArrayList<Jugador>) GestorArchivos.leerDatos("equipo.dat");

        System.out.println("Leído OK. Primer jugador: " + recuperados.get(0).toString());
    }
}
 */