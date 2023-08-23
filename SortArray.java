import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        int[] array = new int[5];
        System.out.println("enter 5 numbers");
        Scanner sc=new Scanner(System.in);// Initialize an array with unsorted elements
        for(int i=0;i<=array.length-1;i++)
        {
            array[i]=sc.nextInt();
        }
        Arrays.sort(array); // Use the Arrays.sort() method to sort the array in ascending order

        System.out.println(Arrays.toString(array)); // Print the sorted array using Arrays.toString()
    }
}
