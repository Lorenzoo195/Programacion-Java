import java.util.Random;
import java.util.Scanner;
/*
Queremos desarrollar una aplicación que nos ayude a gestionar las notas de un centro
educativo. Cada grupo (o clase) está compuesto por 5 alumnos. Se pide leer las notas (números
enteros) del primer, segundo y tercer trimestre de un grupo. Debemos mostrar al final la nota
media del grupo en cada trimestre, y la media del alumno que se encuentra en la
posición pos (que se lee por teclado).
 */
public class
ej7_0$ {
    public static void main(String[] args) {
        int iAlumnos = 5;
        int arrPrimerTrim [] = new int[iAlumnos];
        int arrSegundoTrim [] = new int[iAlumnos];
        int arrTerceTrim [] = new int[iAlumnos];
        rellenarArray(arrPrimerTrim);
        rellenarArray(arrSegundoTrim);
        rellenarArray(arrTerceTrim);
        System.out.println("Primer trimeste");mostrarArray(arrPrimerTrim);System.out.println();
        System.out.println("Segundo trimeste");mostrarArray(arrSegundoTrim);System.out.println();
        System.out.println("Tercer trimeste");mostrarArray(arrTerceTrim);System.out.println();
        System.out.print("El primer trimestre");mostrarMedia(arrPrimerTrim,iAlumnos);
        System.out.print("El segundo trimestre");mostrarMedia(arrSegundoTrim,iAlumnos);
        System.out.print("El tercer trimestre");mostrarMedia(arrTerceTrim,iAlumnos);
        // desde aqui hasta funciones se ha resuelto con "ayuda"
        Scanner sc = new Scanner(System.in);
        int iPosicion = 0;
        System.out.println("Dime posicion del alumno");
        iPosicion = sc.nextInt();
        while(iPosicion<1 || iPosicion>5){
            System.out.println("Valor incorrecto");
            iPosicion = sc.nextInt();
        }
        int iIndice = iPosicion - 1;
        int iSumaAlumno = arrPrimerTrim[iIndice]+arrSegundoTrim[iIndice]+arrTerceTrim[iIndice];
        double dMediaAlumno = (double) iSumaAlumno /3 ;
        System.out.printf("La media del alumno en posicion %d es: %.2f", iPosicion, dMediaAlumno);
    }
    public static void rellenarArray (int array []){
        Random rd = new Random();
        for(int i = 0; i<array.length;i++){
            array[i] = rd.nextInt(10)+1;
        }
    }
    public static void mostrarArray (int array []){
        for(int i=0;i<array.length;i++){
            System.out.printf("%2d ",array[i]);

        }
    }
    public static void mostrarMedia (int arr [], int alumnos){
        int sumaNotas = 0;
        int media = 0;
        for(int i = 0;i<arr.length;i++){
            sumaNotas = arr[i]+sumaNotas;
        }
        media = sumaNotas/alumnos;
        System.out.println(" la media es : " + media);
    }
}
