public class Q2_NumberInWords {
    public static void numberInWords(int n, String str) {
        if(n == 0) {
            System.out.println(str);
            return;
        }
        int dig = n % 10;
        if(dig == 0) {
            str = "zero " + str;
        }
        if(dig == 1) {
            str = "one " + str;
        }
        if(dig == 2) {
            str = "two " + str;
        }
        if(dig == 3) {
            str = "three " + str;
        }
        if(dig == 4) {
            str = "four " + str;
        }
        if(dig == 5) {
            str = "five " + str;
        }
        if(dig == 6) {
            str = "six " + str;
        }
        if(dig == 7) {
            str = "seven " + str;
        }
        if(dig == 8) {
            str = "eight " + str;
        }
        if(dig == 9) {
            str = "nine " + str;
        }
        numberInWords(n/10, str);
    }

    static String digits[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void printDigits(int number) {
        if(number == 0) {
            return;
        }
        int lastDigit = number % 10;
        printDigits(number/10);
        System.out.print(digits[lastDigit]+" ");}

    public static void main(String[] args) {
        numberInWords(1947, "");
        printDigits(1947);
    }
}
