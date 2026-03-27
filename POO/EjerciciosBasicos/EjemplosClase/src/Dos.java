public class Dos <T>{
    public T primero, segundo;
    public Dos(T p, T s){
        primero = p;
        segundo = s;
    }

    public T getPrimero() {
        return primero;
    }

    public void setPrimero(T p) {
        primero = p;
    }

    public T getSegundo() {
        return segundo;
    }

    public void setSegundo(T s) {
        segundo = s;
    }

    @Override
    public String toString() {
        return "Dos " +
                "primero " + primero +
                ", segundo " + segundo;
    }
}
