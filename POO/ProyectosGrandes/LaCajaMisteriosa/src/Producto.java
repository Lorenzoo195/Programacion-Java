public class Producto {
    private String _nombre;
    private int _precio;

    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String nombre) {
        this._nombre = nombre;
    }

    public int getPrecio() {
        return _precio;
    }

    public void setPrecio(int precio) {
        this._precio = precio;
    }

    public Producto(String nombre, int precio) {
        setNombre(nombre);
        setPrecio(precio);
    }

    @Override
    public String toString() {
        return "Nombre: " + _nombre  +
                " || Precio: " + _precio;
    }
}
