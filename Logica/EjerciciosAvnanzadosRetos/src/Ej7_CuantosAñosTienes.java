import java.util.Scanner;

public class Ej7_CuantosAñosTienes {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        String anos = sc.nextLine();
        String partes [] = anos.trim().split("\\s+");
        String sN = partes[0].trim();
        String sM = partes[1].trim();

        while(!sN.equals("0") && !sM.equals("0")){

            int anoA = Integer.parseInt(sN);
            int anoB = Integer.parseInt(sM);
            int resultadoEdadA = anoB-anoA;
            int resultadoEdadB = anoB-anoA-1;
            System.out.print(resultadoEdadB);
            System.out.print("-");
            System.out.print(resultadoEdadA);
            System.out.println();
            anos = sc.nextLine();
            partes = anos.trim().split("\\s+");
            sN = partes[0].trim();
            sM = partes[1].trim();
        }
    }
}
