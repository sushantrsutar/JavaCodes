import java.util.Scanner;

public class CalculateDigit {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==0)
        {
            System.out.println("1");
        }
        int count=0;
        while (n!=0)
        {
            n=n/10;
            count++;
        }
        System.out.println("total digits= "+count);

    }
}
