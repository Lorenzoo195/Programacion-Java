import java.util.Scanner;

public class Pacto21 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int sueldos [] = new int[0];

        System.out.println("¿Si usted trabaja cuanto gana?");
        String repuesta = sc.nextLine();

        while (!repuesta.equalsIgnoreCase("no")) {
            int dinero = Integer.parseInt(repuesta);

            int [] almacen = new int [sueldos.length+1];
            for (int i = 0; i < sueldos.length; i++) {
                almacen[i] = sueldos[i];
            }
            almacen[sueldos.length] = dinero;
            sueldos = almacen;
            System.out.println("¿Si usted trabaja cuanto gana?");
            repuesta = sc.nextLine();

        }

        for (int i = 0; i < sueldos.length; i++) {
            System.out.println(sueldos[i]);
        }


    }
}
