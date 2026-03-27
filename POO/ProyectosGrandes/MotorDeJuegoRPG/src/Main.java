import java.util.ArrayList;
import java.util.Scanner;
import Exception.SinEnergiaMagica;
public class Main {
    public static void main(String[] args) {
        ArrayList <UnidadCombate> ejercito = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        boolean salir = false;
        while (!salir) {

        System.out.println("\n--- CONTROL DE FUNCIONES ---");
        System.out.println("1.Reclutamiento");
        System.out.println("2.Reporte de Tropa");
        System.out.println("3.Simulacion de Batalla");
        System.out.println("4.Turno Magico");
        System.out.println("5.Fin");
        System.out.print("Seleccione una opcion: ");
        int opcion = sc.nextInt();
        sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("1. Guerrero. || 2. Mago. ---->");
                    int tipo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Dime su nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Dime el maximo de vidas: ");
                    int maximoVidas = sc.nextInt();
                    sc.nextLine();

                    if (tipo == 1) {
                        System.out.print("Dime la fuerza: ");
                        int fuerza = sc.nextInt();
                        sc.nextLine();
                        ejercito.add(new Guerrero(nombre, maximoVidas, fuerza));
                    } else if (tipo == 2) {
                        ejercito.add(new Magos(nombre, maximoVidas));
                    } else {
                        System.out.print("Opcion no valida");
                    }
                    break;
                case 2:
                    System.out.println("--Estado del ejercito--");
                    if (ejercito.isEmpty()) {
                        System.out.println("El ejército está vacío. ¡Recluta a alguien!");
                    } else {
                        for(UnidadCombate uC : ejercito ){
                            System.out.println(uC.mostrarEstado());
                        }
                    }
                    break;
                case 3:
                    System.out.println("--Simulacion de la batalla--");
                    if (ejercito.isEmpty()) {
                        System.out.println("No hay nadie para luchar");
                    } else {
                        for (UnidadCombate uC : ejercito) {
                            uC.atacar();
                        }
                    }
                    break;
                case 4:
                    System.out.println("--Turno magico--");
                    if(ejercito.isEmpty()){
                        System.out.println("Noo hay unidades");
                    } else {
                        for(UnidadCombate uC : ejercito){
                            if (uC instanceof Magia){
                                Magia hechicero = (Magia) uC;
                                try {
                                    hechicero.lanzarHechizo();
                                }catch (SinEnergiaMagica esm){
                                    System.out.println("Fallo" +esm.getMessage());
                                    System.out.println(uC.getnombre() + " obligado a meditar ");
                                    hechicero.meditar();
                                } catch (Exception e){
                                    System.out.println("Error " + e.getMessage());
                                }
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.println("¡Fin!");
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
        sc.nextLine();
    }
}