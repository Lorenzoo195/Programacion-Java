import java.util.Scanner;

/*Realiza un programa para determinar si un número es múltiplo de otro dado introducidos por el
usuario. En este caso el resultado debe ser un mensaje que, obviamente, será diferente según el
caso.
 */
public class a_ej1_EJERCICIOSEXTRApseudo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a%b==0 || b%a==0){
            System.out.println("son multiplos ");
        } else {
            System.out.println("no son multiplos");
        }

    }
}