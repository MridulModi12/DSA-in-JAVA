import java.util.*;
public class print_numbers_1_to_10
{
    public static void main(String args[])
    {
        int counter = 1;
        while(counter <= 100000)
        {
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println();
    }
}