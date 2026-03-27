import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class GestionGobierno {

    private ArrayList<CargoPublico> plantillaMoncloa;
    private HashSet<Ciudadano> genteQueMeDebeFavores;
    private HashMap<String, Double> cuentasOpacas;


    public ArrayList<CargoPublico> getPlantillaMoncloa() { return plantillaMoncloa; }
    public HashMap<String, Double> getCuentasOpacas() { return cuentasOpacas; }


    public void setPlantillaMoncloa(ArrayList<CargoPublico> plantilla) { this.plantillaMoncloa = plantilla; }
    public void setCuentasOpacas(HashMap<String, Double> cuentas) { this.cuentasOpacas = cuentas; }

    public GestionGobierno() {
        this.plantillaMoncloa = new ArrayList<>();
        this.genteQueMeDebeFavores = new HashSet<>();
        this.cuentasOpacas = new HashMap<>();
    }
    public void enchufar(CargoPublico politico) {
        plantillaMoncloa.add(politico);
        System.out.println("¡" + politico.getNombre() + " ha sido enchufado en el gobierno!");
    }

    public void despedir(CargoPublico politico) {
        if (plantillaMoncloa.remove(politico)) {
            System.out.println("A la calle. " + politico.getNombre() + " ha sido despedido.");
        } else {
            System.out.println("Ese no trabaja aquí, chaval.");
        }
    }

    public void apuntarDeudor(Ciudadano c) {
        if (genteQueMeDebeFavores.contains(c)) {
            System.out.println("Torrente, que " + c.getNombre() + " ya está apuntado en la libreta. No te repitas.");
        } else {
            genteQueMeDebeFavores.add(c);
            System.out.println(c.getNombre() + " apuntado a la lista negra.");
        }
    }

    public void ingresarMordida(String lugar, double cantidad) {
        if (cuentasOpacas.containsKey(lugar)) {
            double saldoActual = cuentasOpacas.get(lugar);
            cuentasOpacas.put(lugar, saldoActual + cantidad);
            System.out.println("Ingresados " + cantidad + " millones extra en " + lugar + ".");
        } else {
            cuentasOpacas.put(lugar, cantidad);
            System.out.println("Nueva cuenta abierta en " + lugar + " con " + cantidad + " millones.");
        }
    }
}
