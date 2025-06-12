public class _5_GridWays {
  public static int gridWays(int i, int j, int n, int m) {
    if(i == n-1 && j == m-1) {
      return 1;
    }
    if(i == n || j == m) {
      return 0;
    }
    
    int w1 = gridWays(i, j+1, n, m); //right choice
    int w2 = gridWays(i+1, j, n, m); //down choice
    return w1 + w2;
  }
  public static void main(String[] args) {
    int n = 3, m = 3;
    int ways = gridWays(0, 0, n, m);
    System.out.println("Total ways = " + ways);
  }
}
