import java.util.Scanner;

public class Ej10Feliz2025_$$$$$$ {
    public static Scanner sc = new Scanner(System.in);

    public static final int MAX_POW = 15;

    public static void main(String[] args){
        //System.out.println(Math.pow(MAX_POW, 3));
        boolean finalResult = false;

        System.out.println("Introduce el año a analizar");
        double year = sc.nextDouble();
        double processedNumber = 0;
        int start = 0;
        int end = 0;

        for( int i = 1; i < MAX_POW && !finalResult; i++){
            //System.out.println(year);
            start = i;
            for( int k = i; k < MAX_POW; k++){
                processedNumber += Math.pow(k, 3);
                //System.out.println(processedNumber);

                if(processedNumber == year){
                    finalResult = true;
                    end = k;
                    break;
                }


            }
            processedNumber = 0;
        }

        if(finalResult){
            System.out.println(start+" ... "+end);
        }else{
            System.out.println("NO CUBICO");
        }

    }
}