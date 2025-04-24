import java.util.*;
public class largest_of_3_numbers
{
    public static void main(String args[])
    {
        int A = 13,B = 4,C = 20;
        if( (A >= B) && (A >= C) ) {
            System.out.println("largest is A");
        }
        else if(B >= C) {
            System.out.println("largest is B");
        }
        else {
            System.out.println("largest is C");
        }
    }
}