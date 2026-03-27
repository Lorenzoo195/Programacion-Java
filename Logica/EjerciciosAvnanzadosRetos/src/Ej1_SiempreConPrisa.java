import java.util.Scanner;

public class Ej1_SiempreConPrisa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime casos");
        int casos = sc.nextInt();
        sc.nextLine();
        int tiempoAscensor;
        int tiempoAndando;
        int contCasos = 0;
        String [] palabras = new String[casos];
        while(contCasos<casos){
            String entrada = sc.nextLine();
            String[] partes = entrada.trim().split(" ");


            int pisos = Integer.parseInt(partes[0]);
            int altura = Integer.parseInt(partes[1]); //altura entre pisos en metros
            int escalones = Integer.parseInt(partes[2]); //numero escalones que hay entre 2 pisos

            int escalonesTotal = escalones*pisos;
            int zancadas = escalonesTotal /2;
            if(escalonesTotal%2!=0){
                zancadas++;
            }
            tiempoAndando = zancadas +pisos;
            tiempoAscensor = altura * pisos;

            if(tiempoAndando<tiempoAscensor){
                palabras[contCasos]= "ANDANDO";
            } else {
                palabras[contCasos]= "ASCENSOR";
            }
            contCasos++;
        }
        for (int i = 0;i< palabras.length;i++){
            System.out.println(palabras[i]);
        }
    }
}