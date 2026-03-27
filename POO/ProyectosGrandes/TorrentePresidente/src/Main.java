public class Main {
    public static void main(String[] args) {

        System.out.println("NIVEL 1");

        CargoPublico[] consejoDeMinistros = new CargoPublico[3];

        consejoDeMinistros[0] = new MinistroCunado("Julito", 95, 50000);
        consejoDeMinistros[1] = new AsesorPelota("Peláez", 80, 100);
        consejoDeMinistros[2] = new FuncionarioAmargado("Paco", 40);

        for (int i = 0; i < consejoDeMinistros.length; i++) {
            consejoDeMinistros[i].trabajar();

            if (consejoDeMinistros[i].getNivelDeCaspa() > 90) {
                System.out.println("¡Nos hacemos unas ...!");
            }
        }


        System.out.println("NIVEL 2");

        GestionGobierno gobierno = new GestionGobierno();

        MinistroCunado ministroEnchufado = new MinistroCunado("Cuñado Luis", 92, 120000);
        gobierno.enchufar(ministroEnchufado);
        gobierno.despedir(ministroEnchufado);

        Ciudadano c1 = new Ciudadano("12345678A", "Manolo");
        Ciudadano c2 = new Ciudadano("12345678A", "Manolo (El falso)"); // Mismo DNI
        gobierno.apuntarDeudor(c1);
        gobierno.apuntarDeudor(c2);

        gobierno.ingresarMordida("Andorra", 3.5);
        gobierno.ingresarMordida("Andorra", 2.0);


        System.out.println("NIVEL 3");

        MaleteroDelFary<String> maleteroCintas = new MaleteroDelFary<>();
        maleteroCintas.esconder("Casete de grandes éxitos de Los Chunguitos");
        String cinta = maleteroCintas.sacarDelMaletero();
        if (cinta != null) System.out.println("Recuperado: " + cinta);

        MaleteroDelFary<Double> maleteroPasta = new MaleteroDelFary<>();
        maleteroPasta.esconder(50000.0);
        Double pasta = maleteroPasta.sacarDelMaletero();
        if (pasta != null) System.out.println("Recuperado: " + pasta + " euros en billetes de 500.");

        MaleteroDelFary<MinistroCunado> maleteroMinistro = new MaleteroDelFary<>();
        MinistroCunado ministroFugado = new MinistroCunado("Julito", 95, 100000);
        maleteroMinistro.esconder(ministroFugado);

        MinistroCunado ministroRescatado = maleteroMinistro.sacarDelMaletero();
        if (ministroRescatado != null) {
            System.out.print("Comprobando que sigue vivo: ");
            ministroRescatado.trabajar();
        }


        System.out.println("NIVEL 4");

        GestorDeCrisis crisis = new GestorDeCrisis();


        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("¿En qué momento de la historia estamos, chaval?");
        System.out.println("1. Antes de la redada (Meter dinero en Andorra y Guardar)");
        System.out.println("2. Después de la redada (Cargar el pendrive y comprobar la pasta)");
        System.out.print("Elige una opción (1 o 2): ");

        int opcion = sc.nextInt();

        if (opcion == 1) {
            System.out.println("Preparar la huida");

            gobierno.enchufar(new MinistroCunado("José Luis", 99, 300000));
            gobierno.ingresarMordida("Andorra", 10.0);

            System.out.println("¡Suenan las sirenas! Guardando datos de emergencia...");
            crisis.crearCopiaDeSeguridad(gobierno.getPlantillaMoncloa(), gobierno.getCuentasOpacas());
            System.out.println("¡Pendrive listo! Ahora cierra el programa para simular que apagas el ordenador.");

        } else if (opcion == 2) {
            System.out.println("Rescate de datos");
            GestionGobierno gobiernoRescatado = new GestionGobierno();

            crisis.rescatarDatos(gobiernoRescatado);

            System.out.println("Comprobando si el dinero sigue a salvo...");
            Double pastaSalvada = gobiernoRescatado.getCuentasOpacas().get("Andorra");
            System.out.println("¡Misión cumplida! Tenemos " + pastaSalvada + " millones a salvo en Andorra.");

        } else {
            System.out.println("Opción incorrecta. Torrente te da una colleja.");
        }

        sc.close();
    }
}
