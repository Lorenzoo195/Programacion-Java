import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente clientePrueba = new Cliente("Ana Garcia", "ana.garcia@email.com");

        System.out.println("Añadiendo teléfonos...");
        clientePrueba.addTelefono("669669669");
        clientePrueba.addTelefono("634634634");
        clientePrueba.addTelefono("669789967");


        clientePrueba.addTelefono("634634634");

        System.out.println("\n--- Prueba de Búsqueda ---");
        List<String> resultadosBusqueda = clientePrueba.buscarTelefono("669");
        System.out.println("Buscando '669'. Resultados encontrados: " + resultadosBusqueda);

        System.out.println("\n--- Prueba de getTelefono ---");
        String telCorrecto = clientePrueba.getTelefono(1);
        System.out.println("Teléfono en la posición 1: " + telCorrecto);

        String telIncorrecto = clientePrueba.getTelefono(5);
        System.out.println("Teléfono en la posición 5 (no existe): '" + telIncorrecto + "'");
    }
}