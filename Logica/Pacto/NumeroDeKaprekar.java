import java.util.Scanner;

/*
El matemático indio Dattaraya Ramchandra Kaprekar trabajó en ,
realizando varios descubrimientos a lo largo de su vida. Uno de ellos fue el conjunto de los que, desde entonces,
 se conocen como , que son aquellos números enteros positivos que, al ser elevados al cuadrado,
  pueden descomponerse (para una base dada, que asumiremos ser base 10)
   en dos enteros positivos cuya suma es igual al número original.
Por ejemplo, el número 703 es un , dado que 703² es 494209 que puede descomponerse en 494 y 209 cuya suma da, de nuevo,
703. Otro ejemplo es el 9 (9² = 81 y 8 + 1 = 9).
Hay que tener presente que ambos números en la descomposición  tienen por qué tener el mismo número de dígitos.
Por ejemplo en el caso del número 2728 tenemos que 2728² = 7441984 que es número de Kaprekar porque 744 + 1984 = 2728.
También puede darse el caso de que el número al cuadrado contenga algún cero.
Por ejemplo, con el 4879 tenemos que 4879² = 23804641, que es un número de Kaprekar porque 238 + 04641 = 4879.
Si bien se permite que  de los valores de la descomposición sea 0 (y así por ejemplo 1 es número de Kaprekar),
el segundo no puede serlo. Debido a ello, el 100  es un número de Kaprekar. Fijate que 100² es 10000,
que podría descomponerse en 100 y 00 cuya suma es 100. Sin embargo, el segundo número debería ser 0,
que no se considera válido.
 */
public class NumeroDeKaprekar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numeroKaprekar = "9867";


                int numKaprekar = Integer.parseInt(numeroKaprekar);
                int [] datos = new int [4];

                for(int i =0; i<(numeroKaprekar.length()/2);i++){
                    String x = String.valueOf(numeroKaprekar.charAt(i));
                    int ix = Integer.parseInt(x);
                    System.out.print(x);
                }
                for(int i = (numeroKaprekar.length()/2); i<(numeroKaprekar.length());i++){
                    String y = String.valueOf(numeroKaprekar.charAt(i));
                    int iy = Integer.parseInt(y);
                    datos[i]=iy;
                   System.out.print(datos[i]);
                }
                   // if( (ix + iy)==numeroKaprekar)){

}


    }

