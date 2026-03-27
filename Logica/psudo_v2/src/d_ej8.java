import java.util.Random;

/*
Queremos realizar una encuesta a 10 personas, en esta encuesta indicaremos el sexo (1=masculino, 2=femenino),
si trabaja (1=si trabaja, 2= no trabaja) y su sueldo (si tiene un trabajo, sino será un cero)
estará entre 600 y 2000 (valor entero). Los valores pueden ser generados aleatoriamente.
Calcula y muestra lo siguiente:
Porcentaje de hombres (tengan o no trabajo).
Porcentaje de mujeres (tengan o no trabajo).
Porcentaje de hombres que trabajan.
Porcentaje de mujeres que trabajan.
El sueldo promedio de las hombres que trabajan.
El sueldo promedio de las mujeres que trabajan.
 */
public class d_ej8 {
    public static void main(String [] args){
        int personas [] = new int[10];
        int trabajo [] = new int[10];
        int sueldos [] = new int[10];

        personasTrabajan(trabajo);
        rellenarSueldos(sueldos,trabajo);


        for(int i= 0;i<personas.length;i++){
            personas[i] = aleatorio(1,2);
        }
        int contHombres = 0;
        int contMujeres = 0;
        int contTrabajaMujer = 0;
        int contParoMujer =0;
        int contTrabajaHombre = 0;
        int contParoHombre =0;
        int sumaSueldoHombre = 0;
        int sumaSueldoMujer = 0;
        for(int i =0;i<personas.length;i++){
            if(personas[i]==1){
                contHombres++;
                if(trabajo[i]==1){
                    contTrabajaHombre++;
                    if(sueldos[i] !=0 ){
                        sumaSueldoHombre += sueldos[i];
                    }
                }else{
                    contParoHombre++;
                }
            }else{
                contMujeres++;
                if(trabajo[i]==1){
                    contTrabajaMujer++;
                    if(sueldos[i] !=0 ){
                        sumaSueldoMujer += sueldos[i];
                    }
                }else{
                    contParoMujer++;
                }
            }
        }
        mostrarPersonas(personas);

        System.out.println("\nEl porcentaje que hombre que trabajan es: " + porcentaje(contTrabajaHombre));
        System.out.println("\nEl porcentaje que mujer que trabajan es: " + porcentaje(contTrabajaMujer));
        System.out.println("\n"+porcentaje(contHombres)+"%");
        System.out.println("\n"+porcentaje(contMujeres)+"%");
        System.out.println("\nEl sueldo promedio de los hombre que trabajan: " + (sumaSueldoHombre/contTrabajaHombre));
        System.out.println("\nEl sueldo promedio de las mujeres que trabajan: " + (sumaSueldoMujer/contTrabajaMujer));

    }
    public static void personasTrabajan (int trabajo[]){
        for(int i = 0;i<trabajo.length;i++){
            trabajo[i] = aleatorio(1,2);
        }
    }
    public static void rellenarSueldos (int sueldos[],int trabajo []) {
        for (int i = 0; i < trabajo.length; i++) {
            if (trabajo[i] == 1) {
              sueldos[i] = aleatorio(600, 2000);

            } else {
                
            }
        }
    }
    public static int porcentaje (int num){
        int porcentaje = num*10;
        return porcentaje;
    }
    public static int aleatorio(int min, int max){
        int iret  = min;
        Random rd = new Random();
        iret = rd.nextInt((max+1)-min)+min;

        return iret;
    }
    public static void mostrarPersonas(int personas []){
        for(int i =0;i<personas.length;i++){
            System.out.printf("%2d ", personas[i]);
        }
    }
}
