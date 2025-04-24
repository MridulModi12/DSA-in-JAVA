import java.util.Arrays;
public class Q4_Anagrams {
    public static boolean isAnagram(String str1, String str2) {
        if(str1.length() == str2.length()) {
            str1.toLowerCase();
            str2.toLowerCase();
            //conversion to char array
            char str1charArray[] = str1.toCharArray();
            char str2charArray[] = str2.toCharArray();
            //sorting
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);
            //checking
            boolean result = Arrays.equals(str1charArray, str2charArray);
            return result;
        }
        return false;
    }
    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "care";
        System.out.println(isAnagram(str1, str2));
    }
}