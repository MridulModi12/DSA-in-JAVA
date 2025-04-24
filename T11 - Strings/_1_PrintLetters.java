public class _1_PrintLetters {
    public static void printLetters(String str) {
        int i;
        for(i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        String str = "Mridul Modi";
        printLetters(str);
    }
}