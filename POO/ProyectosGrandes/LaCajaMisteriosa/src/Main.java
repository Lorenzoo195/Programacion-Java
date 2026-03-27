import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        CajaMisteriosa<Producto> miCaja = new CajaMisteriosa<Producto>();
        CajaMisteriosa<Integer> miCaja2 = new CajaMisteriosa<Integer>();
        CajaMisteriosa<Object> miCaja3 = new CajaMisteriosa<Object>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un nombre");
        String nombre = sc.nextLine();
        System.out.println("Dime un precio");
        int precio = sc.nextInt();
        sc.nextLine();

        miCaja.setContenido(new Producto(nombre,precio));
        Producto po = miCaja.getContenido();
        if(po instanceof Acciones){
                ((Acciones)po).mostrarContenido();
        }

        miCaja.mostrarContenido();

        miCaja2.setContenido(100);
        miCaja3.setContenido("¡Dinero!");

        /*miCaja.abriCaja();
        miCaja.mostrarContenido();
        miCaja2.abriCaja();
        miCaja2.mostrarContenido();
        miCaja3.abriCaja();
        miCaja3.mostrarContenido();*/



    }
}