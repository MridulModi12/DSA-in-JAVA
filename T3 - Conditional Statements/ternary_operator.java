import java.util.*;
public class ternary_operator
{
    public static void main(String args[])
    {
        int number = 239445;
        String type = ((number % 2) == 0) ? "Even" : "Odd";
        System.out.println(type);
    }
}