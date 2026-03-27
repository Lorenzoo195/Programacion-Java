import java.util.*;

public class Main {
    public static void main(String[] args) {

    HashMap<String,Persona> Clientes = new HashMap<String,Persona>();

        Persona p1 = new Persona("Juan", "Pérez", "11111111A");
        Persona p2 = new Persona("María", "López", "22222222B");
        Persona p3 = new Persona("Carlos", "Ruiz", "33333333C");
        Persona p4 = new Persona("Laura", "Sanz", "44444444D");
        Persona p5 = new Persona("Pedro", "Gil", "55555555E");

        Clientes.put(p1.getDNI(), p1);
        Clientes.put(p3.getDNI(), p3);
        Clientes.put(p5.getDNI(), p5);
        for(Persona p : Clientes.values()){
            System.out.println(p.getNombre() + " " + p.getApellido());
        }

        for(String a : Clientes.keySet()){
            System.out.println("DNI: " + a);
        }





        //Queue<Persona> cola  = new PriorityQueue<Persona>();

       /* cola.add(new Persona("Lorenzo", Persona.Estado.normal));
        cola.add(new Persona("AAA", Persona.Estado.normal));
        cola.add(new Persona("BBB", Persona.Estado.embaraza));
        cola.add(new Persona("CC", Persona.Estado.abuelo));
        cola.add(new Persona("DD", Persona.Estado.normal));
        while(!cola.isEmpty()){
            Persona p = cola.remove();
            System.out.println(p);
        }*/


        /*List<String> listDias = new ArrayList<>();
        listDias.add("Lunes");
        listDias.add("Martes");
        listDias.add("Miercoles");
        listDias.add("Jueves");
        listDias.add("Viernes");
        System.out.println(listDias.toString());
        listDias.add(3,"Juernes");
        System.out.println(listDias.toString());

        List<String> listDos = new ArrayList<>(listDias);
        listDias.addAll(listDos);
        System.out.println(listDias.size());
        System.out.println(listDias.get(3));
        System.out.println(listDias.get(4));

        System.out.println(listDias.get(0));
        System.out.println(listDias.get(listDias.size()-1));

        if(listDias.remove("Juermes")){
            System.out.println("Borrado");
        } else {
            System.out.println("No exite");
        }
        Iterator<String> it = listDias.iterator();
        while (it.hasNext()){
            System.out.println(it.next()+ " | ");
        }
        System.out.println();
        System.out.println("-----");
        boolean existeLunes = listDias.contains("Lunes");
        System.out.println(existeLunes);

        boolean encontrado = false;
        for(String dia : listDias){
            if(dia.equalsIgnoreCase("lunes")){
                encontrado = true;
            }
        }
        System.out.println("Esta encontrado? " +encontrado);

        Collections.sort(listDias);
        System.out.println(listDias);*/

    }
}