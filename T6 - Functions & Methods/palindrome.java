import java.util.*;
public class palindrome {
    
    public static int reverse(int n) {
        int d, r = 0;
        while(n > 0) {
            d = n % 10;
            r = d + r * 10;
            n /= 10;
        }
        return r;
    }

    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();
        if(n == reverse(n)) {
            System.out.println(n + " is a palindrome number");
        } else {
            System.out.println(n + " is not a palindrome number");
        }
    }
}
