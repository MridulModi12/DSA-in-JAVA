import java.util.*;
public class _5_ReverseStack {
    public static void reverseStack(Stack<Integer> s) {
        if(s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        _3_PushAtBottomOfStack.pushAtBottom(s, top);
    }
    public static void printStack(Stack<Integer> s) {
        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reverseStack(s);
        printStack(s);
    }
}