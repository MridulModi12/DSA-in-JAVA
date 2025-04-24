public class Q1_lowercaseVowels {
    public static int CountVowels(String str) {
        int i;
        int count = 0;
        for(i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "This is a beautiful day";
        System.out.println(CountVowels(str));
    }
}