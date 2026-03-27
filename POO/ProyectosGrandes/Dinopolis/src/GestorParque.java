import java.util.ArrayList;
import java.util.List;
import Exception.DinosaurioNoEncontradoException;
public class GestorParque<T extends Dinosaurio>{

    private List <T> listaDinosaurios;
    private List <Actividad> listaActividades;

    public List<T> getListaDinosaurios() {
        return listaDinosaurios;
    }

    public void setListaDinosaurios(List<T> listaDinosaurios) {
        this.listaDinosaurios = listaDinosaurios;
    }

    public List<Actividad> getListaActividades() {
        return listaActividades;
    }

    public void setListaActividades(List<Actividad> listaActividades) {
        this.listaActividades = listaActividades;
    }

    public T buscarDinosaurio (String nombre) throws DinosaurioNoEncontradoException{
        T dinoEncontrado = null;
        for(T dino : listaDinosaurios){
            if(dino.getnombre().equalsIgnoreCase(nombre)){
                dinoEncontrado=  dino;
            }
        }
        if(dinoEncontrado == null){
            throw new DinosaurioNoEncontradoException("El dinosaurio en esta en el parque");
        }
       return dinoEncontrado;
    }

    public void crearActividad(Actividad nuevaActividad) {
        listaActividades.add(nuevaActividad);
    }

    public GestorParque() {
        this.listaDinosaurios = new ArrayList<>();
        this.listaActividades = new ArrayList<>();
    }

    public void anadir (T dinosaurio){
        listaDinosaurios.add(dinosaurio);
        System.out.println(dinosaurio.getnombre() + " añadido");
    }

    public List<T> buscarPorPeriodo(String perido) {
        List <T> resultados = new ArrayList<>();
        for(T dino : listaDinosaurios){
            if(dino.getPeriodo().equalsIgnoreCase(perido)){
                resultados.add(dino);
            }
        }
        return resultados;
    }

    public List <T> obtenerMasGrandes (){
        List <T> masGrandes= new ArrayList<>();
        double maxTamanho = 0;

        for(T dino :listaDinosaurios){
            if (dino.getTamanhoEnMetro() > maxTamanho){
                maxTamanho = dino.getTamanhoEnMetro();
            }
        }

        for(T dino :listaDinosaurios){
            if(dino.getTamanhoEnMetro() == maxTamanho){
                masGrandes.add(dino);
            }

        }
        return masGrandes;

    }

    @Override
    public String toString() {
        return "GestorParque || " +
                "listaDinosaurios || " + listaDinosaurios;
    }
}
