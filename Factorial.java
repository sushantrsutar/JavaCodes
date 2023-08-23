import java.util.Scanner;

public class Factorial {

    public static void printFatct(int n)
    {
        if(n<1)
        {
            System.out.println("enter +ve number");
        }
        else
        {
            int fact=1;
            for (int i=1;i<=n;i++)
            {
                fact=fact*i;
            }
            System.out.println("factorial of " +n+ " = "+fact);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        printFatct(n);
    }
}
