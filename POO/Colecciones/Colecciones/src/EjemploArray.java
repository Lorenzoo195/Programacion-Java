/**
 * Ejemplo de uso de la clase ArrayList
 *
 */

import java.util.ArrayList;

public class EjemploArray {
    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList<String>();

// a[0] = "rojo";
        a.add("rojo");
        a.add("verde");

        a.add("azul");
        a.add("blanco");
        a.add("amarillo");
        a.add("blanco");
        a.add(2, "negro");

//System.out.println("Contenido de la lista: ");
//for (int i = 0; i < a.size(); i ++) {
// System.out.println(a.get(i));
//}
        for (String color : a) {
            System.out.println(color);
        }

        a.remove("blanco");

      /*  if (a.contains("blanco")) {
            int posicion = a.indexOf("blanco");
            a.remove(posicion);
        }*/
        System.out.println(a);
        System.out.println("------------------------");
        if (a.contains("blanco")) {
            System.out.println("El blanco está en la lista de colores, posición: " + a.indexOf("blanco"));
        }
        a.remove("blanco");
        System.out.println("Contenido de la lista después de quitar la primera ocurrencia del color blanco: ");
        for (String color : a) {
            System.out.println(color);
        }
        a.remove(2);
        System.out.println("Contenido de la lista después de quitar el elemento de la posición 2: ");
        for (String color : a) {
            System.out.println(color);
        }
        System.out.println("----------");
        a.sort(null);
        System.out.println(a);
    }
}