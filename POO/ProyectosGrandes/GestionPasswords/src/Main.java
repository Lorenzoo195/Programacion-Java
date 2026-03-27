import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuántas Contraseñas quieres generar?");
        int tamanho = sc.nextInt();

        System.out.println("¿Qué longitud tendran las contraseñas?");
        int longitudPass = sc.nextInt();

        Password [] listaPassword = new Password[tamanho];
        boolean [] seguridad = new boolean[tamanho];

        for(int i = 0;i< listaPassword.length;i++){
            listaPassword[i] = new Password(longitudPass);
            seguridad[i]=listaPassword[i].esFuerte();
        }

        System.out.println("Resultados");
        for(int i = 0; i< listaPassword.length;i++){
            String estado = seguridad[i] ? "Fuerte" : "Débil";
            System.out.println(listaPassword[i].getContrasenha() + " " + estado);
        }

    }
}