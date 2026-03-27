import java.util.Scanner;

public class Ej5_QuieroSerUnaEstrellaDeRock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cancionInicial = sc.nextLine();
        String [] partes = cancionInicial.split("\\s+");
        String [] sonidosValidos = {"TARARA","TERERE","TIRIRI","TORORO","TURURU"};

        String [] cancionfinal = new String[1];
        int numFinal = 0;

        for(int i = 0; i< partes.length;i++){
            String s = partes[i];
            for(int j = 0;j< sonidosValidos.length;j++){

                if(partes[i].equals(sonidosValidos[j])){
                    if(numFinal>=2 && cancionfinal[numFinal-1].equals(s) && cancionfinal[numFinal-2].equals(s)){

                    }else {
                        cancionfinal = anadirString(cancionfinal, numFinal, partes[i]);
                        numFinal++;
                    }
                }
            }

        }
        for(int i = 0;i<numFinal;i++) {
            if(i>0) {
                System.out.print(" ");
            }
            System.out.print(cancionfinal[i]);
        }
        System.out.println();

    }
    public static String[]  anadirString (String [] cancion, int numSonidos, String nuevo){
        if(cancion.length==numSonidos){
            String [] nuevacancion = new String[cancion.length+1];
                    for(int i = 0;i<cancion.length;i++){
                        nuevacancion[i] = cancion [i];
                    }
                    cancion = nuevacancion;
            }
        cancion[numSonidos] = nuevo;

        return cancion;
    }
}
