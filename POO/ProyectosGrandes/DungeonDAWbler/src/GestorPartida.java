import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class GestorPartida {
    public void guardarPartida(ArrayList<Entidad> party, HashMap<String, Integer> inventario) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream("savegame_01.dat"));

            escritor.writeObject(party);
            escritor.writeObject(inventario);
            escritor.close();

            System.out.println("¡Partida guardada correctamente en la hoguera!");
        } catch (Exception e) {
            System.out.println("Error al guardar la partida.");
        }
    }
    public void cargarPartida(GestionJuego gestor) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream("savegame_01.dat"));

            ArrayList<Entidad> partyCargada = (ArrayList<Entidad>) lector.readObject();
            HashMap<String, Integer> inventarioCargado = (HashMap<String, Integer>) lector.readObject();
            lector.close();

            gestor.setGrupoCazadores(partyCargada);
            gestor.setInventario(inventarioCargado);

            System.out.println("¡Partida cargada con éxito! Tus héroes despiertan.");

        } catch (Exception e) {
            System.out.println("No hay ninguna partida guardada o hubo un error al leer.");
        }
    }
}
