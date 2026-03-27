import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ContenedorMarcus <T> implements Serializable {
    private List <T> listaTareas;

    public ContenedorMarcus() {
        this.listaTareas = new ArrayList<>();
    }

    public void agregarElemento (T elemento){
        listaTareas.add(elemento);
        System.out.println("Añadida tarea");
    }
    public void eliminarElemento(T elemento) {
        listaTareas.remove(elemento);
        System.out.println("Eliminado de las tareas");
    }
    public void listarElementos() {
        System.out.println("Listado de tareas");
        for (T elemento : listaTareas) {
            System.out.println(elemento);
        }
    }
}
