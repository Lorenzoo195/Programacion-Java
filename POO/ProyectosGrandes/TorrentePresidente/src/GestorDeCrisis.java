import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class GestorDeCrisis {

    public void crearCopiaDeSeguridad(ArrayList<CargoPublico> plantilla, HashMap<String, Double> cuentas) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream("caja_b_moncloa.dat"));
            escritor.writeObject(plantilla);
            escritor.writeObject(cuentas);
            escritor.close();
            System.out.println("¡Datos guardados en el pendrive! Destruyendo disco duro...");
        } catch (Exception e) {
            System.out.println("Error al hacer la copia de seguridad.");
        }
    }

    @SuppressWarnings("unchecked")
    public void rescatarDatos(GestionGobierno gestor) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream("caja_b_moncloa.dat"));

            ArrayList<CargoPublico> plantillaRescatada = (ArrayList<CargoPublico>) lector.readObject();
            HashMap<String, Double> cuentasRescatadas = (HashMap<String, Double>) lector.readObject();
            lector.close();

            gestor.setPlantillaMoncloa(plantillaRescatada);
            gestor.setCuentasOpacas(cuentasRescatadas);
            System.out.println("¡Pendrive enchufado! Hemos recuperado el país y la pasta.");

        } catch (ClassNotFoundException e) {
            System.out.println("¡Nos han pillado, chaval! El juez Ruz tiene los papeles.");
        } catch (IOException e) {
            System.out.println("No hay pendrive o la policía se lo ha llevado.");
        }
    }
}