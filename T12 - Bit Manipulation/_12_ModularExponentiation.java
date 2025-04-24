public class _12_ModularExponentiation {
    public static int modularExponentiation(int a, int n, int p) {
        int ans = 1;
        while(n > 0) {
            if((n & 1) != 0) {
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans % p;
    }
    public static void main(String[] args) {
        System.out.println(modularExponentiation(2, 3, 3));
    }
}