
import java.util.*;
public class Encrypt_stringII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        if (input == null || input.isEmpty()) {
            System.out.println("Please enter a valid string");
            return;
        }

        StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < input.length()) {
            char currentChar = input.charAt(i);
            int count = 1;

            // Count consecutive characters
            while (i + 1 < input.length() && input.charAt(i) == input.charAt(i + 1)) {
                count++;
                i++;
            }

            // Append character and its count
            result.append(tohex(count)).append(currentChar);
            i++;
        }

        System.out.println(result.toString());
    }
    static String tohex(int n) {
        int neo=n;
        String hex="";
        while(neo>0)
        {hex=hex+(char)(neo%16+'0');
            neo=neo/16;}

        return hex;
    }

}