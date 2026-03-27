import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {


        Persona unaPersona = new Persona(1.80, "pepe", 30, "zaragoza");
        ObjectOutputStream sal = null;
        try{
            sal = new ObjectOutputStream(new  FileOutputStream("C:temp\\datos1_objetos.dat"));
            sal.writeObject(unaPersona);
        }  finally {
            if( sal != null){
                sal.close();
            }
        }

/*
        Persona unaPersona = new Persona(1.80,"pepe", 30);
        ObjectOutputStream sal = null;
        try {
            sal = new ObjectOutputStream(new FileOutputStream("C:temp\\datos_objetos.dat"));
            sal.writeObject(unaPersona);
        } finally {
            {
                if (sal != null){
                    sal.close();
                }
            }
        }
*/

       /* File f = new File("C:temp\\main.java");
        if(f.exists()){
            System.out.println("nombre fichero: " +f.getName());
            System.out.println("Tamaño: " + f.length());
            System.out.println("Ruta absoluta: "  +f.getPath());
            System.out.println("Ruta directorio: " +f.getParent());
            System.out.println("Tiene permisos de lectura: "+ f.canRead());
            System.out.println("Tiene permisos de escritura: " +f.canWrite());
            System.out.println("Es un directorio: " +f.isDirectory());
            System.out.println("Es un fichero: " + f.isFile());
        }*/
        /*
        Dos<String> Conc = new Dos<String >("hola","adios");
        Dos<Integer> ConI = new Dos<Integer>(4,9);
        Dos<Integer> Conc2 = new Dos<>(4,9);


        String v1 = Conc.getPrimero();
        String v2 = Conc.getSegundo();
        int v3 = ConI.getPrimero();
        int v4 = ConI.getSegundo();
        Conc.setPrimero(String.valueOf(5));
        Conc.setSegundo(String.valueOf(7));
        System.out.println(Conc.toString());*/


       /*
       Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();

        linkedHashMap.put(1,"Casillas");
        linkedHashMap.put(3,"Pique");
        linkedHashMap.put(11,"Capdevilla");
        linkedHashMap.put(16,"Busquets");
        linkedHashMap.put(18,"Pedrito");
        linkedHashMap.put(7,"Villa");
        linkedHashMap.put(15, "Ramos");
        linkedHashMap.put(5, "Puyol");
        linkedHashMap.put(14, "Xabi Alonso");
        linkedHashMap.put(8, "Xavi Hernandez");
        linkedHashMap.put(6, "Iniesta");

        Iterator it = linkedHashMap.keySet().iterator();

        */



       /*
       HashMap<Integer, String> m = new HashMap<Integer, String>();

        m.put(924,"Marcos Martinez ");
        m.put(921,"Laura Núñez ");
        m.put(700,"Esteban Vázquez ");
        m.put(219,"Cintia Fernández ");
        m.put(537,"Víctor García ");

        System.out.println("Los elementos de m son: \n" + m);

        System.out.println(m.get(921));
        System.out.println(m.get(537));
        System.out.println(m.get(888));

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, introduzca un código");
        int codigoIntroducido = Integer.parseInt(sc.nextLine());
        if (m.containsKey(codigoIntroducido)) {
            System.out.print("El codigo " + codigoIntroducido + " corresponde a ");
            System.out.print(m.get(codigoIntroducido));
        } else{
            System.out.println("El codigo introducido no existe");
        }*/


        /*   Persona [] p = new Persona[]{
                new Persona(2,"Joan",20),
                new Persona(1,"Ana",25),
        };
        //Array.sort(p)

        System.out.println(Arrays.deepToString(p));

        ComparadorPersonas c = new ComparadorPersonas();
        Arrays.sort(p,c);
        System.out.println(Arrays.deepToString(p));*/
    }
}