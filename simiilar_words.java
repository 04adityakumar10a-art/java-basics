import java.util.*;
public class simiilar_words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string");
        String s = sc.nextLine();

        // Split the string into words
        String[] words = s.split("[ ,.]");

        // Check each word against remaining words
        for(int i = 0; i < words.length; i++) {
            int count = 0;
            for(int j = i + 1; j < words.length; j++) {
                if(words[i].equals(words[j])) {
                    count++;
                }
            }
            if(count >= 1) {
                System.out.println("Repeated word = " + words[i]);
            }
        }
    }

}
