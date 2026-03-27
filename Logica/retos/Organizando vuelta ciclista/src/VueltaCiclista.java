//Organizando vuelta ciclista

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

        System.out.println("Ingrese el nombre del etapa");
        String inicio = sc.nextLine();

        while(!inicio.equalsIgnoreCase("PROLOGO 50")) {
            System.out.println("Vuelve a empezar");
            inicio = sc.nextLine();
        }
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
                   if(contPlana<300){
                       iKmTotal += contKmEtapa;
                       iEtapasTotal++;
                       resultado = "OK";
                   }else {
                       resultado = "KO";
                   }

               } else if (nombreEtapa.equalsIgnoreCase("MONTANA")) {
                   contMontana += contKmEtapa;
                   if(contMontana<300) {
                       iKmTotal += contKmEtapa;
                       iEtapasTotal++;
                       resultado = "OK";
                   } else {
                       resultado = "KO";
                   }
               } else if (nombreEtapa.equalsIgnoreCase("MEDIA")) {
                   contMediaAltura += contKmEtapa;
                   if(contMediaAltura<300) {
                       iKmTotal += contKmEtapa;
                       iEtapasTotal++;
                       resultado = "OK";
                    } else {
                       resultado = "KO";
                   }
               } else {
                   resultado = "KO";
               }
           }else{
               resultado = "KO"; //+200km

           }
           listaKOOK[indiceOKKO]=resultado;
           indiceOKKO++;

           System.out.println("Ingrese el nombre del etapa");

           nombreEtapa = sc.nextLine();
       }
       iKmTotal = iKmTotal+ 100;
       iEtapasTotal = iEtapasTotal + 2;

       for (int i = 0; i < indiceOKKO; i++) {
           System.out.println(listaKOOK[i]);
       }
        System.out.println(iKmTotal);
        System.out.println(iEtapasTotal);
    }
}