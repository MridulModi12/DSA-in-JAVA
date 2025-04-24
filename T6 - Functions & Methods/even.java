import java.util.*;
public class even {

    public static boolean isEven(int n) {
        if(n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();
        if(isEven(n)) {
            System.out.println(n + " is an even nummber");
        } else {
            System.out.println(n + " is not an even nummber");
        }
    }
}
