public class _4_Set_Ith_Bit {
    public static int setIthBit(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }
    public static void main(String[] args) {
        System.out.println(setIthBit(10, 1));
    }
}