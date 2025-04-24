public class _6_Update_Ith_Bit {
    public static int clearIthBit(int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;
    }
    public static int UpdateIthBit(int n, int i, int newBit) {
        n = clearIthBit(n, i);
        int bitmask = newBit << i;
        return n | bitmask;
    }
    public static void main(String[] args) {
        System.out.println(UpdateIthBit(13, 2, 1));
    }
}