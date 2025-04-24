public class Q5_TowerOfHanoi {
    public static void towerOfHanoi(int n, String source, String helper, String destination) {
        if(n == 1) { //for 1 disk
            System.out.println("Shift disk " + n + " from " + source + " to " + destination);
            return;
        }
        towerOfHanoi(n-1, source, destination, helper); //shift n-1 from src to helpr
        System.out.println("Shift disk " + n + " from " + source + " to " + destination); //shifting of the single disk remaining at src to dest
        towerOfHanoi(n-1, helper, source, destination); //shift n-1 form hlpr to dest
    }
    public static void main(String[] args) {
        towerOfHanoi(2, "A", "B", "C");
    }
}