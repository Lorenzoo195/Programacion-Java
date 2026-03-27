import java.io.*;
import Exceptions.FileNotFoundException;
public class GestionFicheros {

    public static void guardarDatos(ContenedorMarcus<Persona> datos, String ruta){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta))) {
            oos.writeObject(datos);
        } catch (Exception e){
            System.out.println("Error" + e.getMessage());
        }
    }
    public static  ContenedorMarcus<Persona> cargarDatos (String ruta) throws FileNotFoundException {
        try(ObjectInputStream ios = new ObjectInputStream(new FileInputStream(ruta))){
            return (ContenedorMarcus<Persona>) ios.readObject();
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
            return null;
        }
    }

}
