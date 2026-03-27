import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



       /* Entidad [] turnoAdversarion = new Entidad[5];
        turnoAdversarion [0] = new Mago("Lorenzo",100,50);
        turnoAdversarion [1] = new Guerrero("Ruben", 100, 60);
        turnoAdversarion [2] = new Monstruo("Javier", 200, 100);
        turnoAdversarion [3] = new Mago("Marcos", 100, 40);
        turnoAdversarion [4] = new Guerrero("Diego", 100, 70);

        for(int i = 1 ;i<turnoAdversarion.length;i++){
            turnoAdversarion[i].atacar(turnoAdversarion[1]);
        }*/

        GestionJuego gestor = new GestionJuego();
        GestorPartida gestorPartidas = new GestorPartida();
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while(!salir) {
            System.out.println("1. Añadir héroe o monstruo.");
            System.out.println("2. Usar Poción de Vida.");
            System.out.println("3. Limpiar caídos.");
            System.out.println("4. Abrir Sala de Cofres.");
            System.out.println("5. Mostrar Grupo.");
            System.out.println("6. Guardar Partida (En la hoguera).");
            System.out.println("7. Cargar Partida (Desde la hoguera).");
            System.out.println("8. Salir.");
            System.out.print("Elige una opción: ");
            try {

                int opcion = sc.nextInt();
                sc.nextLine();
                switch (opcion){
                    case 1:
                        System.out.println("¿Qué deseas añadir? 1. Guerrero || 2. Mago || 3. Monstruo");
                        int opcionAdd = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Dime un nombre");
                        String nombre = sc.nextLine();
                        System.out.println("Dime los puntos de vida");
                        int puntosDeVida = sc.nextInt();
                        sc.nextLine();

                        if(opcionAdd == 1){
                            System.out.println("Dime la fuerza");
                            int fuerza= sc.nextInt();
                            sc.nextLine();
                            gestor.anadirCazador(new Guerrero(nombre,puntosDeVida,fuerza));
                        } else if (opcionAdd == 2) {
                            System.out.println("Dime el mana");
                            int mana = sc.nextInt();
                            sc.nextLine();
                            gestor.anadirCazador(new Mago(nombre,puntosDeVida,mana));
                        } else if (opcionAdd == 3) {
                            System.out.println("Dime el nivel de maldad");
                            int nivelMaldad = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Dime ID del monstruo: 1. Duende || 2. Orco");
                            int idMonstruo = sc.nextInt();
                            sc.nextLine();
                            if (idMonstruo == 1) {
                                Monstruo nuevoDuende = new Monstruo(nombre, puntosDeVida, nivelMaldad, idMonstruo);
                                gestor.anadirCazador(nuevoDuende);
                                gestor.registrarMonstruo(nuevoDuende);
                                System.out.println("Duende añadido correctamente.");
                            } else if (idMonstruo == 2) {
                                Monstruo nuevoOrco = new Monstruo(nombre, puntosDeVida, nivelMaldad, idMonstruo);
                                gestor.anadirCazador(nuevoOrco);
                                gestor.registrarMonstruo(nuevoOrco);
                                System.out.println("Orco añadido correctamente.");
                            } else {
                                System.out.println("Opción inválida");
                            }
                        }
                        break;
                    case 2:
                        gestor.usarObjeto("Pocion de Vida");
                        break;
                    case 3:
                        gestor.limpiarMuertos();
                        break;
                    case 4:
                        System.out.println("Abriendo cofres");

                        Cofre<String> cofreTesoro = new Cofre<>("100 monedas de oro");
                        cofreTesoro.abrir();
                        String objeto1 = cofreTesoro.saquear();
                        if(objeto1 != null){
                            System.out.println("Has conseguido: " + objeto1);
                        }
                        System.out.println();

                        Monstruo duendeTrampa = new Monstruo("Duende", 50, 80, 1);
                        Cofre<Monstruo> cofreTrampa = new Cofre<>(duendeTrampa);
                        cofreTrampa.abrir();
                        Monstruo monstruoExtraido = cofreTrampa.saquear();

                        if (monstruoExtraido != null) {
                            gestor.anadirCazador(monstruoExtraido);
                            gestor.registrarMonstruo(monstruoExtraido);
                        }
                        System.out.println();

                        Guerrero guerreroPrisionero = new Guerrero("Arturo", 100, 45);
                        Cofre<Guerrero> cofreAliado = new Cofre<>(guerreroPrisionero);
                        cofreAliado.abrir();
                        Guerrero guerreroExtraido = cofreAliado.saquear();

                        if (guerreroExtraido != null) {
                            gestor.anadirCazador(guerreroExtraido);
                        }

                        break;

                    case 5:
                        gestor.mostrarGrupo();
                        break;
                    case 6:
                        System.out.println(" Guardando partida");
                        gestorPartidas.guardarPartida(gestor.getGrupoCazadores(), gestor.getInventario());
                        break;

                    case 7:
                        System.out.println(" Cargando partida");
                        gestorPartidas.cargarPartida(gestor);
                        break;

                    case 8:
                        salir = true;
                        System.out.println("¡Saliendo!");
                        break;

                    default:
                        System.out.println("Opción no válida.");
                }

            }catch (InputMismatchException e){
                System.out.println("Debes introducir un numero para las opciones");
                sc.nextLine();

            }
        }

    }
}