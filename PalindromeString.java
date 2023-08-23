import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();

        String revstr = ""; // Initialize an empty string to store the reversed string

        // Loop to reverse the input string
        for (int i = str.length() - 1; i >= 0; i--) {
            revstr = revstr + str.charAt(i); // Build the reversed string
        }
        System.out.println(revstr);
        // Compare the original and reversed strings to determine if it's a palindrome
        if (str.compareTo(revstr) == 0) {
            System.out.println("String is a Palindrome");
        } else {
            System.out.println("String is NOT a Palindrome");
        }
    }
}
