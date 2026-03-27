/*
 Muestra el día de la semana utilizando un array
 */
public class Ej1 {
    public static void main(String[] args) {
        String arrDias[] =  {"Lunes","Martes", "Miercoles", "Jueves", "Viernes", "Sabado","Domingo"};

        for (int i =0; i<arrDias.length;i++){
            System.out.print(arrDias[i] + " ");
        }
    }
}