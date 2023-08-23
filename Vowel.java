import java.util.Locale;
import java.util.Scanner;

public class Vowel {
    public static boolean checkForVowel(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                return true; // Return true if a vowel is found
            }
        }
        return false; // Return false if no vowels are found after checking all characters
    }

    public static void main(String[] args) {
        System.out.println("Enter string:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase(Locale.ROOT);
        boolean containsVowel = checkForVowel(str);

        if (containsVowel) {
            System.out.println("Vowel present");
        } else {
            System.out.println("No vowel present");
        }
    }
}
