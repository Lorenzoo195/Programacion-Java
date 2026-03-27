public class Ejemplo {
    public static void main(String[] args) {

        System.out.println(Factorial(5));



  }
    public static int Factorial (int paramN)
    {
        int iRet = 1;
        if ( paramN > 1)
        {
            iRet = paramN * Factorial(paramN-1);
        }
        else
        {
            iRet = 1;
        }
        return iRet;
    }
    // F(n)= F(n-1) + F(n-2) F(0)=0 fibonacci llamada recursiva
}
