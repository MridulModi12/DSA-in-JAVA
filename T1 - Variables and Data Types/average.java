import java.util.*;
public class average
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter 1st number");
        a = sc.nextInt();
        System.out.println("Enter 2nd number");
        b = sc.nextInt();
        System.out.println("Enter 3rd number");
        c = sc.nextInt();
        float avg = (a+b+c)/3f;
        System.out.println("Average: "+ avg);
    }
}