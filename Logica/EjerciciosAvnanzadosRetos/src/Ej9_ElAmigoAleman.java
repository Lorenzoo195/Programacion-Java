import java.util.Scanner;

public class Ej9_ElAmigoAleman {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int iCasos = sc.nextInt();
        sc.nextLine();
        int iCont = 0;
        do {
            String fraseEntera = sc.nextLine();
            String fraseSinEspacios = fraseEntera.replace(" ","");
            int numLetras = fraseSinEspacios.length();
            boolean algunaPalabra = false;
            if(numLetras>100){
                System.out.println("Ninguna");
            } else {
                String palabra [] = fraseEntera.trim().split("\\s+");

                for(int i = 0; i< palabra.length;i++){
                    String parte = palabra [i];
                    int contVocal = 0;
                    int contCons = 0;
                    boolean enctrontrada = false;
                    for(int j = 0;j<parte.length();j++){
                        char c = Character.toLowerCase(parte.charAt(j));
                        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                            contVocal++;
                            contCons = 0;
                        } else {
                            contCons++;
                            contVocal = 0;
                        }
                        if(contCons >= 4 || contVocal >= 4){
                            enctrontrada = true;
                        }
                    }
                    if(enctrontrada){
                        System.out.println(parte);
                        algunaPalabra = true;
                    }
                }
                if(!algunaPalabra){
                    System.out.println("Ninguna");
                }
            }
            iCont++;
        } while (iCont < iCasos);
    }
}
