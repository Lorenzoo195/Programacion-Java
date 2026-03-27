import java.util.Scanner;

/*
Diseña un algoritmo utilizando la herramienta PSeInt que compruebe si ha recibido un
premio en un sorteo. El usuario tiene 6 boletos. El programa mostrará un mensaje con el
premio que le ha tocado por cada uno de los boletos introducidos. Realiza también el
diagrama de flujo.
El número 99 gana un jamón.
El número 73 gana una maleta.
El número 27 gana una cena para 2 personas.
El resto de números participa en otro sorteo para un viaje a Londres.
*/
public class c_ej5MasPseudo {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int contbol = 1;
        int bol = sc.nextInt();
        while(contbol <=6 ){


            if (bol == 99) {
                System.out.println("jamon");
            } else if (bol == 73) {
                System.out.println("maleta");
            } else if (bol == 27) {
                System.out.println("viaje");

            } else {
                System.out.println("nada");
            }
            contbol++;
        }
    }
}
