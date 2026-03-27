/*
secuencias de los 5 sonidos que le
han enseñado en sus primeras clases: TARARA, TERERE, TIRIRI, TORORO y
TURURU.
Una de esas directrices es que no puede repetir el
mismo sonido más de 2 veces seguidas
 */

import java.util.Scanner;

public class QuieroSerUnaEstrellaDeRock {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime cancion");
        String cancion = sc.nextLine();
        String [] palabras = cancion.split(" ");
        String [] sonidosValidos = {"TARARA", "TERERE", "TIRIRI", "TORORO", "TURURU"};

        String cancionFinal = "";
        String ultimoSonido = "";
        int repeticionSonido = 0;
        // recorremos cada palabra escrita
        for (String palabra:palabras){
            String sonido = palabra.toUpperCase();
            //solo seguimos si la palabra es valida
            if(esValidoElSonido(sonido,sonidosValidos)){
                //si es igual al ultimo sonido aumentamos contador
                if(sonido.equals(ultimoSonido)){
                    repeticionSonido++;
                } else {
                    // si cambia sonido, se reinicia contador
                    ultimoSonido = sonido;
                    repeticionSonido = 1;
                }
                if(repeticionSonido <=2){
                    if(cancionFinal.isEmpty()){
                        cancionFinal = sonido;
                    } else {
                        cancionFinal = cancionFinal + " " + sonido;
                    }
                }
            }
        }
        System.out.println("Cancion corregida");
        System.out.println(cancionFinal);



    }
    //comprueba si una palabra esta dentro del listado de sonidos validos
    public static boolean esValidoElSonido(String palabra , String [] sonidosValidos){
        for (String posibleValido:sonidosValidos){
            if(palabra.equals(posibleValido)){
                return true;
            }
        }
        return false;
    }
}
