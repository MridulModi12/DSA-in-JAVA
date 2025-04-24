import java.util.*;
public class if_else
{
    public static void main(String args[])
    {
        int age = 16;
        if(age>=18)
        {
            System.out.println("Adult: Can Vote, Can Drive");
        }
        if ((age>=13) && (age<18))
        {
        System.out.println("Teenager");
        }
        else
        {
            System.out.println("Not Adult");
        }
        
    }
}