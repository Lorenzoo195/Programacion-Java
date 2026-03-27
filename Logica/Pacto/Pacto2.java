import java.util.Scanner;

/*
Ejercicio 2.- Encuesta Ayuntamiento
El ayuntamiento de nuestra localidad nos ha encargado una aplicación
que ayude a realizar encuestas estadísticas para conocer el nivel adquisitivo de los habitantes del municipio.
Para ello, tendremos que preguntar el sueldo de cada persona encuestada. A priori no conocemos el número de encuestados.
Para finalizar la entrada de datos, introduciremos un sueldo con valor -1.
Una vez terminada la entrada de datos, hemos de mostrar la siguiente información:
Todos los sueldos introducidos ordenados de forma decreciente.
El sueldo máximo y mínimo.
La media de los sueldos.
Nota: como a priori se desconoce el número de sueldos,
la tabla donde se almacenan los datos tendrá que incrementar su tamaño conforme necesitemos más espacio.
 */
public class Pacto2 {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        System.out.println("Dime cuantas personas: ");
        int indice = sc.nextInt();

        int aPersonas [] = new int [indice];

        int contSueldo = 0;
        int media = 0;
        int suma=0;
        for(int i=0;i<indice;i++){
            System.out.println("Dime un sueldo");
            int sueldo = sc.nextInt();
            aPersonas[i]= sueldo;
            contSueldo++;
            suma+=sueldo;
            media = suma/contSueldo;
        }
        int sueldoMax=0;
        int sueldoMin = aPersonas[0];

        for(int i=0;i<indice;i++){

        if(aPersonas[i]>sueldoMax){
            sueldoMax=aPersonas[i];
        }
        if(aPersonas[i]<sueldoMin){
            sueldoMin=aPersonas[i];
        }
        }
        for(int i=0;i< aPersonas.length;i++){
            System.out.println(aPersonas[i]);
        }
        System.out.println("media:  "+ media);
        System.out.println("sueldo maximo:  "+ sueldoMax);
        System.out.println("sueldo minimo:  "+ sueldoMin);
    }
}
