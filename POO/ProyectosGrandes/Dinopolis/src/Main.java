import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import Exception.DinosaurioNoEncontradoException;
import Exception.ActividadInvalidaException;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        GestorParque<Dinosaurio> miParque = new GestorParque<>();

        /*
        GestorParque.add(new Carnivora("Diplodocus", 4, "Lejano"));
        GestorParque.add(new Herbivoro("T-Rex", 7, "Mas Lejano"));
        GestorParque.add(new Herbivoro("Velociraptor", 2, "Pre historia"));
        */
        Actividad picnicHojas = new Actividad("Picnic de Hojas", "Herbivoro", 2);
        Actividad cazaSombra = new Actividad("Caza en la Sombra", "Carnivora", 1);
        while (!salir) {
            System.out.println("\n--- Control de Dinopolis ---");
            System.out.println("1. Añadir herbivoros y carnivoros");
            System.out.println("2. Mostrar tods los dinosaurios con la info detallada");
            System.out.println("3. Listar dinosaurios por periodo");
            System.out.println("4. Mostrar el dinosaurio mas grande (atraccion estrella).");
            System.out.println("5. Salir");
            System.out.print("Seleccione opción: ");
            try {
                int opcion = sc.nextInt();
                sc.nextLine();
                switch (opcion) {
                    case 1:

                        System.out.println("Que quieres registrar? 1. Carnivoro || 2. Hervivoro");
                        int opcionDino = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Dime el nombre");
                        String nombre = sc.nextLine();

                        System.out.println("Dime el tamaño");
                        int tamanho = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Dime el periodo");
                        String periodo = sc.nextLine();

                        if(opcionDino == 1){
                            miParque.anadir(new Carnivora(nombre,tamanho,periodo));
                        } else if (opcionDino == 2) {
                            miParque.anadir(new Herbivoro(nombre,tamanho,periodo));
                        }  else {
                            System.out.println("Tipo no valido");
                        }
                        break;
                    case 2:
                        System.out.println("Todos lso dinosaurios");
                        for(Dinosaurio dino : miParque.getListaDinosaurios()) {
                            if (dino instanceof Acciones) {
                                ((Acciones) dino).monstrarInformacion();
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Buscar periodo");
                        String periodoABuscar = sc.nextLine();

                        List<Dinosaurio> perodods = miParque.buscarPorPeriodo(periodoABuscar);
                        if(perodods.isEmpty()){
                            System.out.println("No hay dinosaurios en ese periodo");
                        } else {
                            for(Dinosaurio dino : perodods){
                                System.out.println("- " + dino.getnombre() + " (" + dino.getTamanhoEnMetro() + "m)");
                            }
                        }
                        break;
                    case 4:
                        System.out.println("\n--- Atracción Estrella ---");
                        List<Dinosaurio> masGrandes = miParque.obtenerMasGrandes();
                        if(masGrandes.isEmpty()){
                            System.out.println("El parque está vacío.");
                        } else {
                            for (Dinosaurio dino : masGrandes){
                                if(dino instanceof Acciones){
                                    ((Acciones) dino).atraccionEstrella();
                                }
                            }
                        }
                        break;
                    case 5:
                        System.out.print("Dime el nombre del dinosaurio a buscar: ");
                        String nombreBuscar = sc.nextLine();
                        try {
                            Dinosaurio encontrado = miParque.buscarDinosaurio(nombreBuscar);
                            System.out.println("Localizado: " + encontrado.getnombre() + " del periodo " + encontrado.getPeriodo());
                        } catch (DinosaurioNoEncontradoException e) {
                            System.out.println("ERROR: " + e.getMessage());
                        }
                        break;

                    case 6:
                        System.out.println("\n--- Inscripción en Actividades ---");
                        System.out.println("1. Picnic de Hojas (Solo Herbívoros)");
                        System.out.println("2. Caza en la Sombra (Solo Carnívoros)");
                        System.out.print("Seleccione actividad: ");
                        int selAct = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Nombre del dinosaurio a inscribir: ");
                        String nombreDino = sc.nextLine();

                        try {

                            Dinosaurio dinoParaActividad = miParque.buscarDinosaurio(nombreDino);

                            if (selAct == 1) {
                                picnicHojas.inscribirDinosaurio(dinoParaActividad);
                            } else if (selAct == 2) {
                                cazaSombra.inscribirDinosaurio(dinoParaActividad);
                            } else {
                                System.out.println("Actividad no válida.");
                            }

                        } catch (DinosaurioNoEncontradoException e) {
                            System.out.println("ERROR DE BÚSQUEDA: " + e.getMessage());
                        } catch (ActividadInvalidaException e) {

                            System.out.println("ERROR DE REQUISITOS: " + e.getMessage());
                        } catch (IllegalStateException e) {

                            System.out.println("ERROR DE AFORO: " + e.getMessage());
                        }
                        break;

                    case 7:
                        salir = true;
                        System.out.println("Cerrando Dinopolis");
                        break;

                }

            } catch (InputMismatchException e) {
                System.out.println("Debe introucir un numero para seleccionar una opcion");
                sc.nextLine();
            }catch (Exception e){
                System.out.println("Error" + e.getMessage());
            }

        }

    }
}