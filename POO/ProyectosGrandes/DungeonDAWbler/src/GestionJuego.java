import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class GestionJuego {
    private ArrayList<Entidad> grupoCazadores;
    private HashSet<Monstruo> monstruosDescubiertos;
    private HashMap<String, Integer> inventario;

    public void setGrupoCazadores(ArrayList<Entidad> nuevoGrupo) {
        this.grupoCazadores = nuevoGrupo;
    }

    public void setInventario(HashMap<String, Integer> nuevoInventario) {
        this.inventario = nuevoInventario;
    }

    public ArrayList<Entidad> getGrupoCazadores() {
        return grupoCazadores;
    }

    public HashSet<Monstruo> getMonstruosDescubiertos() {
        return monstruosDescubiertos;
    }

    public HashMap<String, Integer> getInventario() {
        return inventario;
    }


    public GestionJuego() {
        this.grupoCazadores = new ArrayList<>();
        this.monstruosDescubiertos = new HashSet<>();
        this.inventario = new HashMap<>();

        this.inventario.put("Pocion de Vida", 5);
        this.inventario.put("Eter", 3);
    }

    public void anadirCazador(Entidad e){
        grupoCazadores.add(e);
    }

    public void registrarMonstruo(Monstruo m){
        if(monstruosDescubiertos.contains(m)){
            System.out.println("El monstruo " + m.getnombre() +" ya esta en el bestiario");
        } else {
            monstruosDescubiertos.add(m);
            System.out.println("Monstruo registrado: "+ m.getnombre());
        }
    }

    public void limpiarMuertos() {
        int eliminados = 0;

        for(int i = grupoCazadores.size()-1; i>= 0; i--){
            Entidad p = grupoCazadores.get(i);

            if(p.getPuntosDeVida() <= 0){
                System.out.println(p.getnombre() + " ha muerto y es eliminado de la party.");
                grupoCazadores.remove(i);
                eliminados++;
            }
        }
        if (eliminados == 0) {
            System.out.println("Todos los miembros de tu grupo están vivos. Nadie ha sido eliminado.");
        }
    }

    public void usarObjeto (String nombre){

        if(inventario.containsKey(nombre)){

            int cantidadActual = inventario.get(nombre);

            if(cantidadActual > 0){
                inventario.put(nombre,cantidadActual-1);
                System.out.println("Has consumido: " + nombre + ". Te quedan: " + (cantidadActual - 1));
            } else{
                System.out.println("¡No te quedan más " + nombre + "!");
            }
        } else {
            System.out.println("Objeto no existente");
        }

    }
    public void mostrarGrupo() {
        if (grupoCazadores.isEmpty()) {
            System.out.println("Tu grupo está vacío.");
        } else {
            for (Entidad e : grupoCazadores) {
                System.out.println(e.getnombre() + " con vida: " + e.getPuntosDeVida());
            }
        }
    }




}
