public class _9_xPowerN {
    public static int power(int x, int n) {                                 
        if(n == 0) {
            return 1;
        }
        return x * power(x, n-1);                                                         
    }                                                                       
    public static void main(String[] args) {
        System.out.println(power(6 , 3));
    }
}





//x^n = x * x^n-1