import java.util.Scanner;

class PrintPrimeNumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number :");
        int n = sc.nextInt();
        if (n > 1)
        {
            for (int i = 2; i <= n; i++)
            {
                boolean isPrime = true;
                for (int j = 2; j <= Math.sqrt(i); j++)
                {
                    if (i % j == 0)
                    {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime)
                {
                    System.out.print(i + " ");
                }
            }
        }
        else
        {
            System.out.println("enter greater then 1 ");
        }
    }
}