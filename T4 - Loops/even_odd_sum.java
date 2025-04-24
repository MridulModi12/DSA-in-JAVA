import java.util.*;
public class even_odd_sum
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n, even = 0, odd = 0, choice;
        do {
            System.out.println("Enter a number : ");
            n = sc.nextInt();
            if(n % 2 == 0) {
                even += n;
            } else {
                odd += n;
            }
            System.out.println("Do you want to continue? Press 1 for yes and 0 for no");
            choice  = sc.nextInt();
        } while(choice == 1);
        System.out.println("Sum of even numbers : " + even);
        System.out.println("Sum of odd numbers : " + odd);
    }
}