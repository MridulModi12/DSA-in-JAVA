import java.util.*;
public class multiple_of_10
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        /*for(int i = 1; i>0; ) 
        {
            System.out.println("Enter a number");
            int n = sc.nextInt();
            if(n % 10 == 0) {
                break;
            }
        System.out.println(n);
        }
        System.out.println("I am out of the loop"); */
        do
        {
            System.out.println("Enter a number");
            int n = sc.nextInt();
            if(n % 10 == 0) 
            {
                break;
            }
            System.out.println(n);
        } while(true);
        System.out.println("I am out of the loop");
    }
}
    
