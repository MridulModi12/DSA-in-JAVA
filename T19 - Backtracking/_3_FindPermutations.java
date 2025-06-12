public class _3_FindPermutations {
  public static void findPermutations(String str, String ans) {
    //base case
    if(str.equals("")) {
      System.out.println(ans);
      return;
    }

    for(int i = 0; i < str.length(); i++) {
      char curr = str.charAt(i);
      // String str = str.substring(0, i) + str.substring(i+1); //This is wrong, 
      // cuz then str.length of the current loop will change and we would not be able 
      // to traverse the full string length.
      String NewStr = str.substring(0, i) + str.substring(i+1);  //removing ith element
      findPermutations(NewStr, ans+curr);
    }
  }

  public static void main(String[] args) {
    findPermutations("abc", "");
  }
}