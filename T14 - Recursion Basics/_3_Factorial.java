public class _3_Factorial {
    public static int factorial(int n) {
        if(n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}



//n! = 1 x 2 x ... x n
//n! = n x n-1!