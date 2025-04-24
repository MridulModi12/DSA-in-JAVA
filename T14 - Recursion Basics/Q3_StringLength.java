public class Q3_StringLength {
    public static int stringLength(String str) {
        if(str.length() == 0) {
            return 0;
        }
        return 1 + stringLength(str.substring(1));
    }
    public static void main(String[] args) {
        String str = "abcde";
        System.out.println(stringLength(str));
    }
}
