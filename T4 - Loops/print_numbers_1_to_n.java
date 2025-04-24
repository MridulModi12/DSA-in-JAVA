import java.util.*;
public class print_numbers_1_to_n
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int range = 1;
        while(range <= n)
        {
            System.out.print(range + " ");
            range++;
        }
        System.out.println();
    }
}