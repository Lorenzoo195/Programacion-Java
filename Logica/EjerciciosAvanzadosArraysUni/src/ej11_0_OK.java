import java.util.Scanner;

/*
Realizar un programa que convierta las posiciones pares de una palabra de mayúscula a
minúscula y las impares de minúscula a mayúscula
 */
public class ej11_0_OK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra = sc.next();
        String resultado = "";
        for(int i = 0; i<palabra.length();i++){
            char letra = palabra.charAt(i);
            if(i%2!=0){
                letra = Character.toLowerCase(letra);
            } else {
                letra = Character.toUpperCase(letra);
            }
            resultado = resultado + letra;
        }
        System.out.println(resultado);

    }
}
