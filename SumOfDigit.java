import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        System.out.println("enter the number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        while (n>0)
        {
            int digit=n%10;
            sum=sum+digit;
            n=n/10;
        }
        System.out.println("sum of digit = "+sum);
    }
}
