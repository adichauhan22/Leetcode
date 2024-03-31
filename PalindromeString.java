import java.util.*;

public class PalindromeString {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;

        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
            } else {
                count++;
                break;
            }
            i++;
            j--;
        }
        if (count == 0) {
            System.out.print(true);
        } else {
            System.out.print(false);
        }
    }
}
