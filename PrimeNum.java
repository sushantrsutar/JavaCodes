import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeNum {
    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        // Base cases: 0 and 1 are not prime
        if (n <= 1) {
            return false;
        }

        // 2 is a prime number
        if (n == 2) {
            return true;
        }

        // Check for factors up to n/2
        for (int i = 2; i <= n / 2; i++) {
            // If n is divisible by i, it's not prime
            if (n % i == 0) {
                return false;
            }
        }

        // If no factors found, n is prime
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=0;
        try {
            n = sc.nextInt();
        }catch (InputMismatchException e){
            System.out.println(e);
            return;
        }



        // Call the isPrime function and print the result
        System.out.println(isPrime(n));
    }
}
