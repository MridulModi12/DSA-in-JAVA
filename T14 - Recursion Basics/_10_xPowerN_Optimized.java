public class _10_xPowerN_Optimized {
    public static int power(int x, int n) {
        if(n == 0) {
            return 1;
        }
        int halfPower = power(x, n/2);
        int halfPowerSq = halfPower * halfPower;
        if(n % 2 != 0) {
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args) {
        System.out.println(power(6 , 3));
    }
}



//n even x^n/2 * x^n/2
//n odd x * x^n/2 * x^n/2