public class _2_OddOrEven {
    public static void OddOrEven(int n) {
        if((n & 1) == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
    public static void main(String[] args) {
        OddOrEven(22);
        OddOrEven(21);
    }
}