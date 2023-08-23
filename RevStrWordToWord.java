//import java.util.Scanner;
//
//public class RevStrWordToWord {
//    // Method to reverse words in a string
//    public static String revWord(String input) {
//        // Splitting the input string into words using whitespace as delimiter
//        String[] words = input.split("\\s+");
//
//        // Building the reversed string
//        StringBuilder reversed = new StringBuilder();
//        for (int i = words.length - 1; i >= 0; i--) {
//            reversed.append(words[i]);
//            if (i != 0) {
//                reversed.append(" "); // Adding a space between words
//            }
//        }
//        return reversed.toString(); // Returning the reversed string
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the String:");
//        String input = sc.nextLine(); // Reading input from the user
//
//        // Calling the revWord method to reverse the words in the input string
//        String reversedString = revWord(input);
//
//        // Printing the reversed string
//        System.out.println("Reversed String: ");
//        System.out.println(revWord(input));
//    }
//}
public class RevStrWordToWord {
    public static void main(String[] args) {
        // Input string
        String str = "sushant sutar";

        // Splitting the input string into words using whitespace as delimiter
        String[] word = str.split("\\s+");

        // Building the reversed string
        StringBuilder splits = new StringBuilder();
        for (int i = word.length - 1; i >= 0; i--) {
            splits.append(word[i]);
            if (i != 0) {
                splits.append(" "); // Adding a space between words
            }
        }

        // Printing the reversed string
        System.out.println(splits);
    }
}
