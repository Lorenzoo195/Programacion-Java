import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Legislador> legisladores = new ArrayList<>();
        legisladores.add(new Diputado("Lucía Pérez", 35, "Teruel"));
        legisladores.add(new Senador("María García", 58, "Huesca"));

        for(Legislador leg: legisladores){
            System.out.println("Nombre: " + leg.getnombre());
            System.out.println("Provincia: "+ leg.getProvinciaQueRepresenta());
            System.out.println("Camara: " + leg.getCamaraEnQueTrabaja() +"\n");
        }

    }
}