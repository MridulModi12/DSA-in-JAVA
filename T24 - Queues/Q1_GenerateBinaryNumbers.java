import java.util.*;
public class Q1_GenerateBinaryNumbers {
    static void generateBinaryNumbers(int n) {
        Queue<String> q = new LinkedList<>();
        String str, str1, str2;
        q.add("1");
        for(int i = 1; i <= n; i++) {
            str = q.remove();
            str1 = str2 = str;
            str1 = str1 + "0";
            str2 = str2 + "1";
            q.add(str1);
            q.add(str2);
            System.out.println(str + " ");
        }
    }
    public static void main(String[] args) {
        generateBinaryNumbers(15);
    }
}