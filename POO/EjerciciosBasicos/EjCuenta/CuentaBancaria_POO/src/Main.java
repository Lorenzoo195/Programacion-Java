import Tipos.Cliente;
import Tipos.IBAN;
import Tipos.Movimiento;
import java.util.Scanner;
import Exception.DatosInvalidos;

public class Main {
    public static void main(String[] args)   {
        Scanner sc = new Scanner(System.in);
        Cliente cliente = null;
        while (cliente == null) {
            try {
                System.out.print("Nombre: ");
                String nombre = sc.nextLine().trim();

                System.out.print("Apellidos: ");
                String apellidos = sc.nextLine().trim();



                System.out.print("DNI: ");
                String dni = sc.nextLine().trim();

                cliente = new Cliente(nombre,apellidos, dni);
            } catch (DatosInvalidos e) {
                System.out.println("Error " + e.getMessage());
            }
        }
        IBAN iban = null;
        while (iban == null) {
            try {
                System.out.print("IBAN (22 caracteres, todo seguido): ");
                String s = sc.nextLine().trim();

                if (s.length() != 22) throw new IllegalArgumentException();

                iban = new IBAN(s.substring(0,2), s.substring(2,4), s.substring(4,8), s.substring(8,12), s.substring(12));
            } catch (Exception e) {
                System.out.println("Error: IBAN incorrecto. Verifique la longitud (22) y que sean números/letras válidos.");
            }
        }
        CuentaBancaria cuenta = new CuentaBancaria(cliente, iban);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n1.Datos 2.IBAN 3.Titular 4.Saldo 5.Ingreso 6.Retirada 7.Movs 8.Salir");
            try {
                System.out.print("Opción: ");
                String opcion = sc.nextLine().trim();

                switch (opcion) {
                    case "1":
                        System.out.println("IBAN: " + cuenta.getIban() + "\nTitular: " + cuenta.getTitular().getNombre());
                        break;
                    case "2":
                        System.out.println(cuenta.getIban());
                        break;
                    case "3":
                        System.out.println(cuenta.getTitular().getNombre() + " " + cuenta.getTitular().getApellidos());
                        break;
                    case "4":
                        System.out.println("Saldo: " + cuenta.getSaldo() + "€");
                        break;
                    case "5":
                        System.out.print("Cantidad a ingresar: ");
                        double cantIngreso = Double.parseDouble(sc.nextLine().trim());
                        cuenta.ingreso(cantIngreso);
                        System.out.println("Saldo actual: " + cuenta.getSaldo() + "€");
                        break;
                    case "6":
                        System.out.print("Cantidad a retirar: ");
                        double cantRetiro = Double.parseDouble(sc.nextLine().trim());
                        if (cuenta.retirar(cantRetiro)) {
                            System.out.println("Retirada OK. Saldo: " + cuenta.getSaldo() + "€");
                        } else {
                            System.out.println("Saldo insuficiente.");
                        }
                        break;
                    case "7":
                        if (cuenta.getMovimientos().length == 0) {
                            System.out.println("Sin movimientos.");
                        }
                        for (Movimiento m : cuenta.getMovimientos()) {
                            if(m != null) System.out.println(m);
                        }
                        break;
                    case "8":
                        salir = true;
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            } catch (Exception e) {
                System.out.println("Error: Operación no válida. Verifique el dato introducido.");
            }
        }
    }
}