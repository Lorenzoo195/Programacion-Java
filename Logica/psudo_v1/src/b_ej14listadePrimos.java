import java.util.Scanner;

/*

 */
public class b_ej14listadePrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 2;i<=n;i++) {
            int divisores = 0;
            for(int q= 1;q<=i ;q++){
                if(i%q==0){
                    divisores++;
                }

            }
            if(divisores == 2){
                System.out.println(i);
            }
        }


    }
}
