import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> listDias = new ArrayList<>();
        listDias.add("Lunes");
        listDias.add("Martes");
        listDias.add("Miercoles");
        listDias.add("Jueves");
        listDias.add("Viernes");
        listDias.add("Sabado");
        listDias.add("Domingo");
        listDias.add(4,"Juernes");
        List<String> listaDos = new ArrayList<>(listDias);
        listaDos.addAll(listDias);
        System.out.println("Mostrar posiciones");
        System.out.println(listDias.get(3));
        System.out.println(listDias.get(4));
        System.out.println("El primero: " + listDias.get(0));
        System.out.println("El ultimo: " + listDias.get(listDias.size()-1));

        if(listDias.contains("Juernes")){
            listDias.remove("Juernes");
            System.out.println("Borrado");
            System.out.println(listDias);
        } else {
            System.out.println("No esta");
            System.out.println(listDias);
        }
        System.out.println("--------------");
        Iterator it = listDias.iterator();
        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println("---------------");
        boolean contieneLunes = listDias.contains("Lunes"); // es true ya que hay lunes
        System.out.println("---------------");
        boolean tienelunes = false;
        for(String dia : listDias){
            if(dia.equalsIgnoreCase("lunes")){

                tienelunes = true;
                System.out.println("Tiene lunes");
            }

        }
        System.out.println("---------------");

        listDias.sort(null);
        System.out.println(listDias);
        System.out.println("---------------");

        listDias.clear();
        System.out.println(listDias);
        System.out.println("---------------");

        List<String> listNum = new ArrayList<>();
        listNum.add("3");
        listNum.add("5");
        listNum.add("1");
        System.out.println(listNum);
        listNum.sort(null);
        System.out.println(listNum);



    }
}