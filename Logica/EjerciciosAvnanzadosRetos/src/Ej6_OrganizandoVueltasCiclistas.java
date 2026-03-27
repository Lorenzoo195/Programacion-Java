import java.util.Scanner;

public class Ej6_OrganizandoVueltasCiclistas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String etapaEntera = sc.nextLine();
        String [] partes = etapaEntera.trim().split("\\s+");
        String nombreEtapa = partes[0].trim();
        String kmEtapa = partes[1].trim();
        int etapasOK = 1;
        int kmOk = 100;

        int kmPlana = 0;
        int kmMedia = 0;
        int kmMonta = 0;
        boolean finLeido = false;
        if(nombreEtapa.equals("PROLOGO")&& kmEtapa.equals("50")){

        while(etapasOK<=10 && !finLeido){
                etapaEntera = sc.nextLine();
                partes = etapaEntera.trim().split("\\s+");
                nombreEtapa = partes[0].trim();
                kmEtapa = partes[1].trim();
                int kmUnaEtapa = Integer.parseInt(kmEtapa);

                if(nombreEtapa.equals("FIN")){
                    if(kmUnaEtapa==50) {
                        finLeido = true;
                        etapasOK++;
                    }
                }


                else if(nombreEtapa.equals("PLANA")){
                    kmPlana += kmUnaEtapa;
                    if(kmPlana<300) {

                        if (kmUnaEtapa < 200) {
                            System.out.println("OK");
                            etapasOK++;
                            kmOk += kmUnaEtapa;
                        } else {
                            System.out.println("KO");
                            kmPlana -= kmUnaEtapa;
                        }
                    } else {
                        System.out.println("KO");
                        kmPlana -= kmUnaEtapa;
                    }

                } else if(nombreEtapa.equals("MONTAÑA")){
                kmMonta += kmUnaEtapa;
                if(kmMonta<300) {

                    if (kmUnaEtapa < 200) {
                        System.out.println("OK");
                        etapasOK++;
                        kmOk += kmUnaEtapa;
                    } else {
                        System.out.println("KO");
                        kmMonta-= kmUnaEtapa;
                    }
                } else {
                    System.out.println("KO");
                    kmMonta-= kmUnaEtapa;
                }

            } else if(nombreEtapa.equals("MEDIA")){
                kmMedia += kmUnaEtapa;
                if(kmMedia<300) {

                    if (kmUnaEtapa < 200) {
                        System.out.println("OK");
                        etapasOK++;
                        kmOk += kmUnaEtapa;
                    } else {
                        System.out.println("KO");
                        kmMedia-= kmUnaEtapa;
                    }
                } else {
                    System.out.println("KO");
                    kmMedia-= kmUnaEtapa;
                }
            }

            }
            System.out.println(etapasOK);
            System.out.println(kmOk);
        }

    }

}
/*// Devuelve true si la etapa es válida para ese tipo
public static boolean etapaValida(int kmTipo, int kmEtapa) {
    return kmTipo < 300 && kmEtapa < 200;


}
etapaEntera = sc.nextLine();
partes = etapaEntera.trim().split("\\s+");
nombreEtapa = partes[0].trim();
kmEtapa = partes[1].trim();
int kmUnaEtapa = Integer.parseInt(kmEtapa);

switch (nombreEtapa) {
    case "FIN":
        if (kmUnaEtapa == 50) {
            finLeido = true;
            etapasOK++;      // contar FIN como aceptada
            kmOk += kmUnaEtapa;
        }
        // si no es 50, la dejas como KO implícito (no sumas nada)
        break;

    case "PLANA":
        kmPlana += kmUnaEtapa;
        if (etapaValida(kmPlana, kmUnaEtapa)) {
            System.out.println("OK");
            etapasOK++;
            kmOk += kmUnaEtapa;
        } else {
            System.out.println("KO");
            kmPlana -= kmUnaEtapa;
        }
        break;

    case "MONTAÑA":
        kmMonta += kmUnaEtapa;
        if (etapaValida(kmMonta, kmUnaEtapa)) {
            System.out.println("OK");
            etapasOK++;
            kmOk += kmUnaEtapa;
        } else {
            System.out.println("KO");
            kmMonta -= kmUnaEtapa;
        }
        break;

    case "MEDIA":
        kmMedia += kmUnaEtapa;
        if (etapaValida(kmMedia, kmUnaEtapa)) {
            System.out.println("OK");
            etapasOK++;
            kmOk += kmUnaEtapa;
        } else {
            System.out.println("KO");
            kmMedia -= kmUnaEtapa;
        }
        break;

    // default: otros tipos no se aceptan
}


 */