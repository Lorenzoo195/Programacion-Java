import Tipos.Persona;
import Tipos.Empleado;
import Tipos.Ruta;
import Exception.DatosInvalidos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- DATOS PERSONA ---");
        Persona persona = null;
        while (persona == null) {
            try {
                System.out.print("Nombre: ");
                String nombre = sc.nextLine().trim();
                System.out.print("Apellido: ");
                String apellido = sc.nextLine().trim();
                System.out.print("Edad: ");
                int edad = sc.nextInt();
                sc.nextLine();

                persona = new Persona(nombre, apellido, edad);
                System.out.println("\n>>> DATOS GUARDADOS:");
                System.out.println(persona);
            } catch (DatosInvalidos die) {
                System.out.println("Error " + die.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Tiene que ser valor numérico");
                sc.nextLine();

            }
        }
        System.out.println("\n --- CREAR UN EMPLEADO ---");

        Empleado empleado = null;
        while (empleado == null) {
            try {
                System.out.print("Nombre Empleado: ");
                String nombre = sc.nextLine().trim();
                System.out.print("Apellido Empleado: ");
                String apellido = sc.nextLine().trim();
                System.out.print("Edad: ");
                int edad = sc.nextInt();
                System.out.print("Sueldo: ");
                Double sueldo = sc.nextDouble();
                sc.nextLine();

                empleado = new Empleado(nombre, apellido, edad, sueldo);
                System.out.println("\n>>> EMPLEADO CREADO CON ÉXITO:");
                System.out.println(empleado);

                empleado.imprimirSueldo();

            } catch (DatosInvalidos die) {
                System.out.println("Error: " + die.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Error: Introduce números válidos para edad y sueldo.");
                sc.nextLine();
            }
        }

        System.out.println("\n=================================");
        System.out.println("   CONFIGURACIÓN DE LA RUTA      ");
        System.out.println("=================================");

        System.out.print("Introduce la Hora de Inicio (ej. 08:00): ");
        String horaInicio = sc.nextLine().trim();

        System.out.print("Introduce la Hora de Llegada (ej. 14:00): ");
        String horaFin = sc.nextLine().trim();

        Ruta ruta1 = new Ruta(horaInicio, horaFin);

        System.out.println("\n--- AÑADIR PARADAS (Escribe 'fin' para terminar) ---");

        System.out.print("Nombre de parada: ");
        String paradaInput = sc.nextLine().trim();

        while (!paradaInput.equalsIgnoreCase("fin")) {

            // Si entra aquí, es que NO es "fin", así que guardamos seguro
            ruta1.agregarParada(paradaInput);
            System.out.println("  -> Parada '" + paradaInput + "' añadida.");

            System.out.print("Nombre de parada: ");
            paradaInput = sc.nextLine().trim();
        }

        System.out.println("\nRUTA CREADA: " + ruta1);


        System.out.println("\n--- 🚌 INICIO DEL VIAJE ---");

        System.out.print("¿A qué parada quieres mover el bus ahora?: ");
        String destino = sc.nextLine();
        ruta1.setParadaActual(destino);


        System.out.println("\nEl empleado " + empleado.getNombre() + " está esperando.");
        System.out.print("¿Quieres que suba al autobús? (s/n): ");
        String respuesta = sc.nextLine().trim().toLowerCase();

        if (respuesta.equals("s")) {
            ruta1.subirEmpleado(empleado);
            System.out.println(">> Pasajeros actuales: " + ruta1);


            System.out.print("\n¿A qué parada quieres ir para bajarlo?: ");
            String destinoFinal = sc.nextLine();
            ruta1.setParadaActual(destinoFinal);

            try {
                ruta1.bajarEmpleado(empleado);
            } catch (DatosInvalidos e) {
                System.out.println("Error: " + e.getMessage());
            }
        } else {
            System.out.println("El empleado decidió ir andando.");
        }

        System.out.println("\n=== FIN DEL PROGRAMA ===");
        sc.close();

    }
}