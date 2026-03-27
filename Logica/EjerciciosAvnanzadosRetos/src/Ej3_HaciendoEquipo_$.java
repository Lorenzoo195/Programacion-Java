import java.util.Scanner;

public class Ej3_HaciendoEquipo_$ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // leer profesores (una sola línea)
        String lineaProfes = sc.nextLine().trim();
        String[] profesores = lineaProfes.split("\\s+");
        int numProfes = profesores.length;

        //leer actividad y quien se apunta

        int votaciones  = numProfes*2;
        int votacionActual = 0;

        String [] actividades = new String [2];
        int [] votosActividad = new int [2];
        int numActividades = 0;

        int [] votosProfes = new int [numProfes];

        while(votacionActual<votaciones){
            String linea = sc.nextLine();
            String partes [] =linea.trim().split("-");
            String nombreActividad = partes[0].trim();
            String profesDeEsaActividad = partes[1].trim();

            //registrar actividad

            actividades = anadirString(actividades,numActividades,nombreActividad);
            votosActividad = anadirInt(votosActividad,numActividades,0);

            String [] listaProfes = profesDeEsaActividad.split("\\s+");
            for(int i = 0;i< listaProfes.length; i++){
                int idxProf = buscarProfesor(profesores,listaProfes[i]);
                if(idxProf!=-1){
                    votosProfes[idxProf]++;
                    votosActividad[numActividades]++;
                    votacionActual++;
                }
            }
            numActividades++;
        }

        // comprobar que han votado todos 2 veces en actividades
        boolean todoOk = true;
        for(int i =0;i<numProfes;i++){
            if(votosProfes[i]!=2){
                todoOk = false;
            }
        }
        if(!todoOk){
            System.out.println("AUN NO HAN TERMINADO LAS VOTACIONES");
        } else {
            //dos actividades mas votadas
            int idxMax1 = -1;
            int idxMax2 = -1;

            for(int i = 0; i<numActividades;i++){
                int v = votosActividad[i];

                    if(idxMax1 == -1 || v> votosActividad[idxMax1]){
                        idxMax2 = idxMax1;
                        idxMax1 = i;
                    } else if (i != idxMax1 &&
                            (idxMax2 == -1 || v > votosActividad[idxMax2])) {
                        idxMax2 = i;
                    }
                }
                if (idxMax1 != -1) {
                    System.out.println(actividades[idxMax1]);
                }
                if (idxMax2 != -1) {
                    System.out.println(actividades[idxMax2]);
                }
            }
        }
    // Array dinámico para int[]

    public static int[] anadirInt(int[] arr, int iIndice, int valor) {
        if (iIndice == arr.length) {
            int[] arrNew = new int[arr.length + 1];
            for (int i = 0; i < arr.length; i++) {
                arrNew[i] = arr[i];
            }
            arr = arrNew;
        }
        arr[iIndice] = valor;
        return arr;
    }
    // Array dinámico para String[]

    public static String[] anadirString(String[] arr, int iIndice, String nuevo) {
        if (iIndice == arr.length) {
            String[] arrNew = new String[arr.length + 1];  // o *2+1 si quieres
            for (int i = 0; i < arr.length; i++) {
                arrNew[i] = arr[i];
            }
            arr = arrNew;
        }
        arr[iIndice] = nuevo;
        return arr;
    }
    // Buscar índice del profesor por nombre

    public static int buscarProfesor(String [] profes, String nombre){
        for(int i = 0;i<profes.length;i++){
            if(profes[i].equals(nombre)){
                return i;
            }
        }
        return -1;
    }
}
