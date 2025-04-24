public class Q4_UpperToLower {
    public static void main(String[] args) {
        char i;
        for(i = 'A'; i <= 'Z'; i++) {
            System.out.print((char)(i | ' ' ) + " ");
        }
    }
}