import java.util.List;
public class CajaMisteriosa<T> implements Acciones {

    private T contenido;

    public T getContenido() {
        return contenido;
    }

    public void setContenido(T contenido) {
        this.contenido = contenido;
    }

    @Override
    public void mostrarContenido() {
        System.out.println(contenido);
    }

    @Override
    public void abriCaja() {
        System.out.println("Se esta abriendo la caja...");
    }
}
