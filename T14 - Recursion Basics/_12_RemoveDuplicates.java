public class _12_RemoveDuplicates {
    public static void removeDuplicates(String str, int n, StringBuilder newStr, boolean map[]) {
        if(n == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(n);
        if(map[currChar - 'a'] == true) {
            removeDuplicates(str, n+1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicates(str, n+1, newStr.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        String str = "appnnnacollege";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}



//appnnna college