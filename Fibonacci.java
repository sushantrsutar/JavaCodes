import java.util.Scanner;

public class Fibonacci {
   // Function to print the Fibonacci series up to n terms
    public static void printFibonacci(int n) {
        int a = 0; // First term of the Fibonacci series
        int b = 1; // Second term of the Fibonacci series
        int c = 1; // Third term of the Fibonacci series

        for (int i = 1; i <= n; i++) {
            System.out.print(a + ","); // Print the current term

            // Calculate the next terms in the series
            a = b;         // The current second term becomes the new first term
            b = c;         // The current third term becomes the new second term
            c = a + b;     // The new third term is the sum of the updated first and second terms
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int n = sc.nextInt();

        // Call the printFibonacci function to print the Fibonacci series
        printFibonacci(n);


   }
}
