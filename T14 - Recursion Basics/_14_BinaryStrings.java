public class _14_BinaryStrings {
    public static void binaryStrings(int n, String str, char lastChar) {
        if(n == 0) {
            System.out.println(str);
            return;
        }
        binaryStrings(n-1, str + "0", '0');
        if(lastChar == '0') {
            binaryStrings(n-1, str + "1", '1');
        }
    }
    public static void main(String[] args) {
        binaryStrings(2, new String(), '0');
    }
}
