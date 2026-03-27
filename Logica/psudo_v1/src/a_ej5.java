import java.util.Scanner;

public class a_ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lado1 = sc.nextInt();
        int lado2 = sc.nextInt();
        int lado3 = sc.nextInt();


        if( lado1==lado2 && lado1==lado3){
            System.out.println("equilatero");
        } else if(lado1==lado2 || lado1==lado3 || lado2==lado3){
            System.out.println("isosceles");
        } else {
            System.out.println("escaleno");
        }
    }
}
