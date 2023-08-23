
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Rows and Coloum: ");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] arr=new int[row][col];
        System.out.println("enter the elemrnt in Array:");
        for (int i=0;i< arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("printing array Elements:");
        for (int i=0;i< arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
           System.out.println(" ");
        }
        System.out.println("enTer element for search:");
        int x=sc.nextInt();
        boolean found=false;
        for (int i=0;i< arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(x==arr[i][j])
                {
                    found=true;
                    System.out.println("element found at "+i+" "+j);
                   // break;
                }
            }
        }
        if(!found)
        {
            System.out.println("not found");
        }

    }

}
