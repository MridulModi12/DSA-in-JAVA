public class _4_StringFunctions {
    public static String getSubstring(String str, int si, int ei) {
        StringBuilder sb = new StringBuilder("");
        int i;
        for(i = si; i < ei; i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str1 = "Tony";
        String str2 = "Tony";
        String str3 = new String("Tony");
        if(str1 == str2) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        if(str1 == str3) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        if(str1.equals(str2)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        //substring
        String str = "Hello World";
        System.out.println(getSubstring(str, 2 , 7));
        System.out.println(str.substring(2, 7));
    }
}