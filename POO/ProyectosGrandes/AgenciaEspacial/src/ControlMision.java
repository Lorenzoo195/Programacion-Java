import Exceptions.BateriaBajaException;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ControlMision {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList <Tripulante>  flota = new ArrayList<>();
        boolean salir = false;

        while(!salir){
            System.out.println("\n--- CONTROL DE MISIÓN ---");
            System.out.println("1. Registrar Tripulante");
            System.out.println("2. Informe de Estado");
            System.out.println("3. Realizar Tareas (¡Cuidado Baterías!)");
            System.out.println("4. Recargar Unidades");
            System.out.println("5. Salir");
            System.out.print("Seleccione opción: ");
            try {
                int opcion = sc.nextInt();
                sc.nextLine();
                switch (opcion){
                    case 1:
                        System.out.println("Que quieres registrar? 1. Androide || 2. Astronauta");
                        int opcionTripu = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Dime el nombre");
                        String nombre = sc.nextLine();
                        System.out.println("Dime nivel de salud (0-100)");
                        int salud = sc.nextInt();
                        sc.nextLine();
                        if(opcionTripu == 1){
                            flota.add(new Androide(nombre,salud));
                        } else if (opcionTripu == 2) {
                            System.out.println("Dime la especialidad");
                            String especialidad  = sc.nextLine();
                            flota.add(new Astronauta(nombre,salud,especialidad));
                        } else {
                            System.out.println("Tipo no valido");
                        }
                        break;
                    case 2:
                        System.out.println("Informe de Estado");
                        for(Tripulante t : flota){
                            System.out.println(t.mostrarEstado());
                        }
                        break;
                    case 3:
                        for(Tripulante t :flota){
                            try {
                                t.trabajar();
                            } catch (BateriaBajaException e){
                                System.out.println("ALERTA" + e.getMessage());
                            }
                        }
                        break;
                    case 4:
                        for(Tripulante t: flota){
                            if(t instanceof Recargable){
                                ((Recargable)t).recargarEnergia(100);
                                System.out.println("Recarga Bateria de: " +t.mostrarEstado());
                            }
                        }
                        break;
                    case 5:
                        salir = true;
                        System.out.println("Cerrando sistema");
                        break;
                    default:
                        System.out.println("Opcion no valida");
                }
            } catch (InputMismatchException e){
                System.out.println("Debes introducir un numero");
                sc.nextLine();
            } catch (Exception e){
                System.out.println("Error" + e.getMessage());
            }
        }

    }
}