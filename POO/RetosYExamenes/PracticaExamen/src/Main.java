import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, Exceptions.FileNotFoundException {



/*
        Persona [] GimLoren = new Persona [5];
            GimLoren [0] = new Entrenador(1239129038, "lorenzo", 30);
            GimLoren [1] = new Socio(8923479,"Marcos", 19);
            GimLoren [2] = new Socio(8923479,"Diego", 19);
            GimLoren [3] = new Socio(8923479,"Javier", 19);
            GimLoren [4] = new Socio(8923479,"Marcos", 19);
            for(int i = 0; 0> GimLoren.length; i++){
                GimLoren[i].mostrarRutina();
        }
        */

        ContenedorMarcus cosas = new ContenedorMarcus<>();
        cosas.agregarElemento("pesa 20 kg");
        cosas.agregarElemento("pelota");
        cosas.eliminarElemento("pesa 20 kg");
        cosas.listarElementos();




        List <Persona> listaInicial = new ArrayList<>();

        GestionGimnasio marcusGym = new GestionGimnasio();


        Persona p1 = new Entrenador(2456436, "lorenzo", 30);
        Persona p3 = new Socio(3465465,"Marcos", 19);
        Persona p4 = new Socio(7645773,"Diego", 19);
        Persona p5 = new Socio(4364377,"Javier", 19);
        Persona p7 = new Socio(3456436,"Marcos", 19);

        marcusGym.darDeAlta(p1);
        marcusGym.darDeAlta(p3);
        marcusGym.darDeAlta(p4);
        marcusGym.darDeAlta(p5);
        marcusGym.darDeBaja(p7);

        for(Persona t : marcusGym.getGimnasioActual()){
            t.mostrarRutina();
            System.out.println(t.getNombre());
        }

        HashSet<Socio> ClubElite = new HashSet<>();
        Socio socioOG = new Socio(1111, "Marcos", 19);
        Socio socioCopia = new Socio(1111, "Lorenzo", 19);
        ClubElite.add(socioOG);
        ClubElite.add(socioCopia);
        System.out.println("Tamaño club elite es: " + ClubElite.size());

        marcusGym.asignarTaquillas(4,socioOG);
        marcusGym.asignarTaquillas(4,socioOG);

        String archivo = "marcus_data.dat";
        ContenedorMarcus<Persona> gimnasio = new ContenedorMarcus<>();
        gimnasio.agregarElemento(new Socio(1234541, "lorenzo", 30));

        GestionFicheros.guardarDatos(gimnasio,archivo);
        gimnasio = null;
        gimnasio = GestionFicheros.cargarDatos(archivo);
        gimnasio.listarElementos();



    }
}