import java.util.Scanner;

public class Ej4_PreparandoLaComida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //leer hora inicio y num pasos
        String horaInicio = sc.nextLine();

        int numPasos = sc.nextInt();
        sc.nextLine();
        int contPasos = 0;

        int tiempoA = 0;
        int tiempoB = 0;

        while(contPasos<numPasos){
            String lineaPasoyTiempo = sc.nextLine();
            String partes []  = lineaPasoyTiempo.trim().split("\\s+");
            String tiempoTarea = partes[partes.length-1].trim();
            int t = Integer.parseInt(tiempoTarea);

            if(tiempoA<=tiempoB){
                tiempoA += t;
            } else {
                tiempoB += t;
            }
            contPasos++;
        }

        int minutosTotales = (tiempoA >tiempoB) ? tiempoA:tiempoB;
        formatoHora(horaInicio,minutosTotales);
    }

    public static void formatoHora(String hora, int tiempoAdicional ){
        String partetiempo [] = hora.trim().split(":");
        String horas = partetiempo[0].trim();
        String minutos = partetiempo[1].trim();
        int iHoras = Integer.parseInt(horas);
        int iMinutos = Integer.parseInt(minutos);

        int totalMin = iMinutos +tiempoAdicional;
        iHoras +=totalMin / 60;

        int finalMin  = totalMin % 60;

        System.out.printf("%02d:%02d%n", iHoras, finalMin);

    }
}
