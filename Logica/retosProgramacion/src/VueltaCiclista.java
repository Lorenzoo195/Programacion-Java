//Organizando vuelta ciclista

/*
Funcionamiento: ponemos para empezar "prologo 50" en la misma linea
                luego para cada etapa con sus km en distinta linea-> ejemplo: "plana" intro , 150 intro
                para finalizar escribimos "fin 50"
 */

import java.util.Scanner;

public class VueltaCiclista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int iEtapasTotal = 0;
        int contPlana = 0 ;
        int contMontana = 0 ;
        int contMediaAltura = 0;
        int contKmEtapa = 0 ;
        int iKmTotal = 0;
        String nombreEtapa ="";

        String []listaKOOK  = new String[10];
        int indiceOKKO =0;
        //
        System.out.println("Ingrese el nombre del etapa");
        String inicio = sc.nextLine();

        while(!inicio.equalsIgnoreCase("PROLOGO 50")) {
            System.out.println("Vuelve a empezar");
            inicio = sc.nextLine();
        }
        // empezamos a leer etapas
        System.out.println("Ingrese el nombre del etapa");
        nombreEtapa = sc.nextLine();

        while(!nombreEtapa.equalsIgnoreCase("FIN 50" )&& iEtapasTotal<=8){
            System.out.println("Ingrese km de la etapa");
            contKmEtapa = sc.nextInt();
            sc.nextLine();
            String resultado= "";

            if(contKmEtapa<=200) {
                if (nombreEtapa.equalsIgnoreCase("PLANA")) {
                    contPlana += contKmEtapa;
                    // +300km acumulados
                    if(contPlana<300){
                        iKmTotal += contKmEtapa;
                        iEtapasTotal++;
                        resultado = "OK";
                    }else {
                        resultado = "KO";
                    }

                } else if (nombreEtapa.equalsIgnoreCase("MONTANA")) {
                    contMontana += contKmEtapa;
                    // +300km acumulados
                    if(contMontana<300) {
                        iKmTotal += contKmEtapa;
                        iEtapasTotal++;
                        resultado = "OK";
                    } else {
                        resultado = "KO";
                    }
                } else if (nombreEtapa.equalsIgnoreCase("MEDIA")) {
                    contMediaAltura += contKmEtapa;
                    // +300km acumulados
                    if(contMediaAltura<300) {
                        iKmTotal += contKmEtapa;
                        iEtapasTotal++;
                        resultado = "OK";
                    } else {
                        resultado = "KO";
                    }
                } else {
                    resultado = "KO";  //nombre etapa no valido
                }
            }else{
                resultado = "KO"; //+200km

            }
            listaKOOK[indiceOKKO]=resultado;
            indiceOKKO++;

            System.out.println("Ingrese el nombre del etapa");

            nombreEtapa = sc.nextLine();
        } //al final se suman 100 km (prologo + fin) y 2 etapas
        iKmTotal = iKmTotal+ 100;
        iEtapasTotal = iEtapasTotal + 2;

        for (int i = 0; i < indiceOKKO; i++) {
            System.out.println(listaKOOK[i]);
        }
        System.out.println(iKmTotal);
        System.out.println(iEtapasTotal);
    }
}