import java.util.*;
public class _9_DuplicateParantheses {
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();
        int count;
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == ')') {
                count = 0;
                while(s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if(count < 1) {
                    return true;
                }
                s.pop();
            } else {
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // String str1 = "((a + b))";
        String str2 = "(a - b)";
        System.out.println(isDuplicate(str2));
    }
}