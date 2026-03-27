import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GestionGimnasio {

    private List<Persona> GimnasioActual;

    public GestionGimnasio() {
        GimnasioActual = new ArrayList<>();
    }

    public List<Persona> getGimnasioActual() {
        return GimnasioActual;
    }

    public void setGimnasioActual(List<Persona> gimnasioActual) {
        GimnasioActual = gimnasioActual;
    }

    public void darDeAlta(Persona pers){
        GimnasioActual.add(pers);
        System.out.println("Añadido");
    }
    public void darDeBaja (Persona pers){
        GimnasioActual.remove(pers);
        System.out.println("Eliminado");
    }

    HashMap<Integer, Socio> mapaTaquillas = new HashMap<>();
    public  void asignarTaquillas (int numero, Socio s){
        if(numero <1 || numero > 50){
            System.out.println("Error. Taquillas entre 1 y 50");
        } else {
            if(mapaTaquillas.containsKey(numero)){
                System.out.println("Taquilla ocupada");
            } else {
                mapaTaquillas.put(numero, s);
                System.out.println("Taquilla asignada al socio");


            }
        }
    }
}
