import java.util.*;

public class StringDifference {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String modifiedString = insertAsciiDifferences(str);
        System.out.println(modifiedString); // Output: a2c-1b
    }

    public static String insertAsciiDifferences(String str) {
        if (str.length() <= 1) {
            return str;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length() - 1; i++) {
            result.append(str.charAt(i));
            result.append((int) str.charAt(i + 1) - (int) str.charAt(i));
        }
        result.append(str.charAt(str.length() - 1)); // Append the last character
        return result.toString();
    }
}
