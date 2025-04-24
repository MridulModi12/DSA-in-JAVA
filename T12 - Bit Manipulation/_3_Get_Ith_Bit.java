public class _3_Get_Ith_Bit {
    public static int Get_Ith_Bit(int n, int i) {
        int bitmask = 1 << i;
        if((n & bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }
    public static void main(String[] args) {
        System.out.println("Ith Bit : " + Get_Ith_Bit(3, 1));
    }
}