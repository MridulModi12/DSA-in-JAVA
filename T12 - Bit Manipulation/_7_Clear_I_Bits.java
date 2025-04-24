public class _7_Clear_I_Bits {
    public static int ClearIBits(int n, int i) {
        int bitmask = (~0) << i;
        return n & bitmask;
    }
    public static void main(String[] args) {
        System.out.println(ClearIBits(15, 2));
    }
}